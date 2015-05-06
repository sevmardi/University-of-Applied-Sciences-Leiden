import java.util.Scanner;

/**
 * Objective:  Program to calculate the sum of digits of a number.
 * @author zero-root
 *
 */
public class sumDigits {
	
	public static void main(String[] args) {
		
		int x, n;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter a number: ");
		n = scan.nextInt();
		x = sumDigits(n);
		System.out.printf("%d",x);
		
	}
	
	public static int sumDigits(int n)
	{
		int s= 0;
		while(n>0)
		{
			s = s+n%10;
			n = n/10;
		}
		return s;
	}
}
