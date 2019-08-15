package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public ArrayList<int[]> threeSum(int[] arr){
		ArrayList<int[]> result = new ArrayList<int[]>();
		
		Arrays.sort(arr);

		for(int i = 0; i <= arr.length- 3; i++){
			if(i == 0 || arr[i] > arr[i - 1]){
				int start = i + 1;
				int end = arr.length - 1;
				
				while(start < end){
					if(arr[i] + arr[start] + arr[end] == 0){
						 result.add(new int[] {arr[i], arr[start], arr[end]});
					}
					if(arr[i] + arr[start] + arr[end] < 0){
						int currentStart = start;
						while(arr[start] == arr[currentStart]){
							start++;
						}
					}else {
						int currentEnd = end;
						while(arr[end] == arr[currentEnd]){
							end--;
						}
					}
				}
			}
		}
		return result;
	}
	
	public static void main(String args[]){
		ThreeSum sum = new ThreeSum();
		int a[] = {-1, 0, 1, 2, -1, -4};
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		list = sum.threeSum(a);
		for(int i = 0; i < list.size(); i++){
			int arr[] = list.get(i);
			System.out.print("[");
			for(int j = 0; j< arr.length; j++){
				System.out.print(arr[j]+",");
			}
			System.out.print("]");
			System.out.println();
		}

	}

}
