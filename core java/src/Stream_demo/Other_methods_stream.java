package Stream_demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Other_methods_stream {

	public static void main(String[] args) {

		ArrayList<Integer> l1= new ArrayList<>();
		for(int i =0; i<=10;i++)
		{
			l1.add(i);
		}
		System.out.println(l1);
	//1.filter-collect
		List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(l2);
	//2.filter-count
	    long count = l1.stream().filter(i-> i%2 ==0).count();
	    System.out.println("number of even num in l1: " + count);
	    
	//3.using comparator
	    
	    Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);
	    
	    Integer max = l1.stream().max(comp).get();
	    System.out.println(max);
	    
	    Integer min = l1.stream().min(comp).get();
	    System.out.println(min);
	    
	    
	}

}
