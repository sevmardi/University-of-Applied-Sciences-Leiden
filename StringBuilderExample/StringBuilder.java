
/**
 * Objective: 
 * Write a method ..

public static int[] append(String[] a,String[] b)

that appends one array(of Strings) to another.
For example, if
a ={qqq www eee}
b ={ aaa, sss, ddd}

result ={qqq, www, eee, aaa, sss, ddd}


 * @author zero-root
 *
 */
public class StringBuilder {
	
	public static void main(String[] args)
	{
		String a[] = {"qqq", "www","eee"};
		String b[] = {"aaa", "sss", "ddd"};
		
		for(String j : (append(a,b))){
			System.out.println(j+" ");
		}
	}
	public static String[] append(String[] a, String[]b)
	{
		int i= a.length + b.length;
		
		String result[] =  new String[i];
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		
		return result;
	}

}
