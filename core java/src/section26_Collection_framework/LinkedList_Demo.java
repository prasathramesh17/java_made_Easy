package section26_Collection_framework;

import java.util.Iterator;
import java.util.LinkedList;

//Linked list methods comes from list(I) and Deque(I)-> which is extended from queue(I)
//some special methods are used in linked list concepts
  //.addfirst(obj) .addLast(obj) .removefirst(obj) .removelast(obj) .getfirst(obj) .getlast(obj)
//using collections class sorting is possible only when we have same datatype objects(homogenous)
public class LinkedList_Demo {

	public static void main(String[] args) {

		//declare a linked list
		LinkedList l = new LinkedList();                    //to accept all datatypes (heterogenous type)
		//LinkedList<Integer> l = new LinkedList<Integer>();   //to accept integer values
		//LinkedList<String> l = new LinkedList<String>();       //to accept String values
	
		//add elements into linked list                    // obj_ref.add();
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('a');
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		
		System.out.println(l.size());   //6      //to find the no.of elements in list(size)
	
	    l.remove(3);                           // to remove the value present in index no 3               
	    System.out.println("After removing :" + l);
	
	    //same as arraylist methods can be used in linked list
	    //isEmpty()
	    //contais()
	    //get()
	    //set()
	    System.out.println("elements printed using iterator method: ");
	//iterator is a interface belong to parent interface of collections
//in arraylist we have a method called iterator method()
//.hasNext() from iterator checks the elements are present inside iterator variable
//.next() it will print the element from list and moves automatically to next till the condition satisfy
	    Iterator it = l.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	
	    // some special methods belongs to linked list
	    
	    l.addFirst("17");    //adding new first element in list
	    l.addLast("23");     //adding new last element in list
	    
	    System.out.println("after addfirst and addlast methods:"+l);
	    
	    System.out.println(l.getFirst());   //retriving the first element in list
	    System.out.println(l.getLast());    //retriving the last element in list
	    
	    l.removeFirst();                   //removing the first element from list
	    l.removeLast();                    //removing the last element from the list
	    System.out.println(l);
	    }

}
