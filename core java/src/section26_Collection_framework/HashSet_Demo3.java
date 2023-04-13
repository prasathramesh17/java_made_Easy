package section26_Collection_framework;

import java.util.HashSet;

import javax.annotation.processing.SupportedSourceVersion;

public class HashSet_Demo3 {

	public static void main(String[] args) {

		//UNION        //INTERSECTION      //DIFFERENCE
		
		HashSet <Integer> set1 = new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("HashSet 1 : "+ set1);    //1,2,3,4,5
		
		HashSet <Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		System.out.println("HashSet 1 : "+ set2);    //3,4,5
		
/*		//UNION
		set1.addAll(set2);
		
		System.out.println("Union :"+ set1);       //1,2,3,4,5
		
		//INTERSECTION
		set1.retainAll(set2);        //to filter common elements among two sets (set1 & set2)
		System.out.println("Intersection :"+ set1);   //3,4,5
*/		
		//DIFFERENCE
//		set1.removeAll(set2);
//		System.out.println("Difference :" + set1);        //1,2
//		
		//SUBSET              same as difference
		System.out.println(set1.containsAll(set2));         //true
		
		System.out.println("Subset :" + set1);
		
	}

}
