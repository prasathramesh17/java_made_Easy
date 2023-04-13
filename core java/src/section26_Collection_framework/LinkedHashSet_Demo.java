package section26_Collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_Demo {

	public static void main(String[] args) {

	//	HashSet lset = new HashSet();
		LinkedHashSet lset = new LinkedHashSet();
	//	LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		System.out.println(lset);
		
		//ALL THE METHODS OF HASHSET CAN BE USED WITH LINKED HASHSET
	}

}
