package section24_Arrays;

public class Char_Array {

	public static void main(String[] args) {

		char c[]= {'a','z','q','p','o','a'};
		
		if(c[0] == c[c.length-1]) {   //from array index of c[0] == c [c.length-1]
			                     //gets array length and - by 1 to check it is equal to C
			System.out.println("first and last element are same");
		}
		else {
			System.out.println("They are different");
		}
	}

}
