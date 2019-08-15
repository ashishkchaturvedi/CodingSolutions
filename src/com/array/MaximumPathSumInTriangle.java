package com.array;

public class MaximumPathSumInTriangle {

	public static void main(String[] args) {
		int a[][] = {{8,0,0,0},
				{-4,4,0,0},
				{2,2,6,0},
				{1,1,1,1}				
		};
		
		int n = a.length;
		
		for(int i=n-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				if(a[i+1][j] > a[i+1][j+1]){
					a[i][j] += a[i+1][j];
				} else {
					a[i][j] += a[i+1][j+1];
				}
			}
		}
		System.out.println("MAximin sum down the tree is: "+a[0][0]);

	}

}
