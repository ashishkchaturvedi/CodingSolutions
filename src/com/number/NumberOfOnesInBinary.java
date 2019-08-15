package com.number;

public class NumberOfOnesInBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		int count = 0;
		
		while (n!=0){
			if(n%2 != 0){
				count ++;
			}
			
			n = n/2;
		}
		
		System.out.println(count);

	}

}
