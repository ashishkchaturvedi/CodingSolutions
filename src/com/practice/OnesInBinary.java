package com.practice;

public class OnesInBinary {
	public static int onesInBinary(int n){
		int count = 0;
		while(n!=0){
			if(n%2 != 0){
				count++;
			}
			n = n/2;
		}
		return count;
	}

	public static void main(String args[]){
		System.out.println(onesInBinary(7));
	}

}
