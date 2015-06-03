package week5.queue;

public interface  Deque 
{
        public void addFirst ( Object o);
        public void addLast ( Object o);
        public Object removeFirst ();      
        public Object removeLast ();       
        public Object getFirst ();             
        public Object getLast ();             
        public int size();
        public boolean isEmpty();
}
