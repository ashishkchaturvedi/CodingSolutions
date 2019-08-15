package com.number;

public class OneMissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 5, 6};
		int totalXor = 0;
		int arrXor = 0;
		
		for(int i = 1; i<=arr.length+1;i++){
			totalXor ^= i; 
		}
		
		for(int i: arr){
			arrXor ^= i;
		}
		
		int ans = totalXor^arrXor;
		
		System.out.println("The missing number is: "+ans);

	}

}
