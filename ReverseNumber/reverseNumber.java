import java.util.Scanner;

/**
 * Objective: Write a program to to reverse a number.
 * @author zero-root
 *
 */
public class reverseNumber {

	public static void main(String[] args) {
		int x, n;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter a number: ");
		n = scan.nextInt();
		x = reverse(n);
		
		System.out.printf("%d",x);
	}
	
	public static int reverse(int n)
	{
		int s = 0;
		while(n>0)
		{
			s= s* 10+ n%10;
			n = n/10;
		}
		return s;
	}
}
