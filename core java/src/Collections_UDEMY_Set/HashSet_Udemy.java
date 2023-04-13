package Collections_UDEMY_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Udemy {

	public static void main(String[] args) {

		Random obj = new Random();
		
		List<Integer> list = new ArrayList();  //list allows Duplicate
		                                       //insertion order is preserved
		for(int i =1; i<=10; i++)
		{
			int number = obj.nextInt(5);
			list.add(number);
		}
		
		System.out.println("List :" + list);
		
		
		
		Set<Integer> set = new HashSet<>(list);   //set doesn't allow duplicate
		System.out.println("Set:" + set);         //insertion order is NOT preserved
		                                          //allows one null value
		
		
		Set<Integer> Tset = new TreeSet<>(list);   //treeSet doesn't allow duplicate values
		System.out.println("TreeSet:"+ Tset);     // insertion order is preserved
		                                          //doesn't allow null values
		
		
	}

}
