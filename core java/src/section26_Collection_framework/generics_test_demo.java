package section26_Collection_framework;

public class generics_test_demo {

	public static void main(String[] args) {

		MyGenericstest<String> s = new MyGenericstest<>("bharath");
		s.displayobjDetails();
		System.out.println(s.getobj());
		
		MyGenericstest<Integer> i = new MyGenericstest<>(17);
		i.displayobjDetails();
		System.out.println(i.getobj());

		MyGenericstest<Double> d = new MyGenericstest<>(17.69);
		d.displayobjDetails();
		System.out.println(d.getobj());
	}

}
