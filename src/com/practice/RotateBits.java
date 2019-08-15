package com.practice;

public class RotateBits {
	public static void rotateBits(int n){
		System.out.println(n >> 8 | n << (32 - 8));
	}

	public static void main(String args[]){
		rotateBits(10);
	}

}
