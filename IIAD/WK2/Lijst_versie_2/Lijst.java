package WK2.Lijst_versie_2;
public class Lijst 
{
    private Entry header; 
    private Entry tail;
    
    private int size;

	
	public Lijst ()
	{
		header = null;
        tail = null;
        size = 0;
	}
	//----------------------------------------------------------------------------------------
	public Iterator iterator ()
	{
		return (new LijstIterator());
	}
	//----------------------------------------------------------------------------------------
	// moet nog
	public void addFirst (Object dd )
	{
		Entry  newLink = new Entry(dd);
		
        if(isEmptyy())				// if empty list
        	tail = newLink;			// newLink <-- tail
        newLink.next = header; 		// newLink -->old header
        header = newLink;			// header --> newLink
	}
	//----------------------------------------------------------------------------------------
	public boolean isEmptyy() {
		
		return header ==null;
	}
	//----------------------------------------------------------------------------------------
    public void addLast (Object dd)		// insert at the end of list
    {	
        Entry newLink = new Entry(dd);	// make a new object of Entry
        
        if (isEmptyy())					// if empty list, 
        	
        {					
        	header = newLink;			//header --> new Link
        }
        else
        {
        	tail.next = newLink;		// old last --> new link
        }
        tail = newLink;					// newLink <-- tail
        
    }
  //----------------------------------------------------------------------------------------
	// inwendige klasse LijstIterator
	private class LijstIterator implements Iterator
	{
	    Entry pos = header; // pos houdt de huidige positie bij in een lijstobject
		
		public boolean hasNext()
		{
			return (pos != null);
		}
		public Object next()
		{
			Entry temp = pos;
			pos = temp.next;
			return (temp.element);
		}	
	}
	
	//-----------------------------------------------------inwendige klasse Entry-----------------------------------
	
	private class Entry
	{
	public Object element;
	public	Entry next;
		
		public Entry (Object element)
		{
			this.element = element;
			
		}
	}
}
