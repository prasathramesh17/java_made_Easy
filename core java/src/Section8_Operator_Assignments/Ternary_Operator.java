package Section8_Operator_Assignments;

public class Ternary_Operator {

	// TestExpression ? value1 : value2  (if true it takes value1,,,if false takes value2)
	
	public static void main(String[] args) {

		int x= 30 ,y=20;
		
		String result = (x>y)? "x is greater":"y is greater";
		
		System.out.println(result);
		
		int a=10;
		int b=12;
		
		int reslt = (a>b)? 10:12;
		
		System.out.println(reslt);
		
		int o
		= 10;
		String r = (x%2==0)? "odd": "even";
		System.out.println(r);
		
	}

}
