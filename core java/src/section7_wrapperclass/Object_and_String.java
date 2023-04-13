package section7_wrapperclass;

public class Object_and_String {

	public static void main(String[] args) {

		long x = 10000;                //normal primitive
		
		Long y = Long.valueOf(x);      // converting primitive to object 
		
		String z = y.toString();       // converting object to string 
		
		Long l = Long.valueOf(z);      // converting back string to object
		
		int a = 99;
		int f = 456;
		Integer b = Integer.valueOf(a);   // primitive to object
			
		   int c = b.intValue();             // object to primitive
		
		String k = Integer.toString(f);    // primitive to string
		
		   int m = Integer.parseInt(k);        // string to primitive
		
		    String s = b.toString();          // object to string
		
		Integer i = Integer.valueOf(s);    //  string to object
		
	}

}
