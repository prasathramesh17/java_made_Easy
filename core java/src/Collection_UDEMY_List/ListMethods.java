package Collection_UDEMY_List;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		for(int i = 10; i<=100; i+=10) {
			list.add(i);                       //add()
		}
		System.out.println("List after adding:" +list);
		
		list.add(2, 25);         //in between insert           //add(index no , value)
		System.out.println("List after adding element in between:"+ list);
		
		list.set(3, 200);          //replacing           //set(index no , value)
		System.out.println("List after replacing 30 to 200:"+list);
		
		// another list creation to perform addAll() and contains()
		List<Integer> list2 = new ArrayList<>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		System.out.println("second list: "+list2);
		
	// addAll() 2 types 
//[direct collection name] (after the first list ends second list will be added)
//[index , collection name] (at the specified index num second list will start to add elements
	
		list.addAll(4, list2);
		System.out.println("first list after addAll() from list2:" + list);
		
	   if(list.contains(222)) {          //searching    //contains(value)  //returns boolean value
		   System.out.println("list has the value: TRUE");
	   }else {
		   System.out.println("list doesn't have the value: FALSE");
	   }
	   
	                                     //to retrieve all elements    //get()
	   for(int i =0; i<list.size();i++) {
		   System.out.println(list.get(i));
	   }
		
	}

}
