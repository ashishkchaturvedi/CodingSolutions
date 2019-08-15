package com.number;

public class TwoMissingNumber {

	public static void main(String[] args) {
		int a[] = {1, 2, 5, 6};
		int size = a.length+2;
		
		long totalSum = ((size) * (size+1))/2;
		
		long arrSum = 0;
		for(int i:a){
			arrSum += i; 
		}
		
		int pivot = (int) ((totalSum - arrSum)/2);
		
		int totalLeftXor = 0;
		int arrLeftXor = 0;
		int totalRightXor = 0;
		int arrRightXor = 0;
		
		for(int i = 1; i <= pivot; i++){
			totalLeftXor ^= i; 
		}
		for (int i: a){
			if(i<=pivot){
				arrLeftXor ^= i;
			} else {
				arrRightXor ^= i;
			}
		}
		
		for(int i = pivot+1; i<=size; i++){
			totalRightXor ^= i; 
		}
		
		//return new int[]{totalLeftXor ^ arrLeftXor, toatlRightXor ^ arrRightXor};
		int fNumber = totalLeftXor ^ arrLeftXor;
		int sNumber = totalRightXor ^ arrRightXor;
		
		System.out.println("Two missing numbers are: "+fNumber +" and "+sNumber);
		
	}
}
