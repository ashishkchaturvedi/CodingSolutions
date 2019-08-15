package com.bitManipulation;

public class BitRotation {

	public static void main(String[] args) {
		int x = 4; 
		int n = 2;
		int BIT_IN_INTEGERS = 8;
		//System.out.println(x << n);
		
		System.out.println(x << n | x >> (BIT_IN_INTEGERS - n));

	}

}
