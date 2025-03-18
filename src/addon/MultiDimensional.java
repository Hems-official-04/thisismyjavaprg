package addon;                            

import java.util.Arrays;

public class MultiDimensional {
	public static void main (String[]args) {
		int[][] matrix = new int[2][3];
		matrix[0][0] = 1;matrix[0][1] =2; matrix[0][2] =3;
		matrix[1][0] = 4;matrix[1][1] =5; matrix[1][2] =6;
		
		for (int i =0; i< matrix.length; i++) {
			for( int j =0;j<matrix[i].length;j++) {
				System.out.println(matrix[i][j] + "");
			}
			System.out.println();
		}
		
		int [] source = {1,2,3,4,5};
		int[] destination = new int [5];
		System.arraycopy(source, 0, destination, 0, source.length);
		for (int num : destination) {
			System.out.println(num+"");
		}
		int[] numbers = {40,30,20,60};
		Arrays.sort(numbers);
		System.out.println("sorted Array: " +Arrays.toString(numbers));
		
		
		for(int num :numbers) {
			System.out.println(num);
		}
	}

}
