package section13_Inheritance;

public class Overridung_Test {

	public static void main(String[] args) {

		Hierarchical_car car = new Hierarchical_car();
		System.out.println(car.fuel());
		Hierarchical_bike bike = new Hierarchical_bike();
		System.out.println(bike.fuel());
		Hierarchical_bus bus = new Hierarchical_bus();
		System.out.println(bus.fuel());
		
	}

}
