package section20and21_Garbage_collection_innerclasses;

public class NonStaticinner {

	void f1() {
		
		System.out.println("method inside f1");
	}
	
	class Inner{
		
		void f2() {
			
			System.out.println("method inside another class f2");
		}
		
	}
	public static void main(String[] args) {

		NonStaticinner nons = new NonStaticinner();
		nons.f1();
		
		//outerclass.innerclass refobj = (ref_of_outerclass) . new innerclass();
		NonStaticinner.Inner nonstinner = nons.new Inner();
		nonstinner.f2();
	}

}
