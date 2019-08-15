package com.array;

import java.util.Arrays;

public class ConsecutiveElement {

	public static void main(String[] args) {
		int arr[] = {4, 2, 1, 6, 5};
		Arrays.sort(arr);
		int max = -1;
		int count  = 1;
		
		for(int i = 0;i<arr.length-1;i++){
			if(arr[i]+1 == arr[i+1]){
				count++;
				if(max<count){
					max = count;
				}
			} else {
				count = 1;
				continue;
			}
		}
		System.out.println("The longest consecutive array is: "+max);
   
	}

}
