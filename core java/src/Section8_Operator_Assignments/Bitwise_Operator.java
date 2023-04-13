package Section8_Operator_Assignments;

// ~ bitwise unary operator (produce opposite value)
//! boolean (if true it produce false, if false it produce true)
public class Bitwise_Operator {

	public static void main(String[] args) {

		System.out.println(true & true);  //(both T-T -> TRUE ,Orelse it return false)
		
     	System.out.println(false | false);  //(both F-F -> FALSE , Orelse it return true)
		
		System.out.println(true ^ false);  //(both should be different t-f,f-t  it return true)
	}

}
