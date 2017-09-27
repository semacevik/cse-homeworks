/*sema çevik
 *homework2
 *cse161
 *150112077
 */
import java.util.Scanner;
public class Perfect{
	public static void main(String[]args){
		int sum=0;
		for(int num=2;num<10000;num++){
			sum=0;
			for(int j=1;j<num;j++){
				if(num%j==0){
					sum+=j;
				}
			}
		
	
		if(sum==num){
		System.out.println(num + " is a perfect number");
		System.out.println("_______________");
		}
		}
	}
}