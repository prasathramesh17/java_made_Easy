package section17_Exceptions;

public class Assertion_demo {

	public static void main(String[] args) {

		String given = "karthi";  //i h t r a k
		
		char[] arr = given.toCharArray();
		
		String reversed = "";
		
		System.out.println(given.length());
		
		System.out.println(arr.length);
		for (int i = arr.length-1; i >= 0; i--) {
			
			reversed = reversed + arr[i];
		}
		System.out.println(reversed);
	}

}
