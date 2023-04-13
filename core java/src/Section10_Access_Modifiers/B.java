package Section10_Access_Modifiers;

public class B {                 //except private access modifier everything is printed

	public static void main(String[] args) {

		A aobj = new A();
		
		System.out.println(aobj.b);
		
		System.out.println(aobj.o);
		
		System.out.println(aobj.p);
	}

}
