package section26_Collection_framework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue();
		
		//->adding elements     add()    offer()
 
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");

		System.out.println(q); //A,B,C,C  [INSERTION ORDER IS PRESERVED AND ALLOWED DUPLICATES]
	
	   //->get head elements      element()    peek()
		
	//	System.out.println(q.element());  //A  (FIFO)    
		// RETURNS HEAD ELEMENT ,IF EMPTY RETURNS (NoSuchElementException)
		
	//	System.out.println(q.peek());     //A  (FIFO)
		// RETURNS HEAD ELEMENT ,IF EMPTY RETURNS (Null)
		
		
		//->return and remove element from queue   remove()    poll()
		
	//	System.out.println(q.remove());   //A
	//	System.out.println(q);            //B,C,C     HEAD ELEMENT IS REMOVED->A
		
	//	System.out.println(q.poll());     //
	//	System.out.println(q);
		
		//to read the elements in the queue (iterator method / for each loop is used )
		
		Iterator it = q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Object ele : q)
		{
			System.out.println(ele);
		}
	}

}
