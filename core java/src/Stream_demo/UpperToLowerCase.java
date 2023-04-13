
package Stream_demo;
//map-convert each element in the underlying collection
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		l1.add("JOHN");
		l1.add("VINGI");
		l1.add("KONNAE");
		
		System.out.println(l1);
		
		List<String> l2 = l1.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(l2);
	}
}
