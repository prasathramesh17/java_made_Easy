package section6_datatype_typecast_var;

public class Datatype_demo {

	public static void main(String[] args) {

		byte a = -50;
		short b = 150;
		int c = 10000;
		
		long d = 100000;
		char e = 'A';
		
		float f  = 145.54f;
		double g = 123456.6542;
	 
		byte h = 20; 
		
		byte result = (byte)(a+h);  //when you add two byte value it might go out of range so int is declared
	System.out.println(result);
	}

}
