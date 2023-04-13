package section26_Collection_framework;
/*Set(I)->  usage -> SEARCHING OPERATIONS
           * insertion order is random(NOT PRESERVED AND MAINTAINED) 
           *  [NO INDEX CONCEPT IN SET]
        -> Duplicate values are (NOT ALLOWED)
        -> Hash Code concept(while adding elements in hashset)
          [search for a element is much faster becoz of hashcode]
        -> allows NULL values
        -> supports Heterogenius datatypes(different types of data) 
        -> elements are inserted and retrieved directly using [VALUE] not index no
Set(I)->  
 CLASSES ->  HASH SET (C)   [load factor / fill ratio concepts]
                         [by default has intial capacity value 16 , load factor value 0.75 ]                                                  
USE:            * frequently used in SEARCHING OPERATIONS
          searching of element is faster becoz of HASHCODE 
note:        *No index concept in set(  no proper order insertion) 
*/ 
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {

		HashSet hs = new HashSet();                    //default capacity 16 load factor 0.75
	//	HashSet hs = new HashSet(100);                 //intial capacity 100
	//	HashSet hs = new HashSet(100,(float)0.90);     //manual setting elements value & (type_cast)load factor value
	//	HashSet<Integer> hs = new HashSet<Integer>();  //while working with integer values
	//	HashSet<String> hs = new HashSet<String>();    //while working with String values
		
		//add objects/elements into HashSet
		hs.add(100);
		hs.add("welcome");
		hs.add(16.50);
		hs.add('A');
		hs.add(null);
		System.out.println(hs);
		
		//remove()
		hs.remove(16.50);
		System.out.println("after removing element :"+hs);
		
		//contains()                                       //true/false
		System.out.println(hs.contains(null));
		
		//for reading objects/elements from hashset for_each loop/ iterator() method is used
		
/*		for(Object O:hs)
		{
			System.out.println(O);
		}
*/		
		Iterator it = hs.iterator();
		while(it.hasNext())
			{
			System.out.println(it.next());
			}
	}

}
