package com.practice;

public class SquareSubMatrix {
	
	public static int squareSubMatrix(int mat[][]){
		int x = mat.length;
		if(x == 0) return 0;
		int y = mat[0].length;
		if(y == 0) return 0;
		int result[][] = new int[x][y];
		int max = 0;
		
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				if(i == 0 || j == 0){
					result[i][j] = mat[i][j];
				}else if(mat[i][j] == 1){
					result[i][j] = Math.min(Math.min(result[i - 1][j], result[i][j - 1]), result[i - 1][j - 1]) + 1;
				}
				if(result[i][j] > max) max = result[i][j];
			}
		}
		return max;
	}

	public static void main(String args[]){
		int mat[][] = {{1, 1, 1, 0},
					   {1, 1, 1, 1},
					   {1, 1, 0, 0}};
		System.out.println(squareSubMatrix(mat));
	}

}
