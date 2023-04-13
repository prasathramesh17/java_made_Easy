package section13_Inheritance_superkeyword;
//super method can be used to invoke parent constructor explicitly
public class Parent {
int a , b;
	Parent(int a, int b){
		this.a=a;
		this.b=b;
		
	}
	void f1(){
		System.out.println("inside parent f1");
	}
}
