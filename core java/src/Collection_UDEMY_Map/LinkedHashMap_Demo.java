package Collection_UDEMY_Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap_Demo {

	public static void main(String[] args) {

Map<String, Integer> map = new LinkedHashMap<>();   //insertion order is preserved(linkedhashmap)

		
		map.put("John", 70);       //put(key , value)  ->add entry into map
		map.put("Tom", 60);
		map.put("Lee", 99);
		map.put("Brad", 80);
		
		Set<String> keySet = map.keySet();            //ctrl+1 to create local variable
	  System.out.println("Keys:" + keySet);
	  
	  Collection<Integer> values = map.values();
	System.out.println("values: "+ values);
	
	for (String key : keySet) {
		System.out.println("key : " + key + " : values: " + map.get(key));
		                                            //get(key)//returns the value based on key
	}
	}

}
