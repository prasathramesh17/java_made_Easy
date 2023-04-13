package section32_annotations;
import java.util.ArrayList;
import java.util.List;

public class B_deprecated {
	 //used to remove warnings (yellow marks)
	//after @supress_warning (provide values within => ({.......})
	
	//@SuppressWarnings({ "deprecation", "rawtypes" }) 
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args) { 
		A_deprecated a = new A_deprecated();
		a.myMethod();        //place the cursor in warning line (choose supresswarning)
		a.myMethod2();
		System.out.println(a);
		
		List list = new ArrayList();  //list is not used it show warning place cusor and choose
		System.out.println(list);
	}

}
