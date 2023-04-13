package Collections_UDEMY_Set;

import java.util.Set;
import java.util.TreeSet;

import Collections_UDEMY_Comparator.StringComparator;

public class StringTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>(new StringComparator());
		set.add("abc");
		set.add("xyz");
		set.add("deedghhf");
		set.add("mno");
		
		for (String obj : set) {   // note: set(i) insertion is not preserved but treeset preserved
			                        //      :set(i) allows null values / but tre
		System.out.println(obj);	 //TreeSet ordered the string in the ascending order
		}
	}

}
