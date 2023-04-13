package section5_non_static;

public class Static_method_ref {

	static Static_method_ref methodref= new Static_method_ref();
	
	static {
		System.out.println(Static_method_ref.methodref);
	//	Static_method_ref.init();
		
		Static_method_ref.methodref = Static_method_ref.init();
	}
	public static void main(String[] args) {

		System.out.println(Static_method_ref.methodref);
	}

//	static void init() {
	
	static Static_method_ref init(){
//	Static_method_ref.methodref = new Static_method_ref();   
		
		return new Static_method_ref();          //(another type is return )
	}
}
