package lineaire_lijst.lineaire_lijst_versie_2.niet_uitgewerkt;

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
       		System.out.println (iter.getSize());
	}
}
