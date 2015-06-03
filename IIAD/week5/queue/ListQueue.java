package week5.queue;

public class ListQueue implements Queue
{
	
	private Lijst lijst;

	public ListQueue()
	{
		lijst = new Lijst();
	}
	
	public void enqueue(Object o)
	{
		lijst.addLast(o);		
	}

	public Object dequeue()
	{
		return lijst.removeFirst();
	}

	public Object front()
	{
		return lijst.getFirst();
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
