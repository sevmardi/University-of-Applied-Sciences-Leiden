package rijbewerkingen;

public class RijBewerkingen
{
	private char [] rij;
	
	
	// constructor
	public RijBewerkingen (char [] rij)
	{
		this.rij = rij;
	}
	
	
	// als target voor komt in de tabel dan wordt de index van target teruggegeven
	// als target niet voor komt dan wordt -1 teruggegeven.
	
	public int lineair_zoeken(char target)
	{
		for (int i = 0; i < rij.length; i++)
		{
		    if(rij[i] == target)
		    {
		    	return i;
		    }
		}
		return -1;
		//  nog maken ...
	}
	
	
	// als target voor komt in de gesorteerde tabel dan wordt de index van target 
	// teruggegeven; als target niet voor komt dan -1.
	
	public int binair_zoeken(char target)
	{
		// nog maken .. zie ook sheets week_1
		
		int top = rij.length-1;
		int bottom = 0;
		while (bottom <= top)
		{
			int mid = (top + bottom)/2;
			if (rij[mid] == target)
			     return (mid);
			else
			     if (rij[mid] > target)
			  	top = mid - 1;
			     else
			    bottom = mid + 1;			
		}
		return (-1);  	
	}	
	
	// de tabel wordt in oplopende volgorde gesorteerd
	// mbv de 'bubble-sort'-methode
	
	public void bubble ()
	{
		int ondgrens;
		int loper;
		for (ondgrens = 1; ondgrens < rij.length; ondgrens++)
		{
			for (loper = rij.length - 1; loper >= ondgrens; loper--)
			{
				if (rij[loper - 1] > rij[loper])
				{
				   char temp = rij[loper];
				   rij[loper] = rij[loper - 1];
				   rij[loper - 1] = temp;
					// verwissel rij[loper – 1] en rij [loper]
				}
			}
		}
	}
	
	
	
	public void print ()
	{
		for (int te = 0; te < rij.length; te++)
			System.out.print(rij[te] + "  ");
		System.out.println ("\n\n\n");
	}
	
}