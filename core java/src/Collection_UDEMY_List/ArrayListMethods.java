package Collection_UDEMY_List;
//COLLECTION-> is a group of object(not fixed in size/Growable)
//you can use list interface instead of arraylist
//(list is an interface used with arraylist & linkedlist)
//arraylist index value start with zero(0)
//we cannot store primitive values Bcoz arraylist is a collection can store only OBJECT 
//By converting to WRAPPER CLASS we can use integer values
//multiple ways to retrieve value and use & read data
        //(for loop/ for each loop/ iterator() method
//array to arraylist conversion:
  // ArrayList a1 = new ArrayList(Arrays.asList(array_variable))
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		
//creating object for a arraylist
		List<Integer> list = new <Integer>ArrayList ();   //working with integer values
	//	ArrayList<String> list = new ArrayList<String>();   //working with String values
	//	ArrayList list = new ArrayList();   //working with any datatype values

//ADDING elements to list  //ADD()
		for(int i = 10; i<=100;i=i+10) {
			list.add(i);                  
		}
		System.out.println("list:"+ list);  //o/p [10,20,30,40,50,60,70,80,90,100]
		
//(adding one more element)	for already existing list  //ADD(indx_no , value)
	        
		list.add(2, 100);          
		System.out.println("list after insert:" + list);
		                              //o/p[10,20,100,30,40,50,60,70,80,90,100]
		
//to REPLACE an already existing value from list  //SET()
		
		list.set(3, 200);
		System.out.println("list after replacement :" + list);
//creating another arraylist		
		List<Integer> secondlist = new ArrayList<Integer>(); 
		secondlist.add(111);
		secondlist.add(222);
		secondlist.add(333);
		System.out.println("second list:" +secondlist);
		
                                               //(adding FROM secondlist TO list)
//adding elements from another arraylist 
//addAll(index_no , another_arraylist)   
		list.addAll(4, secondlist);          //from index 4 begin to add value from secondlist
		System.out.println("after adding from both list: " +list);
 
//CONTAINS()  checks whether the value is present in list or not(search process)
		if(list.contains(222)) {
			System.out.println("list has value");
		}else {
			System.out.println("list does not have value");
		}

//SIZE()   to show the list size (no.of elements in the existing list mentioned)
		System.out.println(list.size());
		
//GET()  to retrieve the elements value from a particular list
		System.out.println("elements in the list are: ");
		for(int i = 0;i<list.size();i++ ) {
			System.out.println(list.get(i));   //elements in the list alone gets printed
		}
		
//REMOVE()  to delete the element from the list by mentioning the element index no only[no value should be mentioned directly]
		
		list.remove(3);
	//	Collections.sort(list);  //this is used to sort the list in ascending order
	//	Collections.shuffle(list); //this is used to shuffle the list
	//  Collections.sort(list,Collections.reverseOrder());  // sort in reverse order
 		System.out.println("list after deletion :" + list);   //element at index 3 (200 is removed)
		
		
//ISEMPTY()  checks whether the list has value or empty RETURNS BOOLEAN VALUE(true/false)
		
		System.out.println(secondlist.isEmpty());   //false becoz list has elements in it not empty
	}
//using ITERATOR() METHOD  (iterator comes with collection framework)
/*	Iterator it = list.iterator();   
	while(it.hasNext())
	{
		System.out.println(it.next());  
	}
	*/

}
//iterator is a interface belong to parent interface of collections
//in arraylist we have a method called iterator method()
//.hasNext() from iterator checks the elements are present inside iterator variable
//.next() it will print the element from arraylist and moves automatically to next till the condition becomes false