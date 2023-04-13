package section17_Exceptions;

public class ArrayindexOutofBound {

	public static void main(String[] args) {

		int arr[] = {10,20,30};
		
		try {
		System.out.println("elements in the array : ");
		
		for (int i = 0; i <= arr.length; i++) {  //0<3  1<3  2<3  3<3(false)->i<arr.lemgth; 
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("beyond array length");
			
		}
		
		System.out.println(arr.length);   //tiz code will never run bcoz of exception
	}

}
