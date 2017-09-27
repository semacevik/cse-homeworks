//sema çecik homework4 150112077
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
#include <time.h>

struct node{
	char userType;
	int pages;
	struct node *nextPtr;
};

struct node *firstPtr=NULL;
struct node *first=NULL;
struct node *sema=NULL;
struct node *temp;
struct node *nihal;
struct node *last=NULL;
struct node *ahmet;

void enqueue(char type, int p){
	struct node *np, *temp1, *prev=NULL, *prev1=NULL, *prev2=NULL, *temp2;
	int found;
	np=malloc(sizeof(struct node));
	np->nextPtr=NULL;
	np->userType=type;
	np->pages=p;
	if(np->userType=='P'){
		if(firstPtr==NULL){
			firstPtr=np;
			
			return;
		}
		temp=firstPtr;
		found=0;
		while((temp!=NULL)&&(!found)){
			if(temp->pages<p){
				prev=temp;
				temp=temp->nextPtr;
				
				
				
			}
			else{
				found=1;
			
			}
		}
		if(prev==NULL){
			np->nextPtr=firstPtr;
			firstPtr=np;
			
		}
		else{
			prev->nextPtr=np;
			np->nextPtr=temp;
			while(temp!=NULL){
				sema=temp;
				temp=temp->nextPtr;
	       }
		
		}
		
	}
	if(np->userType=='A'){
		if(first==NULL){
			first=np;
			return;
		}
		
		temp1=first;
		found=0;
		while((temp1!=NULL)&&(!found)){
			if(temp1->pages<p){
				prev1=temp1;
				temp1=temp1->nextPtr;
				
			}
			else{
				found=1;
			}
		}
		if(prev1==NULL){
			np->nextPtr=first;
			first=np;
			
		}
		else{
			prev1->nextPtr=np;
			np->nextPtr=temp1;
				while(temp1!=NULL){
				nihal=temp1;
				temp1=temp1->nextPtr;
	       }
		}
	}

	
		if(np->userType=='S'){
		if(last==NULL){
			last=np;
			return;
		}
		temp2=last;
		found=0;
		while((temp2!=NULL)&&(!found)){
			if(temp2->pages<p){
				prev2=temp2;
				temp2=temp2->nextPtr;
				
			}
			else{
				found=1;
			}
		}
		if(prev2==NULL){
			np->nextPtr=last;
			last=np;
			
		}
		else{
			prev2->nextPtr=np;
			np->nextPtr=temp2;
			while(temp2!=NULL){
				ahmet=temp2;
				temp2=temp2->nextPtr;
	       }
		}
	}

}
int dequeue(){
	struct node *np;
	int x=0;
	np=firstPtr;
	if(np==NULL){
		printf("No elemans in queue");
		return x;
	}
	firstPtr=firstPtr->nextPtr;
	x=np->pages;
	free(np);
	if(firstPtr==NULL){
	
    ahmet=NULL;
     printf("No elemans in queue");
}
   
	return x;
	
}
display() {
	struct node *np;
	np=firstPtr;
	while(np!=NULL){
		printf("%c,%d ",np->userType,np->pages);
		np=np->nextPtr;
	}
}


void main(){
	srand(time(NULL));
	int p,d,i;
	char c;
	for(i=0;i<50;i++){
		p=1+(rand()%20);
		d=rand()%3;
		switch(d){
			case 0:c='P'; break;
			case 1:c='A'; break;
			case 2:c='S'; break;
		}
		enqueue(c,p);
	}

    sema->nextPtr=first;
    nihal->nextPtr=last;
	display();
	
	printf("\n");
	for(i=0;i<50;i++){
		d=dequeue();
	}
	 
	display();
	


}
