import java.util.Scanner;


public class tempConversion {
	public static void main(String[] args) {
		
		// reading the temp 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temp in : ");
		String str= input.next();
		
		// calculating Farenheit temp
		float f = 0; 
		float celsius = Float.parseFloat(str);
		f = celsius*1.8f + 32;
		
		// showing output 
		
		System.out.printf( "Farenhiet temp = " + f);
	
		System.exit(0);
		
	}
}
