package Stream_demo;
//stream is a interface -> from collection 
//filtering
//Map
//processing -> collect(), count(), sorted(), min(), max(),

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Filter_Even_Number {

	public static void main(String[] args) {
	
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
		
		*/
		//using arraylist
	ArrayList<Integer> l1= new ArrayList<>();
	for(int i =0; i<=18;i++)
	{
		l1.add(i);
	}
	System.out.println("given number is" + l1);
/*
	ArrayList<Integer> l2= new ArrayList<>();
	for (Integer i : l1) {
		if(i%2==0)
			l2.add(i);
	}
	System.out.println(l2);
*/
	//filter using streams 
//	1.config filter 2.lamda exprn ->  3.collect 4.collectors.tolist()
	List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
	
	System.out.println("filtered number is " + l2);
}
}