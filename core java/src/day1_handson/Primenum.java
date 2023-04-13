package day1_handson;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num to check it is prime: ");
		
		int number = sc.nextInt();
		boolean isprime = true;
		
		//check for prime number
		
		for(int i =2; i<=Math.sqrt(number);i++) {
			if(number%i ==0) {
				isprime = false;
				break;
			}
		}
		//print result
		if(isprime) {
			System.out.println(number + "is a prime number");
		}
		else {
			System.out.println(number+ " is not a prime number");
		}
	}

}
