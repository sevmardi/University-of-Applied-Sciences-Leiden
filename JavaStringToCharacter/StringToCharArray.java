import java.util.Scanner;


/**
 * Objective:Write a JAVA Program which accepts text of words seperated by commas and gives the output of words printed on seperated lines with commas removed.

 * @author zero-root
 *
 */
public class StringToCharArray {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter the text: ");
		
		String line = new String();
		// converting to char arry 
		
		line = input.nextLine();
		
		stringToCharArray(line);
		
	}
	
	public static String stringToCharArray(String n)
	{
				
		char[] words = n.toCharArray();
		
		// printing output 
		
		for(int i =0; i<words.length;i++)
		{
			if(words[i] == ',')
				System.out.println();
			else
				System.out.println(words[i]);
		}
		return n;
			
	}
}
