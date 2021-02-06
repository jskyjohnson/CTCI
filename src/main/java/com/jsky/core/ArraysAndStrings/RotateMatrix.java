package com.jsky.core.ArraysAndStrings;

public class RotateMatrix {
	/**
   * @param input, an NxN matrix to be rotated in place 90 degrees.
   */
	public static void Rotate90degrees(int[][] matrix) {
		//Rotate in place by caring over every value 4 at a time, then moving one to the right, or in...
		int N = matrix.length;

		for(int i = 0; i < matrix.length/2; i++){
			for(int j = 0; j < matrix[i].length/2; j++){
				//save top left
				int t = matrix[i][j];
				//top left from bottom left;
				matrix[i][j] = matrix[N-1-j][i];
				//bottom left from bottom right;
				matrix[N-1-j][i] = matrix[N-1-i][N-1-j];
				//bottom right from top right;
				matrix[N-1-i][N-1-j] = matrix[i+j][N-1-i];
				//top right from top left;
				matrix[j][N-1-i] = t;
			}
		}

	}

	public static void printMatrix(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
			for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
				 System.out.print(matrix[i][j] + " ");
			}
			System.out.println(); //change line on console as row comes to end in the matrix.
	 }
	}
}
