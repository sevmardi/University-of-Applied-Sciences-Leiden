package WK2.Lijst_versie_3;
import java.util.*;

public class Lijst 
{
  private Entry header;
  private Entry first;
  private Entry last;
  private int size;

  // Constructor voor een lege lijst
  public Lijst() 
  {
    header = new Entry( null, null, null );
    header.next = header;
    header.previous = header;
  }
  
//-------------------------------------------------------------------------------------------
  // Object vooraan toevoegen
  
  public void addFirst( Object o ) 
  {
    addBefore( o, header.next );
  }

//-------------------------------------------------------------------------------------------
  // Object vooraan opvragen
 
  public Object getFirst() 
  {
	  if 	(header == null );
	  return header.element;
  }

//-------------------------------------------------------------------------------------------
  // Object vooraan verwijderen

  public Object removeFirst() 
  {
	  Object tmp = getFirst();
	  header = header.next;
	  return tmp;
  }
//-------------------------------------------------------------------------------------------
  //Inserts a new node to the end of this list.
/*  public void addlast(Object o)
  {
	  if (header ==null)
		  addFirst(o);
	  else
	  {
		  Node<Object> tmp = header;
		  while (tmp.next !=null)
		  {
			  
			  tmp = tmp .next;
			  
		  }
		
		  tmp.next = new  Node<Object>(o, null);
	  }
  }*/
//-------------------------------------------------------------------------------------------
/*  public Object getLast()
  {
	  if (header ==null)
	  {

		  // has to be fixed -> Node<AnyType> tmp = head;
	      while(tmp.next != null) tmp = tmp.next;

	      return tmp.data;
		  
	  }
	  
  }*/
//-------------------------------------------------------------------------------------------
  public Object removeLast()
  {
	  Entry tmp = last;
	  
	  if (first.next == null)
	  {
		  
		  first = null;
	  }
	  else{
		  
		  last.previous.next = null;
		  
	  }
	  last = last.previous;
	  return tmp;
  }
//-------------------------------------------------------------------------------------------
  // Aantal objecten in de lijst afleveren
  public int size() 
  {
    return size;
  }
//-------------------------------------------------------------------------------------------
  public boolean isEmptyy() {
		
	return header ==null;
	}
//-------------------------------------------------------------------------------------------
  // De lijst leegmaken
  //moet nog
  public void clear() 
  {
	  header = null;
  }
//-------------------------------------------------------------------------------------------
  // Lever een iterator voor de lijst
  
  public Iterator iterator() 
  {
    return new LItr();
  }

  // private methoden
//-------------------------------------------------------------------------------------------
  private void addBefore( Object o, Entry e ) 
  {
    Entry newEntry = new Entry(o, e, e.previous);
    newEntry.previous.next = newEntry;
    newEntry.next.previous = newEntry;
    size++;
  }
  
//-------------------------------------------------------------------------------------------
  
  private void remove( Entry e ) 
  {
    if( e == header )
      throw new NoSuchElementException( 
        "Kan Entry niet verwijderen: is header" );

    e.previous.next = e.next;
    e.next.previous = e.previous;
    size--;
  }

  ///////////////////////////////////////////////////// Inwendige klasse LItr////////////////////////////////////////////
  private class LItr implements Iterator 
  {
    private Entry pos = header;
  //-------------------------------------------------------------------------------------------
    public boolean hasNext() 
    {
      return pos.next != header;
    }
  //-------------------------------------------------------------------------------------------
    public Object next() 
    {
      pos = pos.next;
      return pos.element;
    }
  //-------------------------------------------------------------------------------------------
    public boolean hasPrevious() 
    {
      return pos.previous != header;
    }
    //-------------------------------------------------------------------------------------------
    public Object previous() 
    {
      pos = pos.previous;
      return pos.element;
    }
  } // Einde inwendige klasse LItr


  /////////////////////////////////////////// Inwendige klasse Entry////////////////////////////////////////////////
  private class Entry 
  {
    Object element;
    
    Entry next;
    Entry previous;

    Entry( Object element, Entry next, Entry previous ) 
    {
      this.element = element;
      this.next = next;
      this.previous = previous;
    }
  } // Einde inwendige klasse Entry

} // Einde klasse Lijst
	
