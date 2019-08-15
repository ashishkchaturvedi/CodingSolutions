package com.array;

public class MinimumPathSumInTriangle {

	public static void main(String[] args) {
		int a[][] = {{2,0,0,0},
				{3,4,0,0},
				{6,5,7,0},
				{4,1,8,3}				
		};
		
		int n = a.length;
		for(int i=n-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				if(a[i+1][j]<a[i+1][j+1]){
					a[i][j] += a[i+1][j];
				} else {
					a[i][j] += a[i+1][j+1];
				}
			}
		}
		System.out.println("The minimum sum is: "+a[0][0]);

	}

}
