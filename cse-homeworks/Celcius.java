/*sema çevik
 *homework2
 *cse161
 *150112077
 */
public class Celcius{
	public static void main(String[] args){
		double Fah=0.0;
		int a=0;
		while(a<=20){
				Fah=(9.0/5.0)*a+32.0;
			System.out.println(a+" "+"Celcius = "+Fah+" Fah");
			System.out.println("_______________________");
			a++;
		}
	}
}