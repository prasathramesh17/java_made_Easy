package Section8_Operator_Assignments;

public class Assignment_Operator {

	public static void main(String[] args) {

		int a=100;
		
		int x,y,z;
		
		x=y=z=200;                  //assignment operator (=)
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		int b=20;                 //compound assignment operator
		b +=40;                     // internal working (b=b+40)
		System.out.println(b);
	}

}
