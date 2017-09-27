import java.util.Scanner;
public class polygonArea{

	public static double polygonArea(int n,double s){//calculates polygon area //
	
	
		double area;
	    
		area=(n*s*s)/(4*Math.tan(Math.PI/n));
	
		return area;
	}
	public static void main(String args []){ //enter edge length of sides of the polygon enters//
		int n=3;
		double s=0;
		Scanner input=new Scanner(System.in);
	  	System.out.println("Enter the number of sides :");
		n=input.nextInt();
       	 
		
		System.out.println("Enter the sides: ");
		s=input.nextDouble();
		
		double area=polygonArea(n,s);
		System.out.println("Area is: "+ (area));
	}
}