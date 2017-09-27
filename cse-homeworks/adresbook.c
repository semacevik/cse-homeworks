//sema �evik 150112077
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

struct AdDef {		//Telefon bilgilerini tutan yap�
	char adivesoyadi[50];
	char adres[200];
    char telnum[12];
	
	struct AdDef *sonraki;	//Listedeki bir sonraki yap�y� g�steren i�aret�i
} *_baslangic;		//Listenin ba�lang�� adresini tutar
typedef struct AdDef AdDef;

void kisiOku(AdDef *node, FILE *dosya)	//Dosyadan ki�i bilgisi okur
{
	fgets(node->adivesoyadi, 50, dosya);	// Sat�r� okur ve ilk parametrede g�sterilen yere yazar
    fgets(node->adres, 500, dosya);
	fgets(node->telnum, 12, dosya);

	node->adivesoyadi[strlen(node->adivesoyadi) - 1] = '\0';	//Beklenmedik karakter d�n���m�
	node->adres[strlen(node->adres) - 1] = '\0';
	node->telnum[strlen(node->telnum) - 1] = '\0';

}

void defteriOku()	//Dosyay� okur, her ki�i i�in bir d���m olu�turup bilgileri
{					//saklar ve d���mleri birbirine ba�lar
	AdDef *node;
	FILE *dosya = fopen("telefon defteri.txt", "r");
	if(!dosya)
		return;
	
	if(fgetc(dosya) == '~') {	
		_baslangic = node = (AdDef *) malloc(sizeof(AdDef));	/* �lk ki�i i�in
		yer ayr�l�r ve ba�lang�� adresi olarak kaydedilir.*/
		
		kisiOku(node, dosya);
	}
	else {
		fclose(dosya);	
		return;
	}
		
	while(fgetc(dosya) == '#') {	/*Devam eden ki�iler i�inde yer ayr�l�r ve
		nodelara kaydedilir*/
		
		node->sonraki = (AdDef *) malloc(sizeof(AdDef));
		node = node->sonraki;
		kisiOku(node, dosya);
	}
	node->sonraki = NULL;
	fclose(dosya);
}

bool yeniKisiEkle(AdDef *kisi)	//Eklenecek yeni ki�i i�in d���m olu�turur ve
{								//hem belle�e hem de dosyaya yazar.
	AdDef *node = _baslangic;
	FILE *dosya = fopen("telefon defteri.txt", "a");
	if(!dosya)
		return false;
		
	
	fprintf(dosya, "~%s\n", kisi->adivesoyadi);
    fprintf(dosya, "%s\n", kisi->adres);
	fprintf(dosya, "%s\n", kisi->telnum);
	
	fclose(dosya);
	
	if(node) {
		while(node->sonraki)	//Listenin sonuna gelene kadar devam et
			node = node->sonraki;
		node->sonraki = (AdDef *) malloc(sizeof(AdDef));
		node = node->sonraki;
	}
	else	//Liste bo� ise ilk d���m
		_baslangic = node = (AdDef *) malloc(sizeof(AdDef));
	node->sonraki = NULL;
	
	strcpy(node->adivesoyadi, kisi->adivesoyadi);
	strcpy(node->adres, kisi->adres);
	strcpy(node->telnum, kisi->telnum);

		
	return true;
   }

char* AddressSearch(char adi[])	//Ad ve soyada bakarak 
{
	AdDef *node = _baslangic;
	while(node) {
		if(!strcmp(adi, node->adivesoyadi))
			return node->adres;
		node = node->sonraki;
	}
	
	return NULL;
}

void dokumAl()	//B�t�n listeyi yazd�r�r
{
	AdDef *node = _baslangic;
	if(!node)
		printf("\nListe bos!\n");
		
	while(node) {
		printf("%s\n%s\n%s\n\n", node->adivesoyadi,node->adres, node->telnum);
		node =node->sonraki;
	}
}

int main()
{
	char ch, *address;
	AdDef kisi;
	
	defteriOku();	//Bunu mutlaka �a��r�yoruz
	do {
		fflush(stdin);
		printf("\n1Add new person:\n2Find Address:\n3List\n0EXIT:\n");
		ch = getchar();
		
		if(ch == '1') {
			fflush(stdin);
			printf("NEW PERSON\nName and Surname: ");
			gets(kisi.adivesoyadi);
				printf("Address: ");
			gets(kisi.adres);
			printf("Telephone Number: ");
			gets(kisi.telnum);
			
			
			if(yeniKisiEkle(&kisi))
				printf("\nADD PERSON\n");
			else
				printf("\nNOT ADD PERSON!\n");
		}
		
		if(ch == '2') {
			fflush(stdin);
			printf("Searching person\nName and Surname: ");
			gets(kisi.adivesoyadi);
		
			address = AddressSearch(kisi.adivesoyadi);
			if(address)
				printf("\nAddress: %s\n", address);
			else
				printf("\nThere is no person!\n");
		}
		
		if(ch == '3')
			dokumAl();
	} while(ch != '0');

	return 0;
}



