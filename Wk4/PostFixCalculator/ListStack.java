package PostFixCalculator;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class ListStack implements Stack 
{

	
	LinkedList stack;
	
	
	public ListStack()
	{
		
		stack = new LinkedList();
		
	}
	
	@Override
	public void push(Object o) {
		
		System.out.println("Added:"+o);
		stack.addLast(o);	
	}

	@Override
	public Object pop() {
		if(isEmpty())
			throw new EmptyStackException();
		
		System.out.println("Removed:"+stack);
		return stack.removeLast();
	}

	@Override
	public Object peek() {
		
		if(isEmpty())
			throw new EmptyStackException();
		
		System.out.println("Got:"+stack.getLast());
		return stack.getLast();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return  stack.size();
	}

	@Override
	public boolean isEmpty() {
		
		if(stack.isEmpty())
			return true;
		return false;
	}

}
