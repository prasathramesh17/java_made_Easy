package section32_annotations;
import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
		try {
			System.out.println(Arrays.toString(Class.forName(A_deprecated.class.getName()).getConstructors()));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
