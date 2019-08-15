package com.practice;

public class MatrixProduct {

public static int matrixProduct(int[][] matrix){
	if(matrix.length == 0 || matrix[0].length == 0) return 0;
	int[][] minCache = new int[matrix.length][matrix[0].length];
	int[][] maxCache = new int[matrix.length][matrix[0].length];
	
	for(int i = 0; i < matrix.length; i++){
		for(int j = 0; j < matrix[0].length; j++){
			int minValue = Integer.MAX_VALUE;
			int maxValue = Integer.MIN_VALUE;
			if(i == 0 && j == 0){
				maxCache[i][j] = matrix[i][j];
				minCache[i][j] = matrix[i][j];
				continue;
			}if(i > 0){
				int tempMax = Math.max(matrix[i][j] * maxCache[i - 1][j], 
									   matrix[i][j] * minCache[i - 1][j]);
				maxValue = Math.max(tempMax, maxValue);
				int tempMin = Math.min(matrix[i][j] * maxCache[i - 1][j],
						               matrix[i][j] * minCache[i - 1][j]);
				minValue = Math.min(tempMin, minValue);
			}if(j > 0){
				int tempMax = Math.max(matrix[i][j] * maxCache[i][j - 1],
						               matrix[i][j] * minCache[i][j - 1]);
				maxValue = Math.max(tempMax, maxValue);
				int tempMin = Math.min(matrix[i][j] * maxCache[i][j - 1], 
									   matrix[i][j] * minCache[i][j - 1]);
				minValue = Math.min(tempMin, minValue);
			}
			maxCache[i][j] = maxValue;
			minCache[i][j] = minValue;
		}
	}
	return minCache[matrix.length - 1][matrix[0].length - 1];
}

public static void main(String args[]){
	int[][] matrix = {{-1, 2, 3},
					  {4, 5, -6},
					  {7, 8, 9}};
	System.out.println(matrixProduct(matrix));
}

}
