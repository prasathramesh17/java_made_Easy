package section15_Polymorphism;

//runtime polymorphism/ Dynamic binding/ method overriding are SAME
//while implementing interface visibility should not affect (it should be public)
public class MacBook implements AppleLaptop {

	public void start() {
		System.out.println("inside Macbook start()");
	}

	public void shutdown() {
		System.out.println("inside Macbook shutdown()");
	}
}

