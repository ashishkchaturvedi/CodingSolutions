package com.array;

public class MatrixProduct {

public static int matrixProduct(int[][] matrix){
	if(matrix.length == 0 || matrix[0].length == 0) return 0;
	int maxCache[][] = new int[matrix.length][matrix[0].length];
	int minCache[][] = new int[matrix.length][matrix[0].length];
	
	for(int i = 0; i < matrix.length; i++){
		for(int j = 0; j < matrix[0].length; j++){
			if(i == 0 && j == 0){
				maxCache[i][j] = matrix[i][j];
				minCache[i][j] = matrix[i][j];
				continue;
			}
			int minVal = Integer.MAX_VALUE;
			int maxVal = Integer.MIN_VALUE;
			if(i > 0){
				int tempMax = Math.max(matrix[i][j] * maxCache[i - 1][j], matrix[i][j] * minCache[i - 1][j]);
				maxVal = Math.max(maxVal, tempMax);
				int tempMin = Math.min(matrix[i][j] * maxCache[i - 1][j], matrix[i][j] * minCache[i - 1][j]);
				minVal = Math.min(minVal, tempMin); 
			}
			if(j > 0){
				int tempMax = Math.max(matrix[i][j] * maxCache[i][j - 1], matrix[i][j] * minCache[i][j - 1]);
				maxVal = Math.max(maxVal, tempMax);
				int tempMin = Math.min(matrix[i][j] * maxCache[i][j - 1], matrix[i][j] * minCache[i][j - 1]);
				minVal = Math.min(minVal, tempMin); 
			}
			
			maxCache[i][j] = maxVal;
			minCache[i][j] = minVal;
		}
	}
	return maxCache[matrix.length - 1][matrix[0].length - 1];
}

public static void main(String args[]){
	int matrix[][] = {{-1, 2, 3},
					  {4, 5, -6},
					  {7, 8, 9},};
	System.out.println(matrixProduct(matrix));
}

}
