//sema çevik 150112077 hw3


#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <time.h>
struct node{
	int data;
	struct node *nextPtr;
};
struct node *firstPtr;
struct node *list1=NULL;
struct node *list2=NULL;
struct node *mergedlist=NULL;
struct node *oddlist=NULL;
struct node *eventlist=NULL;
void insertSorted (int d){
	struct node *np;
	struct node *temp;
	struct node *prev=NULL;
	int found;
	np=(struct node*)malloc(sizeof(struct node));
	np->data=d;
	np->nextPtr=NULL;
	if(firstPtr==NULL){
		firstPtr=np;
		return;
	}
	temp=firstPtr;
	found=0;
	while((temp!=NULL)&&(!found)){
		if(temp->data<d){
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
	}
}
void display(struct node *a){
	struct node*np;
	np=a;
	while(np!=NULL){
		printf("%d ",np->data);
		np=np->nextPtr;
	}
}
void merged(struct node *list1,struct node *list2){
   
     printf("\n");
   firstPtr=list1;
	while(firstPtr->nextPtr!=NULL){
		firstPtr=firstPtr->nextPtr;
	}
	firstPtr->nextPtr=list2;
	list1=firstPtr;

    
}
void swap(struct node *a, struct node *b)
{
    int temp = a->data;
    a->data = b->data;
    b->data = temp;
}

int swapped, i;
    void Sort(struct node *start)
{
 
    /* Checking for empty list */
    if (firstPtr == NULL)
        return;
 
    do
    {
        swapped = 0;
        firstPtr = start;
 
        while (firstPtr->nextPtr !=mergedlist)
        {
            if (firstPtr->data > firstPtr->nextPtr->data)
            { 
                swap(firstPtr, firstPtr->nextPtr);
                swapped = 1;
            }
            firstPtr = firstPtr->nextPtr;
        }
        mergedlist=firstPtr;
    }
    while (swapped);
}
void even(struct node *list){
	struct node *temp;
	struct node *even=NULL;
	struct node *event=NULL;
	struct node *odd=NULL;
	temp=list;
	while(temp!=NULL){
		if(temp->data%2==0){
		
	   if(even==NULL){
	     even=temp;
	     event=temp;
	     temp=temp->nextPtr;
	    
    	if( temp->data%2!=0){
    		event->nextPtr=NULL;
    }
    	}
    	else{
    		event->nextPtr=temp;
    		event=event->nextPtr;
    		temp=temp->nextPtr;
    	     
			  	if(temp->data%2 !=0){
    			event->nextPtr=NULL;
    		}
    	}
}
else{
	if(odd==NULL){
		odd=temp;
		
		firstPtr=temp;
		temp=temp->nextPtr;
		
		if(temp->data%2==0){
			firstPtr->nextPtr=NULL;
		}
	}
	else{
		firstPtr->nextPtr=temp;
		firstPtr=firstPtr->nextPtr;
		temp=temp->nextPtr;
		if(temp->data%2==0){
			firstPtr->nextPtr=NULL;
			
	}
    }
   }
  }
eventlist=even;
oddlist=odd;

		

}



int main(){
	srand(time(NULL));
	int x;
	int i=0;
	for(;i<10;i++){
		x=rand()%40;
		insertSorted(x);
	}
	list1=firstPtr;
	firstPtr=NULL;
	
	for(i=0;i<10;i++){
		x=rand()%40;
		insertSorted(x);
	}
	list2=firstPtr;
	firstPtr=NULL;
	
	display(list1);
    printf("\n");
    display(list2);
    merged(list1,list2);
     Sort(list1);
     printf("\n");
    display(list1);
    even(list1);
     printf("\n");
    display(eventlist);
    printf("\n");
    display(oddlist);
	}


