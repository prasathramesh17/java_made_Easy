package Section22_String_Handling;

public class String_Buffer_Demo {
//capacity() , append(), charAt(), reverse(), insert(), delete() 
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println("Intial capacity: "+ sb.capacity()); //16
		
		sb.append("all the power are within you");
		sb.append("you can do anything and everything");
		
		System.out.println(sb);
		
		System.out.println("Current capacity : "+ sb.capacity());  //70
		
		System.out.println("charAt:"+ sb.charAt(10));
		
		StringBuffer sb1 = new StringBuffer("abcde");
		
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.insert(3, "xyz"));
		System.out.println(sb1.delete(3, 6));
	}

}
