package section20and21_Garbage_collection_innerclasses;
//accessing of static methods inside the static class and non static class

public class Outer {

	static void f1() {
		System.out.println("this is a non static class with static method");
	}
	
   static class Inner {
	   
	   static void f1() {
		   System.out.println("this is a static class with static method");
	   }
	   void f3()  //non static method-> should create a instance so that it can be called
	   {
		   System.out.println("non static method created an instance");
		   }
	   }
   
   public static void main(String[] args) {
	
	   Outer.f1();      //non static class-> class.method_name
	   Outer.Inner.f1(); //static class -> class1name.class2name.method_name (outercls+innercls)
	   
	   Outer.Inner inner = new Outer.Inner();
	   inner.f3();
}
}
