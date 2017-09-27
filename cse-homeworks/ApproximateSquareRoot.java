/*SEMA ÇEVÝK HW3-2*/

import java.util.Scanner;

public class ApproximateSquareRoot {

	public static double sqrt(long n) {
		double lastGuess = n;
		double nextGuess = 0;

		while (nextGuess != lastGuess) {
			nextGuess = lastGuess;
			lastGuess = (lastGuess + n / lastGuess) / 2;
		}

		return lastGuess;
	}


	public static void main(String[] args) {
		long number;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a long number: ");
		number = in.nextLong();

		if(number>0) {
			double squareRoot = sqrt(number);
			System.out.println("The calculated square root is:  "+ squareRoot);
		}else
			System.out.println("Please enter positive number!");


	}


}
