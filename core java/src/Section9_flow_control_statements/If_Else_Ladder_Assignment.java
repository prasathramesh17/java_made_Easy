package Section9_flow_control_statements;

import java.util.Scanner;

public class If_Else_Ladder_Assignment {

	public static void main(String[] args) {
		 
	    int m=50,p=56,c=65;
	    
	       float avg =(m+p+c)/3;
	         
	      System.out.println("average mark " +avg);

		
		if(m <= 35 || p<=35 || c<=35 ){
			System.out.println("fail");
		}
		else {
			System.out.println("pass");
		}
		 if(avg <=59 ){
			System.out.println("Grade c ");
		}
		 else if(avg <=69 ){
		System.out.println("Grade B");
		}
		 else {
			System.out.println("Grade A");
		}
	
	}

}
