package Section9_flow_control_statements;

public class Switch_Demo {
//break statement is used to terminate 
	//if break is not used multiple case will be executed with desired expression
// datatypes supported (byte/short/int/char/enum/string)
//case label should be constant and cannot be duplicate
	public static void main(String[] args) {

		String fooditem = "pizza";
		                                             //if string
		switch(fooditem) {  //switch(expression)  should match with case "string_val" :
		                                             //if int
		                                           // should match with case 1 :
		
		
		case "vegroll":System.out.println("available at 10");break;
		
		case "burger":System.out.println("available at 11");break;
		
		case "momos":System.out.println("available at 4");break;
		
		case "pizza":System.out.println("available at 11.30");break;
		
		default : System.out.println("item may be not available");
		
		}
	}

}
