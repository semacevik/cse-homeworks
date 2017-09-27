public class Palindromik{
	public static void main(String args[]){
		int value=100;
		int numberPerline=10;
		int i=1;
		int number=2;
		
		
			 while (i <= value) 
	        { 
	              if (isPrime(number) && isPalindrome(number)) //the number of prime and palindrome//
	              { 
	                 System.out.print(number + "  "); 
	                 if (i % numberPerline == 0) 
	                 System.out.println(" ");
	                 if(i%numberPerline==0)
	                 	System.out.println("____________________________________________________________________");
	                 	i++; 
	               }   
	              number++; 
	        }
	}
	    public static boolean isPrime(int num) //checks whether the prime num//
	    { 
	         if (num == 2) 
	           return true;
	        for (int divisor = 2; divisor <= num/2; divisor++) 
	        { 
	            if (num % divisor == 0) //If this condition is true, num isn't prime //
	               return false; 
	        } 
	        return true;// num is prime//
	    } 
	  
	    public static int inversion(int num) // the number of transactions for reserval//
	    { 
	        int k = 0; 
	        for (;num != 0;) 
	        { 
	              int s = num % 10; 
	               k= k * 10 + s; 
	              num = num / 10; 
	        } 
	        return k; 
	    } 
	      
	    public static boolean isPalindrome(int num) //check whether num is palindrome//
	    { 
	        return num == inversion(num); 
	    }

	
}