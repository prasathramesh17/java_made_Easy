package section26_Collection_framework;

import java.util.HashSet;

public class HashSet_Demo2 {

	public static void main(String[] args) {

		HashSet<Integer> evenNumber = new HashSet<Integer>();
		//add()                         //direct value no index concepts
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		
		HashSet<Integer> number = new HashSet<Integer>();
		//addAll()         
		number.addAll(evenNumber);
		number.add(10);
		
		System.out.println("New Hashset :"+ number);    //2,4,6,10
		
		//removeAll()
		number.removeAll(evenNumber);
		System.out.println(number);
	}

}
