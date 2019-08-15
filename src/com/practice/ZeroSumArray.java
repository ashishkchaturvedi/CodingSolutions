package com.practice;

import java.util.Arrays;
import java.util.HashMap;

public class ZeroSumArray {

public static int[] zeroSumArray(int a[]){
	HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
	
	int sum = 0;
	for(int i = 0; i< a.length; i++){
		Integer oldIndex = sums.get(sum);
		
		if(oldIndex == null && i == a.length)return null;
		if(oldIndex == null){
			sums.put(sum, i);
			sum += a[i];
		} else {
			return Arrays.copyOfRange(a, oldIndex, i);
		}
	}
	return null;
}

public static void main(String args[]){
	int a[] = {1, 2, -5, 1, 2, -1};
	int arr[] = zeroSumArray(a);
	
	for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i]+ " ");
	}
	
}

}
