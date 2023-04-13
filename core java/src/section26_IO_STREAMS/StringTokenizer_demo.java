package section26_IO_STREAMS;

import java.util.StringTokenizer;

public class StringTokenizer_demo {

	public static void main(String[] args) {

		String s = "this is a hp pavilion laptop with ryzen processor 5";
		
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
