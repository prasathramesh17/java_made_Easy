package Section10_Access_Modifiers;

public class C extends A {   //private is not accessible

	public static void main(String[] args) {

		A aobj = new A();
		System.out.println(aobj.o);  //public
		
		C cobj = new C();
		System.out.println(cobj.o);  //public
		System.out.println(cobj.p);  //protected (bcoz of extends keyword)
	}

}
