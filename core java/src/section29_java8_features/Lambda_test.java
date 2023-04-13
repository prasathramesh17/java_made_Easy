package section29_java8_features;
//lambda expression->used in functional programming,functional interface less code to do large operation
//also called as ANONYMOUS FUNCTION/ CLOSURE
//no access modifier, no methods ,, directly implementation using (->)
//if a interface has one and only one abstract method is called as functional interface
//ex: built-in functionalinterface =  runnable  -> run    /  comparator  -> compareTo
public class Lambda_test {

	public static void main(String[] args) {

		Sum s = (x,y)->System.out.println("sum is " + (x+y));
		s.add(10, 20);
		
	}

}
