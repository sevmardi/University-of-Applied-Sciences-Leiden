package lineaire_lijst.lineaire_lijst_versie_2.niet_uitgewerkt;

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
	
	public Iterator iterator ()
	{
		return (new LijstIterator());
	}
	
	public void addFirst (Object o)
	{
		if(header == null)
    	{
			if(tail == null)
			{
				header = new Entry(o, null);
			}
			else
			{
				header = new Entry(o, tail);
			}
    	}
		else
		{
			if(tail == null)
			{
				tail = header;
				header = new Entry(o, header);
			}
			else
			{
				header = new Entry(o, header);
			}
			
		}
		size++;
	}

    public void addLast (Object o)
    {
    	if(tail == null)
    	{
    		if(header == null)
    		{
    			addFirst(o);
    		}
    		else
    		{
    			tail = new Entry(o, null);
    			header.next = tail;
    			size++;
    		}
    	}
    	else
    	{
    		Entry last = new Entry(o, null);
        	tail.next = last;
        	tail = last;
        	size++;
    	}
    }
	
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
		
		public int getSize()
		{
			return size;
		}
	}

	// inwendige klasse Entry
	private class Entry
	{
		Object element;
		Entry next;
		
		Entry (Object element, Entry next)
		{
			this.element = element;
			this.next = next;
		}
	}
}
