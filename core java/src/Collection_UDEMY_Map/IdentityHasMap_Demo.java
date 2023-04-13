package Collection_UDEMY_Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHasMap_Demo {

	public static void main(String[] args) {

		Map<Integer, String> map = new IdentityHashMap<>();  //while using identity hash map everything will be printed
		
		//identity hashmap does not use the equals operator/ uses ==operator checks it has same key (not value) 
		
		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);
		map.put(id1, "Bharath");
		map.put(id2, "Sarath");
		
		System.out.println(map);  //prints the overriden value {10=sarath} //
		                           //after using identity hashmap everything is printed
	}

}
