/*sema çevik
 *homework2
 *cse161
 *150112077
 */
import java.util.Scanner;
public class MaxNumber{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int number=1;
		int max=0;
		int sema=0;
		
		for(;number!=0;){
			System.out.println("Enter a number");
			number=input.nextInt();
			if(number>max)
				max=number;
				if(max==number)
					sema++;
				
					
					
		} System.out.println("max= " + max +"  "+sema+"  times");
	}
}