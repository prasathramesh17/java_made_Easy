package Section22_String_Handling;

public class String_Pooling {
//String pooling happens as long you use the same content for a particular String 
	public static void main(String[] args) {

	//	User user1 = new User(1,"abc");  (for object it will print the references)
		                              //EX. classname.objname@45478
	//	System.out.println(user1);
		
		String s1 = "abc";                //for string object it will print value
		String s2 = "xyz";                  // EX. abc / xyz
		String s3 = "abc";
		System.out.println(s1.hashCode());    //.hashcode helps to find the memory location
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		String s4 = new String("abc");  //when ever new keyword is used new memory address is created
		
//String comparison(==)  (.equals() method)
		//compares whether the content of the string are same
		System.out.println(s1==s3); 
		
		//compares s1 and s3 and checks content -> .equals() is CASE SENSITIVE  
		System.out.println(s1.equals(s3));
		
		System.out.println(s3==s4);  //content are same but bcoz of new memory allocation in s4(false)
		
	}

}
