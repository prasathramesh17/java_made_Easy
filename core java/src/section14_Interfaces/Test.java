package section14_Interfaces;
//interface is a contract of a class(class is responsible to implement interface instruction)
//interface can have only abstract methods
//object cannot be created for interface 
//by using child class of interface object creation is possible
//with help of child class obj ref calling the interface methods 
//(which are abstract) but defined in child class
public class Test  {

	public static void main(String[] args) {
		
		Honda h = new Honda();
		h.go();
		h.stop();
		
	}

}
