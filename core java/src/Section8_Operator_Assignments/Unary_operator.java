package Section8_Operator_Assignments;
//first expresssion is evaluated
// and then value is incremented/decremented
public class Unary_operator {

	public static void main(String[] args) {

		int x =10;      //x=11 y=11 
		int y = ++x;  //value of x first incremented and assigned to y 
		
		System.out.println("value of x : "+ x);
		System.out.println("value of y : "+ y);
		
		int a = 7;      //a=8  b=7
		int b = a++;
		
		System.out.println("value of a : "+ a);
		System.out.println("value of a : "+ b);
		
		int l = 10;   //l=9 m=9
		int m = --l;
		System.out.println("value of l: "+ l);
		System.out.println("value of m : "+ m);
		
		int j = 14;  //j = 13  k=14
		int k = j--;
		System.out.println("value of j: "+ j);
		System.out.println("value of k : "+ k);
		
		
		int z=10;
		System.out.println(z++);
	}

}
