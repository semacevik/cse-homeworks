//sema çevik hw6 150112077

import java.util.Scanner;
public class SmallestNumber{
	
	public static void main (String[] args){
	
	
		 Scanner input=new Scanner(System.in);
		  System.out.println("Enter a number between 1-15!");
		  int a=input.nextInt();
		  
		int[]number=new int[15];//created array length 15
		 number[0]=(int)(Math.random()*100);//randomly int number
		 number[1]=(int)(Math.random()*100);
		 number[2]=(int)(Math.random()*100);
		 number[3]=(int)(Math.random()*100);
		 number[4]=(int)(Math.random()*100);
	     number[5]=(int)(Math.random()*100);
		 number[6]=(int)(Math.random()*100);
		 number[7]=(int)(Math.random()*100);
		 number[8]=(int)(Math.random()*100);
		 number[9]=(int)(Math.random()*100);
		 number[10]=(int)(Math.random()*100);
		 number[11]=(int)(Math.random()*100);
		 number[12]=(int)(Math.random()*100);
		 number[13]=(int)(Math.random()*100);
		 number[14]=(int)(Math.random()*100);
		for(int i=0;i<number.length;i++)
		 System.out.print(number[i]+"\t");
		 
		 
		  System.out.println("\n"+"\n"+"--> "+findNthSmallestNumber(a,number));
	}
		  
public static int findNthSmallestNumber(int n, int[ ] number)	{ //from small to large ranking
		 
	   
		 	
for (int k=0;k<number.length;k++){
	for(int i=0;i<number.length-1;i++){
	  
	  
         if( number[k]>number[i+1] &&k<i+1 ){
             int temp=number[i+1];
             number[i+1]=number[k];
             number[k]=temp;
         
         }
         
	}
         }
         return number[n-1];//which is entered through a small number of print
}  

}	 		
		 		
		 		
		 		
		 		



	
	
		 	
		 	
             
       
 
 
		 
		
		
	

	
		
