package section6_datatype_typecast_var;
//process of converting one datatype into another datatype 
// two types ( widening type cast  / narrowing type cast  )
// implicit conversion (small to big) / explicit conversion (big to small)
public class Type_casting_implicit {  //implicit will take place automatically

	public static void main(String[] args) {

		byte b = 121;            //lower to higher
		int i = b;
		System.out.println(i);
		
		char c = 'A';             //char value to int value
		int x = c;                 //bcoz of typecasting it gives a value of 65
		System.out.println(x);
	}

}
