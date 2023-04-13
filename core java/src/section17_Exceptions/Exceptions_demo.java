package section17_Exceptions;

import java.util.Scanner;

//*compile time 
//1. can not find symbol
//2. in compatible types (typecast issue)
//3. invalid method declaration
//4. this cannot be used inside static context
//*Logical errors
//*runtime error : ->exception will cause  [exception is a class] builtin Exp / user defined exp
//abnormal termination of program
//informal/un friendly information to end user
//improper shutdown of resources
public class Exceptions_demo {

	public static void main(String[] args) {
		
		int a,b,c;   //while dividing any num by 0 it cause arithmetic exceptions
		
		try {
		System.out.println("enter two integers : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c=a/b;
		System.out.println("result : " + c);
		}
		catch(ArithmeticException e) {
		System.out.println("dont divide by zero it cause exception");
		}finally {
			System.out.println("finally block ");
		}
		
		System.out.println("execution is not interrupted");
		

		
		
	}
}
