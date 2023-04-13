package Collection_UDEMY_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_LL {

	public static void main(String[] args) {

		Object objects[] = new Object[1000000];
		
		for(int i =0; i<objects.length;i++) {
			objects[i] = new Object();
		}
	//	LinkedList<Object> list = new LinkedList<>();  //time taken: 90
		List<Object> list = new ArrayList<>();         //time taken: 30
		long start = System.currentTimeMillis();
		for(Object object : objects) {
			list.add(objects);
		}
		long end = System.currentTimeMillis();
		System.out.println("TimeTaken:"+ (end - start));
	}

}
