import java.util.Scanner;


/**
 * Objective: Program to calculate the factorial of a number:
 * @author zero-root
 *
 */
public class FactorialOfANumber 
{
	public static void main(String[] args) {
		int x, n;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter a number: ");
		n = scan.nextInt();
		x = fact(n);
		System.out.printf("%d",x);
	}
	
	public static int fact(int n )
	{
		int f = 1;
		while(n>0)
		{
			f = f*n;
			n--;
		}
		return f;
	}
}
