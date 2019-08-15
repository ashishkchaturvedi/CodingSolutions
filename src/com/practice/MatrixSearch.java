package com.practice;

public class MatrixSearch {
	public static boolean matrixSearch(int a[][], int k){
		if(a.length == 0 || a[0].length == 0) return false;
		if(k < a[0][0] || k > a[a.length - 1][a[0].length - 1]) return false;
		int row = 0;
		int col = a[0].length - 1;
		
		while(row < a.length && col >= 0){
			if(k == a[row][col]) return true;
			if(k > a[row][col]) row++;
			else col--;
		}
		return false;
	}

	public static void main(String args[]){
		int a[][] = {{0, 2, 10, 11},
					{15, 18, 21, 34},
					{52, 53, 64, 70},
					{81, 83, 90, 99}};
		
		System.out.println(matrixSearch(a, 52) ? "Found" : "Not found");
	}

}
