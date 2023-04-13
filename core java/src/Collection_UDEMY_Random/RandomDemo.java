package Collection_UDEMY_Random;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		//creating random object (to print a random no)
		//confirming it take int datatype and looks for integer
		 // print a random no  //-283259787
		Random obj = new Random();        
		int x  = obj.nextInt();          
		System.out.println("x: "+ x);    
		
		//creating random num within range 100 (int bound method)
		 //print a random no  //93
		int y = obj.nextInt(100);        
		System.out.println("y:"+ y);      
	}

}
