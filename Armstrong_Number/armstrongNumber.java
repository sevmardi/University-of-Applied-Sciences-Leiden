import java.util.Scanner;


public class armstrongNumber {
/**
 * Write a program to check given number is armstrong or not.
 * @param args
 */
	public static void main(String[] args) {
		int n,x;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = scan.nextInt();
		System.out.print("You've entered number: " + n);
		x=armstrong(n);
		if(x==n)
		{	
			System.out.println("it's arm baby");
		}
		else
			System.out.println("Not amrstrong");
	}
	
	public static int armstrong(int num)
	{
		int sum = 0; 
		int r;
		while(num!=0)
		{
			r = num%10;
			num=num/10;
			sum = sum+(r*r*r);
		}
		return sum;
	}


}
