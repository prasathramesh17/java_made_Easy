package Section10_Access_Modifiers;

public class A {
	
	private int a = 30;       //only within the class it is allowed
	int b = 40;               // only within the package (default level)
	protected int p = 50;     // only within the package (can use extends keyword for inherit)
	public int o = 60;        // accessible any where(global)
	
	public static void main(String[] args) {

		A aobj = new A();
		
		System.out.println(aobj.a);
		System.out.println(aobj.b);
		System.out.println(aobj.p);
		System.out.println(aobj.o);
		
		
		
	}

}
