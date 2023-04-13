package section5_non_static;

//this keyword is used to refer through a particular variable,object and methods
//mainly used with constructors
// used with non static objects
//refers to current object ->variable and method
public class This_keyword {

	int x;
	
	This_keyword(){
		System.out.println(this);
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		new This_keyword();
		new This_keyword();
	}
}
