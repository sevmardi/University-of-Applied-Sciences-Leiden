package PostFixCalculator;

public interface Stack {

	
	/**
	 * Push places the given element on the top of the stack.
	 * @param element The object to be placed onto the stack.
	 */
	
	
	public void push(Object o);
	
	
	/**
	 * Pop removes the top element on the stack and returns it.
	 * @return The top element of the stack. Returns null if the stack is empty.
	 */
	
	public Object pop();
	
	
	/**
	 * Peek lets the user look at the topmost element on the stack, without removing it.
	 * @return The topmost element on the stack. Returns null if the stack is empty.
	 */
	
	public Object peek();
	
	/**
	 * Returns an integer containing the number of elements on the stack.
	 * @return An integer containing the number of elements on the stack.
	 */
	
	
	public int size();
	
	
	
	/**
	 * Lets the user know if the stack is empty or not.
	 * @return True if the stack is empty, false if it is not.
	 */
	public boolean isEmpty();
	
	
}
