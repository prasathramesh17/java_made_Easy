package section7_wrapperclass;

public class primitive_and_wrapper {

	public static void main(String[] args) {

		int x =100;                              //primitive type
		Integer y = Integer.valueOf(x);  //conversion of primitive to wrapper
		System.out.println(y);           //Integer.valueof(primitive_variable)
		
		int z = y.intValue();           // converting back wrapper to primitive
		System.out.println(z);          //y.intvalue()
	}

}
