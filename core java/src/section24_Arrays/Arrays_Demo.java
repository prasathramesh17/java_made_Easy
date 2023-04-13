package section24_Arrays;

public class Arrays_Demo {
//array is a object in java  (static type once memory is allocated in runtime it cannot be changed)	
//Array is a collection of element of same datatype.
//Array are fixed in size and not growable.
//for retrieving and display array elements LOOP statements are used	
	public static void main(String[] args) {

		//int arr[5];      (declaring array with 5 values)
		
		//int arr[]= {10,20,30,40,50};  (directly declaring and assigning 5 values)
		
		int arr[] = new int[5];  //creating object with limit of 5 values
		                          //(as array is an object new keyword is used in obj creation)
	
	arr[0] = 10;
	arr[1] = 20;                             //arr[1] = new Integer(20);
	arr[2] = 30;                       // (this method is depreciated with version java 9)
	arr[3] = 40;
	
	System.out.println("Elements in array: ");
	
	for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);     //10,20,30,40,0   //arr[4] produce default value as 0
	}
	
	}

}
