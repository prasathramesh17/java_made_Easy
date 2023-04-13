package Section22_String_Handling;

public class Immutable_String {

	//JVM prints the value of the object not references
	//we cannot change the value of the immutable object but want to re-assign value of obj
	public static void main(String[] args) {

/*		String s = new String("Bharath");
		System.out.println(s);
		
		Integer i = new Integer(30);
		System.out.println(i);
*/
		
		String s1 = "Hello";               //s1 and s2 are immutable
		String s2 = "World";
		                                  //\n =nextline
		System.out.println("Before concat :"+ "\ns1:" +s1 + "\ns2:" +s2);
		
		s1 = s1.concat(s2);               //while concat JVM will create a new string helloworld
		                                    //in memory
//but hello world is not assigned by an object 
//(if didnt assign new variable for concat operation after smetime it will be garbage collected
		
		System.out.println("After concat :"+ "\ns1:"+s1+ "\ns2:"+s2);
		
	}

}
