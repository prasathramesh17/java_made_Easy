package section5_non_static;

public class Objref_with_static {

//	static Objref_with_static objrefstatic;   //calling static directly-1(global variable)
	
	static {
		
	//	System.out.println(Objref_with_static.objrefstatic);  //will produce null-2
		
		 Objref_with_static objrefstatic = new Objref_with_static(); //value of new class instance is output
		 
		System.out.println(objrefstatic);
	}
	public static void main(String[] args) {

		//System.out.println(Objref_with_static.objrefstatic);   //will produce null-3
	}

}
