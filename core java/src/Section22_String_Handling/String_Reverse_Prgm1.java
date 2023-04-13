package Section22_String_Handling;

public class String_Reverse_Prgm1 {

	public String firstWay(String actual) {
		String reversed = "";
		for (int i = actual.length();i>0;i--) {
			reversed = reversed+actual.charAt(i-1);   //compound assignment can be used
		}                                            //reversed +=actual.charAt(i-1);
		return reversed;
	}
	public static void main(String[] args) {

		String str = "karthick";
		String_Reverse_Prgm1 sr = new String_Reverse_Prgm1();
		System.out.println(sr.firstWay(str));
	}

}
