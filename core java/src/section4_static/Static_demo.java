package section4_static;

public class Static_demo {                   //used in class level

	static int num = 17;
	static int num1 = 3;
	
	public static void main(String[] args) {     //second main method executed
		                                        //static methods are called under main method
	                                            // classname.static method name();   
		Static_demo.method1();

	}
static {                                         //first static block gets executed
	System.out.println("static block 1");
	System.out.println(Static_demo.num);
	Static_demo.method1();
}

static void method1() {
	
	System.out.println("static method1");
	
}
}
