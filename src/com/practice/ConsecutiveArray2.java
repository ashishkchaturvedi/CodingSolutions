package com.practice;

import java.util.Arrays;

public class ConsecutiveArray2 {
	public static int consecutive(int arr[]){
		if(arr.length == 0) return 0;
		int count = 1;
		int max = 0;
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length - 1; i++){
			if(arr[i] + 1 == arr[i + 1]){
				count++;
			}else{
				if(count > max) max = count;
				count  = 1;
			}
		}
		return max;
	}

	public static void main(String args[]){
		int[] arr = {4, 2, 1, 6, 5, -100, -101, -102, -103};
		System.out.println(consecutive(arr));
	}

}
