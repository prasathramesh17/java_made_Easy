package Section22_String_Handling;

public class String_Comparison {
//while comparing with object reference result may change upon->memory address or content 
	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "abc";
		String s4 = new String ("abc");
		
		// String comparison(==) (.equals() method)
		// compares whether the content of the string are same
		System.out.println(s1 == s3);

		// compares s1 and s3 and checks content -> .equals() is CASE SENSITIVE
		System.out.println(s1.equals(s3));

		System.out.println(s3 == s4); // content are same but bcoz of new memory allocation in s4(false)

	}

}
