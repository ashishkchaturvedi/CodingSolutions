package com.array;

import java.util.Arrays;
import java.util.HashMap;

public class SubArray {
	public static int[] subArray(int[] a){
		HashMap<Integer,Integer> sums = new HashMap<Integer, Integer>();
		int sum = 0;
		for(int i = 0; i <= a.length; i++){
			Integer oldMax = sums.get(sum);
			
			if(oldMax == null && i == a.length){
				return null;
			}
			else if(oldMax == null){
				sums.put(sum, i);
				sum += a[i]; 
			}
			else {
				return Arrays.copyOfRange(a, oldMax, i);
			}
		}
		return null;
	}

	public static void main(String args[]){
		int a[] = {1, 2, -5, 1, 2, -1};
		int[] sortedArray = subArray(a);
		
		for(int i=0; i < sortedArray.length; i++){
			System.out.print(sortedArray[i]+" ");
		}
	}

}
