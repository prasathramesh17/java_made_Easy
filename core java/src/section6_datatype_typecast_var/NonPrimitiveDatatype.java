package section6_datatype_typecast_var;  //non primitive datatype (class,object,string,array,interface)

public class NonPrimitiveDatatype {
	
	int a =20;
	int b = 10;
	int c;
	
	public void add()
	{
		int c =a+b;
		System.out.println("addition of number is : "+ c);
	}
	
	public void sub()
	{
		int c = a-b;
		System.out.println("subtraction of number is : "+ c);
	}

	public static void main(String[] args) {
	 
		NonPrimitiveDatatype obj = new NonPrimitiveDatatype();
		
		obj.add();
		obj.sub();
	}

}
