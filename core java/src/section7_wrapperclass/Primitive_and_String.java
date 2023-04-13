package section7_wrapperclass;

public class Primitive_and_String {

	public static void main(String[] args) {

		byte b = 120;                       //primitive type
		String s = Byte.toString(b);        //with help of wrapper class and .tostring()
		System.out.println(s);                // converted primitive to string
		
		
		int a =123256412;
		String i = Integer.toString(a);     //convert primitive to string
		int c = Integer.parseInt(i);       // convert string to primitive
		System.out.println(c);
		
	}

}
