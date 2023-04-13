package Section9_flow_control_statements;

public class If_else_statements {

	public static void main(String[] args) {

		int a=10,b=12;
		
		if(a>b) {    //check whether a is greater than b
			System.out.println("a is greater than b");
		}
		else if(b>a) {   // check whether b is greater than a
			System.out.println("b is greater than a");
		}
		else
		{
			System.out.println("both are equal");
		}
	}

}
