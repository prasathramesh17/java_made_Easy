package section20and21_Garbage_collection_innerclasses;
//the process by which JVM automatically clear the memory allocation
//of particular object is called garbage collection
//garbage collection is a demon thread that runs within the jvm background
//->collects the object which are [unreachable]
// garb col -> cannot be forced -> but can be requested by [ System.gc() ]
public class garbage_col_demo {

	garbage_col_demo(){
		System.out.println(this + "created");
	}
	public static void main(String[] args) {

		new garbage_col_demo();
		
		new garbage_col_demo();
	}
       @Override
       protected void finalize() {
    	   System.out.println(this+ "finalized");
       }
}
