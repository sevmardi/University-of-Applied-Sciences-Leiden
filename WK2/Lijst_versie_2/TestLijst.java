package Lijst_versie_2;
public class TestLijst
{
	
	public static void main(String[] args) 
	{
	   Lijst mijnLijst = new Lijst();

	   mijnLijst.addLast (new Werknemer ("Jan"));
       mijnLijst.addLast (new Werknemer ("Piet"));
	   mijnLijst.addFirst (new Werknemer ("Klaas"));
       mijnLijst.addFirst (new Werknemer ("Henk"));
   
       // nu de elementen benaderen met een iterator ..
       
       Iterator iter = mijnLijst.iterator();
       
       while (iter.hasNext())
    	  System.out.println (iter.next());  
	}
}
