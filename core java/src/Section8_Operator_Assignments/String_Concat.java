package Section8_Operator_Assignments;
// + -> used as concat operator
// .concat can also be used instead of (+)
public class String_Concat {

	public static void main(String[] args) {

		String s1 = "xyz";
		String s2 = "abc";
		
		int a= 10, b=20 , c =30;
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2);
		
		System.out.println(a+b+c);
		
		System.out.println(a+b+s1+c);
		
		System.out.println(a+s1+b+c );
		
		System.out.println(a+s1+(b+c));
	}

}
