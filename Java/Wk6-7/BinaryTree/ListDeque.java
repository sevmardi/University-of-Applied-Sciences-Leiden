package BinaryTree;

public class ListDeque {
	 private Lijst lijst; //variable voor lijst

	    public ListDeque()
	    {
	        lijst = new Lijst(); //nieuw object voor lijst
	    }

	    public void addFirst(Object o)
	    {
	        lijst.addFirst(o); //stop item in de deque
	    }

	    public void addLast(Object o)
	    {
	        lijst.addLast(o); //stop item achterin de deque in
	    }

	    public Object removeFirst()
	    {
	        return lijst.removeFirst(); //verwijder eerste item
	    }

	    public Object removeLast()
	    {
	        return lijst.removeLast(); // delete last
	    }

	    public Object getFirst()
	    {
	        return lijst.getFirst(); //vraag eerste op
	    }

	    public Object getLast()
	    {
	        return lijst.getLast(); //vraag laatste op
	    }

	    public int size()
	    {
	        return lijst.size();
	    }

	    public boolean isEmpty()
	    {
	        return lijst.isEmpty();
	    }
}
