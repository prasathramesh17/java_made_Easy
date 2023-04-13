package section6_datatype_typecast_var;

public class Type_cating_Explicit {  //manually we need to enter the datatype we want

	public static void main(String[] args) {

		int i = 100;                    //higher to lower
		byte b = (byte)i;
		System.out.println(b);
		
		int x = 97;             //convertrd into char value based on unicode conversion
		char c = (char)x;
		System.out.println(c);
		
		int y = 130;             //beyond the range upto 0 to 127 and then -128,-127,(-126)
		byte z = (byte)y;
		System.out.println(z);
		
		int m = 612;
		byte n = (byte)m;
		char o = (char)n;
		System.out.println(o);   // char o represents (d) where for the int value (100)
	}

}
