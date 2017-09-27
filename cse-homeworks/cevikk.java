/*
 *Sema Çevik
 *150112077
 *homework1
 *cse161
 */

import java.util.Scanner;

public class cevikk {
 public static void main(String[] args){
 	
 		double x1,x2,y1,y2,h1,h2,w1,w2 ;
 		
 		Scanner input=new Scanner(System.in);
 		System.out.println("Please  \nEnter x coordinate of first rectangle");
 			x1=input.nextDouble();
 		System.out.println("Enter y coordinate of first rectangle");
 			y1=input.nextDouble();
 		System.out.println("Enter width of first rectangle");
 			w1=input.nextDouble();
 		System.out.println("Enter height of first rectangle");
 			h1=input.nextDouble();
 		System.out.println("Please  \nEnter x coordinate of second rectangle");
 			x2=input.nextDouble();
 		System.out.println("Enter y coordinate of second rectangle");
 			y2=input.nextDouble();
 		System.out.println("Enter width of second rectangle");
 			w2=input.nextDouble();
 		System.out.println("Enter height of second rectangle");
 			h2=input.nextDouble();
 			
 			if((x1>x2 && y1>=y2 && w1>=w2 && h1>=h2) ||//2. dikdörtgeni 1. dikdörtgenin içinde yapan durumlar
 				(x1>=x2 && y1>y2 && w1>=w2 && h1>=h2)||
 					(x1>=x2 && y1>=y2 && w1>w2 && h1>=h2)||
 						(x1>=x2 && y1>=y2 && w1>=w2 && h1>h2)||
 							(x1>x2 && y1<y2 && w1>w2 && h1>h2)
 						){
 							
 	System.out.println("r2 inside r1");
 	 
 						}
 		  	if((x1<x2 && y1<y2 && w1<w2 && h1<h2)||//2. dikdörtgenle 1. dikdörtgenin kesiþme durumlarý
 		  		(x1<x2 && y1<y2 && w1<w2 && h1>h2)||
 		  			(x1>x2 && y1>=y2 && w1<w2 && h1>h2)	)
 					{
 							
 	System.out.println("r2 overlaps r1");//kesiþmedikleri durumlar
 	 
 						}
 		if((x1<=x2 && y1<y2 && w1<w2 && h1<h2) ||
 				(x1<x2 && y1<=y2 && w1<w2 && h1<h2)||
 					(x1<x2 && y1<y2 && w1<=w2 && h1<h2)||
 						(x1<x2 && y1<y2 && w1<w2 && h1<=h2)
 						){
 							
 	System.out.println("r2 does not overlap r1");
 	 
 						}
 				if((x1==x2 && y1==y2 && w1==w2 && h1==h2)// ayný olduklarý çakýþýk dikdörtgen olduklarýný gösterir
 						){
 							
 	System.out.println("r2 same r1");
 	 
 						}
 }
    
    
    
}