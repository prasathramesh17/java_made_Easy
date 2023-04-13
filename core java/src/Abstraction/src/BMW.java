
public abstract class BMW {
//if a method in class is abstract then class should be declared abstract
	//we can have normal method and abstract method inside a abstract class(partial)
	//the class can be either abstract or final but not both
	//we cannot mark abstract method as static
	//we cannot create a instance for the abstract class
	//can have blocks & can have constructors
	         // with help of constructor variable value can be assigned
//main method can be used inside abstract class bcoz main method is static 
//abstract class can use final keyword in method //
   //where as final cannot be used with abstract in class level or method level	
	void commonFunc() {
	System.out.println("inside common func method");	
	}
	abstract void accelerate();
	public static void main(String[] args) {
		System.out.println("inside main method");
	}
	
}
