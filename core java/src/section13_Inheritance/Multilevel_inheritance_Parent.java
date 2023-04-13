package section13_Inheritance;

public class Multilevel_inheritance_Parent {

	String name = "karthi";
	
	Multilevel_inheritance_Parent(){
		System.out.println("parent class"+this);
	}
	void f1() {
		System.out.println("inside parent f1");
		System.out.println(name);
	}
}
