package section26_Collection_framework;

import java.util.ArrayList;
import java.util.List;
//generic comes in in the version 1.5
// generics are introduced to overcome -> TO PROVIDE TYPE SAFETY AND AVOID TYPE CASTING ISSUE
//using generics we can mention a particular datatype  //<>
//we cannot use primitive types inside the generics allows only object type(wrapper class)
public class Generics_Demo {

	public static void main(String[] args) {

		String[] s = new String[10];
		s[0] = "John";
		s[1] = "rob";
		
		List<String> l = new ArrayList<>();  //it provided type safety allows string type only
		l.add("John");
		l.add("rob");
		
	//	String name = (String)l.get(0);
	//	String name1 = (String)l.get(1);
	}

}
