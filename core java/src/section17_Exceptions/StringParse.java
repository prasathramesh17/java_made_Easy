package section17_Exceptions;

public class StringParse {   //throws Number format exception 
	                         //while converting string type to integer

	public static void main(String[] args) {

		String name = "varun";
		try {
		int i = Integer.parseInt(name);
	
	}catch(NumberFormatException e) {
		
		System.out.println("conversion of string to int by exception");
	}

          System.out.println("execution is notinterrupted");
	}
}
