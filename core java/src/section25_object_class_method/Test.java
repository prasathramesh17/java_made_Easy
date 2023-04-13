package section25_object_class_method;
//hashcode gives the memory address
public class Test {

	public static void main(String[] args) {

		Passenger passenger = new Passenger();
	passenger.setFirstName("bharath");
	passenger.setLastName("thippi");
   System.out.println(passenger);
   System.out.println(passenger.hashCode());
	}

}
