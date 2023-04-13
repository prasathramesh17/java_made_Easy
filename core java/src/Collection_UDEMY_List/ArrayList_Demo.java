package Collection_UDEMY_List;
//array list is imported from java.util.package
//by default it can store (10)elements
//*duplicate values are allowed in array list
//*insertion order should be preserved and maintained in the arraylist
// COLLECTIONS (class) ->java.util.package (provides methods to perform on collection object)
//you can use list interface(parent class/interface) instead of arraylist(child class)
//(list is an interface has classes-> arraylist & linkedlist)
//arraylist index value start with zero(0)
//we cannot store primitive values Bcoz arraylist is a collection can store only OBJECT 
//By converting to WRAPPER CLASS we can use integer values
//Ready made methods are available(to search/to get data etc,,)  
  //where as in array we need to implenent logic prgm no ready made method is available  
import java.util.ArrayList;


public class ArrayList_Demo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();  //using generics<>we can restrict data
		list.add(10);  //autoboxing
		list.add(30);
	//	list.add("hello");
		
		
	}

}
