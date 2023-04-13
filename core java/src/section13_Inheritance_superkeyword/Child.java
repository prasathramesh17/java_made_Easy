package section13_Inheritance_superkeyword;
//superkeyword used to represent parent class methods
//super method can be used to invoke parent constructor explicitly
//when explicit constructor is there 
//super keyword is used in first statement under constructor
public class Child extends Parent {

   int c,d; 
	Child(int a, int b,int c, int d ) {
		super(a, b);
		this.c=c;
		this.d=d;
	}
	void display() {
		System.out.println("parent a"+ super.a);
		System.out.println("parent b"+ super.b);
		System.out.println("child c"+ this.c);
		System.out.println("child d"+ this.d);
	}

	void f1(){
		super.f1();
		System.out.println("inside child f1");
	}
}
