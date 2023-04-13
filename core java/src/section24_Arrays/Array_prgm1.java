package section24_Arrays;

public class Array_prgm1 {
//REPLACE 3,followed by 5 as 0                         //  (3,5 = 0)
	public static void main(String[] args) {

		int a[] = {3,4,6,3,7,4,9,3,7,5,4,3,7};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==3 && a[i+1]==7) {    //array[i]==3 and next element a[i+1]==7 
				a[i+1]=0;                  //convert (3,7) as 0
			}
		}
		for (int i : a) {
			System.out.print(i);
		}
	}

}
