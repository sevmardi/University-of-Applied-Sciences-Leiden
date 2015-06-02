package BinaryTree;

public class ListQueue {
	 private Lijst lijst; //variable voor lijst

	    public ListQueue()
	    {
	        lijst = new Lijst(); //in constructor maak nieuw object aan voor lijst
	    }

	    public void enqueue(Object o)
	    {
	        lijst.addLast(o); //stop item in de queue
	    }

	    public Object dequeue()
	    {
	        return lijst.removeFirst(); //haal item uit de queue
	    }

	    public Object front()
	    {
	        return lijst.getFirst(); //vraag het item vooraan op, wij voegen van achteraan in dus vooraan is het eerste item
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
