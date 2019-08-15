package com.practice;

public class Knapsack {

public static int knapsack(int[] weights, int[] value, int W){
	int[][] cache = new int[weights.length + 1][W + 1];
	for(int i = 1; i <= weights.length; i++){
		for(int j = 1; j <= W; j++){
			if(weights[i - 1] > j){
				cache[i][j] = cache[i - 1][j];
			}else{
				cache[i][j] = Math.max(value[i - 1] + cache[i - 1][j - weights[i - 1]], cache[i - 1][j]);
			}
		}
	}
	return cache[weights.length][W];
}

public static void main(String args[]){
	int[] weights = {1, 2, 3};
	int[] value = {6, 10, 12};
	int W = 5;
	System.out.println(knapsack(weights, value, W));
}

}
