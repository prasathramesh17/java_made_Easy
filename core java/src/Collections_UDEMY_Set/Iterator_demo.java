package Collections_UDEMY_Set;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterator_demo {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		list.add("abc");
		list.add("def");
		list.add("xyz");
		
		ListIterator<String> itr = list.listIterator();   
		//hit [CTRL+1] (assign statement to local variable) TO ADD LOCAL VARIABLE
		
		//forward ->    //.hasNext()     //.next()
		System.out.println("Traversing the list in forward Direction: ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Backward->    //.hasPrevious()   //.previous()
		System.out.println("Traversing the list in backward Direction: ");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
