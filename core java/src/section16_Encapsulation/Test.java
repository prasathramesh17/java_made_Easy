package section16_Encapsulation;
//SECURITY PURPOSE  (handle data safe from external intervention)
// it is also known as information hiding concepts
//the data is not accessible to the outside world 
//only those functions(methods) which are wrapped in the class can access data 
//with the help of the getter and setter 
//and creating obj for class we are passing the values
public class Test {

	public static void main(String[] args) {

		Customer c = new Customer();
		c.SetFirstName("Bharath");
		c.setLastName("thippireddy");
		c.setCreditCard("12345");
		
		System.out.println("firstname is :"+c.getFirstName());
		System.out.println("lastname is :"+c.getLastName());
		System.out.println("credit card : "+c.getCreditCard());
	}

}
