package week6.knoop;


public class KnoopQueue implements Queue
{

	private Lijst lijst;

	public KnoopQueue()
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
