package section24_Arrays;

public class Two_Dimensional_Array {

	public static void main(String[] args) {

	//	int [][] matrix = new int[3][3];    //declaring 2-D array of 3*3
		
		int [][]matrix = {{12,14,16},{18,20,22},{24,26,28}};   //direcly asign values
		
		for(int i=0;i<3;i++) {           //for rows
			for(int j=0;j<3;j++) {       //for columns
				
				System.out.print(matrix[i][j]);
				}
			System.out.println();
		}
	}

}
