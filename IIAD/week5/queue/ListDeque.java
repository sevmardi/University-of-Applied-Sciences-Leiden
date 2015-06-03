package queue;

public class ListDeque implements Deque
{
	
	private Lijst lijst;

	public ListDeque()
	{
		lijst = new Lijst();
	}

	public void addFirst(Object o)
	{
		lijst.addFirst(o);
	}

	public void addLast(Object o)
	{
		lijst.addLast(o);
	}

	public Object removeFirst()
	{
		return lijst.removeFirst();
	}

	public Object removeLast()
	{
		return lijst.removeLast();
	}

	public Object getFirst()
	{
		return lijst.getFirst();
	}

	public Object getLast()
	{
		return lijst.getLast();
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
