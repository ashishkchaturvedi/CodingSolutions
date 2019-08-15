package com.practice;

public class GrayNumber {
	public static boolean isGray(int a, int b) {

		int x = a ^ b;

		if((x % 2 == 0) || (x >> 1 == 0)){
			return true;
		}

		return false;
	}
	
	public static void main(String args[]){
		
		int a = 8;
		int b  =10;
		System.out.println((isGray(a, b)) ? "It is a gray number" : "It is not a gray number");
	}

}
