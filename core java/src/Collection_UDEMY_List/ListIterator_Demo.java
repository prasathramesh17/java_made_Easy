package Collection_UDEMY_List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Demo {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		list.add("abc");
		list.add("def");
		list.add("xyz");
		
		ListIterator<String> itr = list.listIterator(); //hit ctrl+1 assign local variable
		
		System.out.println("traveesing in forward direction:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Traversing in backward direction:");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
