package Section8_Operator_Assignments;

public class Realational_operator {

	//return type is boolean
	//through type cast other values can be produced
	public static void main(String[] args) {

		System.out.println(10<=20); //true
		System.out.println('a'<10);  //false
		System.out.println('a'>'A');  // true
		System.out.println('a'>900);  //false
		
		
		System.out.println((int)'a');  //97   //by typecasting it will return unicode value
		System.out.println((int)'A');  //65
	}

}
