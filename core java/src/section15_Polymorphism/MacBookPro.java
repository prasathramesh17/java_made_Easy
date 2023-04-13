package section15_Polymorphism;

public class MacBookPro extends MacBook {

	@Override
	public void start() {
		System.out.println("inside macbookpro start method");
	}
	@Override
	public void shutdown() {
		System.out.println("inside macbookpro shutdown method");
	}
}
