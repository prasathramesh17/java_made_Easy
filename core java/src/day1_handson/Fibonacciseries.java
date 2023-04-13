package day1_handson;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		System.out.println("enter num1");
		int num1 = sc.nextInt();
		System.out.println("enter num2");
		int num2 = sc.nextInt();
		System.out.println("fibonacci series is : ");
		
		for(int i =1;i<=n;i++) {
			System.out.println(num1+ " ");
			
			int sum = num1+num2;
			num1 = num2;
			num2 = sum;
			sc.close();
		}
	}

}
