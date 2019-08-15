package com.array;

/*
[1, 1, 1, 0]
[1, 1, 1, 1]
[1, 1, 0, 0]

Result=
[1, 1, 1, 0]
[1, 2, 2, 1]
[1, 2, 0, 0]
*/


public class SquareSubMatrix {
	public static int subArray(int[][] arr){
		int x = arr.length;
		if(x == 0) return 0;
		int y = arr[0].length;
		if(y == 0) return 0;
		
		int[][] size = new int[x][y]; 
		int max = 0;
		for(int i = 0; i < x; i++){
			for(int j = 0 ; j < y; j++){
				if(i == 0 || j == 0){
					size[i][j] = arr[i][j];
				}else if(arr[i][j] == 1){
					size[i][j] = Math.min(Math.min(arr[i - 1][j], arr[i][j - 1]), arr[i - 1][j - 1]) + 1;
				}
				if(size[i][j] > max) max  = size[i][j];
			}
		}
		return max;
	}

	public static void main(String args[]){
		int[][] arr = {{1, 1, 1, 0},
					   {1, 1, 1, 1},
					   {1, 1, 0, 0}};
		System.out.println(subArray(arr));
	}

}
