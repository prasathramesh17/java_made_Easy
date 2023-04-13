package Section22_String_Handling;

public class String_Demo {
//String are represented as object of the class in java
//sequence of characters
//belongs to JAVA.LANG.STRING package
//provides some builtin methods like->
//length()  concat()  split() 
public static void main(String[] args) {

		String s1 = "six";
		
		String s2 = new String("seven");
		
		char c[] = {'a','b','c','d','e'};
		
		String s3 = new String(c);
		
		byte b[]= {67,68,69};
		
		String s4 = new String(b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);	
	}

}
