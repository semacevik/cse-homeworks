/*SEMA ÇEVÝK HW3-3*/

import java.util.Scanner;

public class TimeConversion {

	public static String convertMillis(long millis) {
		long second = (millis / 1000) % 60;
		long minute = (millis / (1000 * 60)) % 60;
		long hour = (millis / (1000 * 60 * 60));

			String time =  Long.toString(hour)+ ":" + Long.toString(minute)+ ":"  + Long.toString(second);
		
		return time;		
	}
	
	
	public static void main(String[] args) {
		long millisec;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number to convert miliseconds: ");
		millisec = in.nextLong();

		String time = convertMillis(millisec);
		System.out.println("The time in the format hour:minute:seconds is: "+time);
		
	}

}
