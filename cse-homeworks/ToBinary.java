/*SEMA ÇEVÝK HW3-1*/

import java.util.Scanner;

public class ToBinary {



	public static String toBinary(int n) {
		String binary = "";
		int remainder;

		while(n>=2){
			remainder = n %2;
			n = (n-remainder)/2;
			binary = Integer.toString(remainder) + binary ;
		}

		if(n>=0) {
			binary = n + binary;
		}else
			System.out.println("Please enter positive integer !" );
		
		return binary;
	}



	public static void main(String[] args) {
		int decimal;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a decimal integer: ");
		decimal=in.nextInt();

		String binary = toBinary(decimal);
		
		if(binary != "")
			System.out.println("The binary value: " + binary);

	}

}
