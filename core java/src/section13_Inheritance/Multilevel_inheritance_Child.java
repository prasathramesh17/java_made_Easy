package section13_Inheritance;

public class Multilevel_inheritance_Child extends Multilevel_inheritance_Parent{

	String name = "moni";
	Multilevel_inheritance_Child(){
		System.out.println("child class"+this);
	}
	void f2() {
		System.out.println("inside child f2");
		System.out.println(super.name);
		System.out.println(this.name);
	}
	
}
