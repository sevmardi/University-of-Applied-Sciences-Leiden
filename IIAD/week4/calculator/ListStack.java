package  week4.calculator;

public class ListStack implements Stack
{

	private Lijst lijst;
	
	public ListStack()
	{
		lijst = new Lijst();
	}
	
	public void push(Object o)
	{
		lijst.addFirst(o);
	}

	public Object pop()
	{
		return lijst.removeFirst();
	}

	public Object peek()
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
