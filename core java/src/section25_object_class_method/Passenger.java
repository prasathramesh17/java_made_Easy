package section25_object_class_method;
//to string method is used to provide meaningful information 
//if (to string)is not provided it will give the hashcode(memory adddress)
//hash code method should be overrided or else output wil be memory address but not meaningful value
//hash code should contain unique values
//while using equals() and hashcode()
	//equals returns true then hashcode value must be same
	//equals returns false then hashcode value may or may not be the same
	//hashcode is same equals may or may not return true
public class Passenger {
	private int id;
	private String firstName;
	private String lastName;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
    //return super.toString();
		return "passengerinformation is firstname:" + this.firstName +"lastname is :" +this.lastName;
	}
	@Override
	public int hashCode() {
		return id;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
	 this.id = id;
	}
	//@Override
	//public boolean equals(object obj) {
		
	//}
	
	
	

}
