package Section22_String_Handling;

public class String_Methods {
// length() , indexof(), charAt(), substring(begin_value) , split(), replace(), 
	  // touppercase() , tolowercase()
	
	public static void main(String[] args) {

		String s = "karthick";
		String v = "pavilion hp";
		
		System.out.println("Length of the string is :"+ s.length());
		
		System.out.println("index of :" + s.indexOf('r'));
		
		System.out.println("charAt:"+ s.charAt(3));
		
		System.out.println(s.substring(1));
		
		System.out.println(s.substring(0, 3));
		
		String[]result = s.split("t");
		for (int i =0;i<result.length;i++) {
		System.out.println(result[i]);
		}
		
		System.out.println(v.trim());   //removes white space
		System.out.println(s.replace('k', 'v'));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}

}
