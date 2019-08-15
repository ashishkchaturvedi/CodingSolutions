package com.practice;

public class MatrixProduct2 {
	public static int matrixProduct(int mat[][]){
		if(mat.length == 0 || mat[0].length == 0) return 0;
		int[][] minCache = new int[mat.length][mat[0].length];
		int[][] maxCache = new int[mat.length][mat[0].length];
		for(int i = 0; i < mat.length; i++){
			for(int j = 0 ; j < mat[0].length; j++){
				if(i == 0 && j == 0){
					minCache[i][j] = mat[i][j];
					maxCache[i][j] = mat[i][j];
					continue;
				}
				int minValue = Integer.MAX_VALUE;
				int maxValue = Integer.MIN_VALUE;
				if(i > 0){
					int tempMax = Math.max(mat[i][j] * maxCache[i - 1][j], mat[i][j] * minCache[i - 1][j]);
					maxValue = Math.max(tempMax, maxValue);
					int tempMin = Math.min(mat[i][j] * maxCache[i - 1][j], mat[i][j] * minCache[i - 1][j]);
					minValue = Math.min(tempMin, minValue);
				}
				if(j > 0){
					int tempMax = Math.max(mat[i][j] * maxCache[i][j - 1], mat[i][j] * minCache[i][j - 1]);
					maxValue = Math.max(tempMax, maxValue);
					int tempMin = Math.min(mat[i][j] * maxCache[i][j - 1], mat[i][j] * minCache[i][j - 1]);
					minValue = Math.min(tempMin, minValue);
				}
				maxCache[i][j] = maxValue;
				minCache[i][j] = minValue;
			}
		}
		return maxCache[mat.length - 1][mat[0].length - 1];
	}

	public static void main(String args[]){
		int[][] arr = {{-1, 2, 3},
					   {4, 5, -6},
					   {7, 8, 9},};
		System.out.println("Maximum product is:" + matrixProduct(arr));
	}

}
