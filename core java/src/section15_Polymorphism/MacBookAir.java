package section15_Polymorphism;

public class MacBookAir extends MacBook {

	@Override
	public void start() {
		System.out.println("inside macbookair start method");
	}
	@Override
	public void shutdown() {
		System.out.println("inside macbookair shutdown method");
	}
}
