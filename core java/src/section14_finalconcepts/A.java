package section14_finalconcepts;
//marking as final in variable-> value cannot be changed
// marking final in obj, doesnt allow the objref to be changed
//with help of constructor we can change final value 
   //only when final value is not intialized
//final static can be used for constant values
//display() method cannot be extended bcoz of final usage
public final class A {

	public final void display() {
		System.out.println(A.pi);
	}
	//final static float pi=3.14;  //4
	final static float pi = 3.14f;   //1
	public static void main(String[] args) {
		final A a1= new A(); //2
		System.out.println(A.pi);
	//	a1=new A();  
	//	a1.pi=3.25f;
	}
}
