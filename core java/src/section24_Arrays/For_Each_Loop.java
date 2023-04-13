package section24_Arrays;

public class For_Each_Loop {
//used commonly with array and collections
	
	public static void main(String[] args) {

		int arr[]= {10,12,14,16,18,20};
		
		System.out.println("Elements of the array:");
		
		for(int elements : arr) {              //for(datatype_  : variable_name)
			
			System.out.println(elements);
		}
	}

}
