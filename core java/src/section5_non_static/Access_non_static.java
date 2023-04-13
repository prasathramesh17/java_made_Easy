package section5_non_static;

public class Access_non_static {

int num;
Access_non_static(){
	
	System.out.println("inside the constructor");
}
	{
		System.out.println("inside non static block");   //3.default constructor
	}
	
	public static void main(String[] args) {
     System.out.println("inside the main method");  //2.main method is printed second
	                         
	Access_non_static nonstatic = new Access_non_static();
	nonstatic.dosomething();
	}
	static {
		System.out.println("static block");         //1.gets printed first as it is static
	}

	void dosomething() {
		System.out.println("non static method execution"); //4.non static methods
	}
}

