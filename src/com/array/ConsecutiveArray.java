package com.array;

import java.util.Arrays;

public class ConsecutiveArray {
	public static int consecutiveElement(int a[]){
		int count = 1;
		int max  = Integer.MIN_VALUE;
		Arrays.sort(a);
		for(int i = 0; i < a.length - 1; i++){
			if(a[i] + 1 == a[i+1]){
				count++;
				if(max < count){
				max = count;
				}
			}else{
				count = 1;
				continue;
			}
			
		}
		return max;
	}

	public static void main(String args[]){
		int a[] = {4, 2, 1, 6, 5, -100, -101, -102, -103};
		System.out.println("The largests consecutive array is: "+consecutiveElement(a));
	}

}
