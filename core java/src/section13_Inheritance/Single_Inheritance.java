package section13_Inheritance;

public class Single_Inheritance {
//implicitly java will extends package from lang.java
	// where hashcode()  //getclass()  methods are present
	
	void m1() {
		System.out.println("inside m1");
	}
	public static void main(String[] args) {
		
		Single_Inheritance s = new Single_Inheritance();
		
		s.m1();
		s.hashCode();
		s.getClass();
	}
}
