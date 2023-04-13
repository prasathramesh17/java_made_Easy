package section5_non_static;

public class Object_Reference {
	
	int num= 17;
	String name = "object reference using new keyword";
	
	Object_Reference(){
		
		System.out.println("EXAMPLE OF OBJECT REFERENCE");
	}
	
	void display() {
		System.out.println(name);
	}

	public static void main(String[] args) {

		Object_Reference objref = new Object_Reference();
		
		System.out.println(objref.num);
		
		objref.display();
	}

}
