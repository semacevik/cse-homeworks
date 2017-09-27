#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <dirent.h>
#include <malloc.h>
struct master{
	double scoreNumber;
	int totalReviews;
	struct master *left,*right;
	struct review *reviewPtr;
};

struct review{

int idNum;
int length;
int total;
char text[120];
struct review *nextPtr;
struct review *left, *right;
};

typedef struct master master;
typedef struct master* masterPtr;
typedef struct master** masterPtrPtr;

typedef struct review review;
typedef struct review* reviewPtr;
typedef struct review** reviewPtrPtr;

DIR *dir;
struct dirent *ent;
char *a,*b;
double score;
int id;
char *buffer[200];
DIR* dir;
struct dirent *ent;
FILE* fptr;
double av=0;
double t=0;
void insert( masterPtrPtr tree, double val)
{
   masterPtr temp = NULL;
    if(!(*tree))
    {
        temp =(master*)malloc(sizeof(master));
        temp->left = NULL;
		temp->right = NULL;
        temp->scoreNumber = val;
        temp->reviewPtr =NULL;
        temp->totalReviews=0;
       
        *tree = temp;
        return;
    }
    else if(val == (*tree)->scoreNumber){
   
    }
   else  if(val < (*tree)->scoreNumber)
    {
        insert(&(*tree)->left, val);
    }
    else if(val > (*tree)->scoreNumber)
    {
        insert(&(*tree)->right, val);
    }

}

masterPtr search(masterPtrPtr tree, double val)
{
    if(!(*tree))
    {
        return NULL;
    }

    if(val < (*tree)->scoreNumber)
    {
        search(&((*tree)->left), val);
    }
    else if(val > (*tree)->scoreNumber)
    {
        search(&((*tree)->right), val);
    }
    else if(val == (*tree)->scoreNumber)
    
    {
    	
        return *tree;
    }
    
}



void addReview(struct review **tree, int val)
{
   struct review *temp = NULL;
   
   
    if(!(*tree))
    {
        temp =(review*)malloc(sizeof(review));
        temp->left = temp->right = NULL;
        temp->idNum = val;
        temp->total=0;
        *tree = temp;
       ((*tree)->total)++;
        return;
    }
    
    if(val < (*tree)->idNum)
    {((*tree)->total)++;
        addReview(&(*tree)->left, val);
    }
    else if(val > (*tree)->idNum)
    {((*tree)->total)++;
        addReview(&(*tree)->right, val);
    }
    

}

void average(masterPtrPtr tree, double val){
	masterPtr temp;

		temp=*tree;
		if(	*tree==NULL){
       	
       		return ;
       	}

    if(temp->reviewPtr!=NULL){
       	av+=(temp->scoreNumber)*(temp->reviewPtr->total);
		t+=temp->reviewPtr->total;
}
		
        average(&((*tree)->left), val);
        average(&((*tree)->right), val);
    }

void print_preorderReview2(struct review **tree)
{
    if ((*tree)!=NULL)
    {
        printf("%d\n",(*tree)->idNum);
       
        print_preorderReview2(&(*tree)->left);
        print_preorderReview2(&(*tree)->right);
    }
   

}

void print_preorder(masterPtrPtr tree)
{
	if ((*tree)!=NULL)
    {
        printf("%3.2lf->\n",(*tree)->scoreNumber);
        
        if((*tree)->reviewPtr!=NULL){
        
        printf("\nTotal review:%d\n",(*tree)->reviewPtr->total);
        print_preorderReview2(&((*tree)->reviewPtr));
}
   
        print_preorder(&(*tree)->left);
        print_preorder(&(*tree)->right);
    }

}
void addScore( masterPtrPtr tree, double val)
{
   masterPtr temp = NULL;
  
    if(!(*tree))
    {
        temp =(master*)malloc(sizeof(master));
        temp->left = temp->right = NULL;
        temp->scoreNumber = val;
        temp->reviewPtr=NULL;
       temp->totalReviews=0;
       
        *tree = temp;
        return;
	}
	 
	
	else if( val == (*tree)->scoreNumber){
    
    printf("\n EXIST KEY!\n");
    return;
   }
  
  if(val < (*tree)->scoreNumber)
    {  
       addScore(&(*tree)->left, val);
    }
    else if(val > (*tree)->scoreNumber)
    {  
        addScore(&(*tree)->right, val);
    }
  

}
void showByWord(char *word)
{
  
    FILE *fp;
   	char temp[300];
	char *x,*y;
	if ((dir = opendir ("InputForProject2")) != NULL) {
  
  while ((ent = readdir (dir)) != NULL) {
    
	if((fp = fopen(ent->d_name, "r")) == NULL) {
	//	printf("Cannot open file.\n");
		
	}
	
	while(fgets(temp, 300, fp) != NULL) {
		if((strstr(temp, word)) != NULL) {
			x=strtok(ent->d_name,"_");
			y=strtok(NULL,"_");
			y=strtok(y,".");
			printf("\nid is that has %s word:%s\n\n",word,y);
			break;
		}
		
	}
          	
	
	if(fp){
		fclose(fp);
	}
    
  }
  closedir (dir);
} else {
  perror ("");
  return ;
}
    
}


void menu()
{
    printf("\n\n1) ADD A NEW SCORE\n");
    printf("******************\n");
    printf("2) SHOW LIST\n");
     printf("***********\n");
    printf("3) SEARCH WORD\n");
     printf("*************\n");
    printf("4) ADD A NEW REVIEW \n");
     printf("*******************\n");
    printf("5) CALCULATE AVERAGE\n");
     printf("*******************\n");
    printf("?????ENTER YOUR CHOICE?????: ");
}

int main(){
	masterPtr hedar=NULL;
	masterPtr hedar2=NULL;
	reviewPtr rev=NULL;
	DIR *dir;
struct dirent *ent;
int main(){
	
if ((dir = opendir ("InputForProject2")) != NULL) {
  /* print all the files and directories within directory */
  while ((ent = readdir (dir)) != NULL) {
    printf ("%s\n", ent->d_name);

  }
  closedir (dir);
} else {
  /* could not open directory */
  perror ("");
  return EXIT_FAILURE;
}

return 0;

}
 
	
	char temp[300];
	double score;
	int id;
	
	FILE *fp;
	if((fp=fopen("Order.txt", "r"))==NULL){
		return 0;
	}
	while((fgets(temp,300,fp))!=NULL){
		a=strtok(temp,"_");
		score=atof(a);

		b=strtok(NULL,"_");
		b=strtok(b,".");
		id=atoi(b);

		int x=0;
		insert(&hedar,score);
		
		masterPtr mast;
		if( mast = search(&hedar,score) ){
	    	addReview(&((mast)->reviewPtr),id);
	    
	    	
		}

	}

	if(fp) fclose(fp);
	
	
	int des;
	double score2;
	int idd;
	int total;
	while(1){
        menu();
        scanf("%d", &des);
        if(des == 1)
        {
            printf("\n\tEnter score-number: ");
            scanf("%lf", &score2);
            addScore(&hedar,score2);
            
            
           
        }        
        else if(des==2){
        	print_preorder(&hedar);
		
        }
          else if(des == 3)
        {
            printf("\n\tENTER THE WORD??\n ");
            scanf("%s", buffer);
             showByWord(buffer);
        }
         else if(des == 4)
        {
            printf("\n\tENTER ID?? ");
            scanf("%d", &idd);
            printf("\n\tENTER SCORE NUMBER?? ");
            scanf("%lf", &score2);
            
            masterPtr mast;
		if( mast = search(&hedar,score2) ){
			insert(&hedar,score2);
	    	addReview(&((mast)->reviewPtr),idd);
            printf("\n\tReview added to score.");
        }
        else printf("\n\t\t\tThis score not exist.");
          
             
            }
            
           else if(des == 5)
        {
        		average(&hedar,score2);
				printf("\n\ntotal review:%2.1lf\n\ntotal review*score:%3.1lf",t,av);
			printf("\n\nAVERAGE: %3.4f\n",av/t);
          
        }

           // showByWord(buffer);
        }
	}




 


