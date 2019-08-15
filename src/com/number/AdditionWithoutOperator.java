package com.number;

public class AdditionWithoutOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 9;
		
		System.out.println(sum (a, b));

	}
	
	public static int sum(int a, int b){
		if(b==0){
			return a;
		}
		int partialSum = a ^ b;
		int carry = (a & b) << 1;
		return sum(partialSum, carry);
		
	}

}
