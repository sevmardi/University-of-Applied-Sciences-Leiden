import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Objective: write a program to calculate the prime factors of a number
 */
public class PrimeFactores {

	public static void main(String[] args) {
		int x;
		int n= 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = scan.nextInt();
		System.out.println("You've entered number: " + n);
		Pattern p = Pattern.compile("%d", n);
		
		
		primeFactores(n);
		
		//System.out.println("The primes are: " + );
	}
	
	//************************************************************************************************//
	public  static int primeFactores(int n)
	{
		int i =1 ;
		int k;
		while(i<=n)
		{
			if(n%i==0)
			{
				k = checkPrimes(i);
				System.out.printf("%d", k);
			}
			i++;
		}
		return 0;
	}
	
	//************************************************************************************************//
	
	public static int checkPrimes(int n)
	{
		int i = 1; 
		int c=0;
		 while(i<=n)
		 {
			 if(n%i == 0)
			 {
				 c++;
				 i++;
			 }
			 if(c==2)
				 
			 {
				 return n;	 
			 }
		 }
		 return 0;
	}
}
