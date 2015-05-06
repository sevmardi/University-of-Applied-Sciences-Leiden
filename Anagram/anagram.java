import java.util.Scanner;

/**
 * Objective: An anagram is a word made by transposing the letters of another word;
 *  for example, "software" is an anagram of "swearoft".Write a program that figures out whether one string is an anagram of another string.
 * @author zero-root
 *
 */
public class anagram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str= scan.next();
		
		System.out.println("Enter the shuffled String: ");
		String str2=  scan.next();
		
		char c = 0;
		boolean flag = false;
		for(int i =0;i<str.length() && str.length() == str2.length();i++)
		{
			c = str.charAt(i);
			if(str2.contains(Character.toString(c)))
			{
				flag = true;
			}
			else
			{
				flag = false;
				break;
				
			}
		}
		
		if(flag)
		{
			System.out.println("it's a anagram..! ");
			
		}
		else
		{
			System.out.println("it's not an angram..! Too Bad, little brother");
		}
	}
}
