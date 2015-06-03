package week5.queue;

public class TestQueueDeque
{
	  public static void main(String args[]) 
	  {
		  	
		  	ListQueue listqueue = new ListQueue();
		  
		  	listqueue.enqueue( "Een" );
		  	listqueue.enqueue( "Twee" );
		  	listqueue.enqueue( "Drie" );
		    
		  	System.out.println(listqueue.front().toString() + " is de eerste");
		  	System.out.println(listqueue.size() + " is het aantal");
		  	System.out.println(listqueue.dequeue() + " is verwijderd");
		  	System.out.println(listqueue.front() + " is de eerste");
		  	System.out.println(listqueue.size() + " is het aantal\n");
		  	
		  	ListDeque listdeque = new ListDeque();
			  
		  	listdeque.addFirst( "Een" );
		  	listdeque.addFirst( "Twee" );
		  	listdeque.addLast( "Nul" );
		  	listdeque.addFirst( "Drie" );
		  	listdeque.addLast( "MinEen" );
		    
		  	System.out.println(listdeque.getFirst() + " is de eerste");
		  	System.out.println(listdeque.getLast() + " is de laatste");
		  	System.out.println(listdeque.size() + " is het aantal");
		  	System.out.println(listdeque.removeFirst() + " is verwijderd");
		  	System.out.println(listdeque.removeLast() + " is verwijderd");
		  	System.out.println(listdeque.getFirst() + " is de eerste");
		  	System.out.println(listdeque.getLast() + " is de laatste");
		  	System.out.println(listdeque.size() + " is het aantal");
	  }
}
