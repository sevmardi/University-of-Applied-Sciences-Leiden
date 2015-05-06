import java.util.Scanner;
/**
 * Objective: Program to check the number is strong number or not
 * @author zero-root
 *
 */

public class strongNumber {
public static void main(String[] args)
{
	int x, n;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number: ");
	n = scan.nextInt();
	x = strong(n);
	if(x==n)
	{
		System.out.println("Strong!! ");
	}
	else
	{
		System.out.print("NOT STRONG..! ");
	}
	
	
	
}
public static int strong(int n)
{
	int s = 0; 
	int r,f;
	while(n>0)
	{
		r = n%10;
		f = fact(r);
		s = s+f;
		n = n/10;
	}
	return s;
}
public static int fact(int n)
{
	int f= 1;
	while(n>0)
	{
		f = f*n;
		n--;
	}
	return f;
	
}
}
