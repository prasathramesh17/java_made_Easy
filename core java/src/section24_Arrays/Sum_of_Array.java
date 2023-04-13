package section24_Arrays;

public class Sum_of_Array {

	public static void main(String[] args) {

		int a[]= {4,8,12,16,20};
		int sum = 0;
		
/*		for(int i=0;i<a.length;i++) {       //for loop usage
			
			sum+=a[i];
		}
		System.out.println(sum);
*/
		
		for(int i : a) {                       //for each loop usage
			sum+= i;
		}
		System.out.println(sum);
	}

}
