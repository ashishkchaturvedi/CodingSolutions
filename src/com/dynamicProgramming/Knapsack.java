package com.dynamicProgramming;

public class Knapsack {
	public static int knapsack(int W, int[] weights, int[] values){
/*		if(W == 0) return 0;
		if(weights.length == 0 || values.length == 0) return 0;*/
		
		int cache[][] = new int[weights.length + 1][W + 1];
		for(int i = 1; i <= weights.length; i++){
			for(int j = 0; j <= W; j++){
				if(weights[i - 1] > j) cache[i][j] = cache[i - 1][j];
				else{
					cache[i][j] = Math.max(cache[i - 1][j], cache[i - 1][j] - weights[i - 1] + values[i - 1]);
				}
			}
		}
		return cache[weights.length][W];
	}

	public static void main(String args[]){
		final int  W = 5;
		int[] weights = {1, 2, 3};
		int[] values = {6, 10, 12};
		System.out.println("Maximum possible value is: "+knapsack(W, weights, values));	
	}

}
