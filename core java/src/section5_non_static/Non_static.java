package section5_non_static;

public class Non_static {

	int num;
	
	Non_static(){
		System.out.println("inside constructor");
	}
	
	{
		System.out.println("inside non static block");
	}
	
	public static void main(String[] args) {
     System.out.println("inside the main method");  //2.main method is printed second
		new Non_static();                           //3.when new object is created it looks for
		new Non_static();                           //non-static block and then constructor
		new Non_static();                          //4. three times new obj created so it is called 3 times
	}
	static {
		System.out.println("static block");         //1.gets printed first as it is static
	}

}
