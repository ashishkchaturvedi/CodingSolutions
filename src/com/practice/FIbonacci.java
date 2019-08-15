package com.practice;

public class FIbonacci {
	public static int fib(int n){
		int  a = 0;
		int  b = 1;
		
		while(n != 0){
			int c = a + b;
			a = b;
			b = c;
			n--;
		}
		return b;
	}

	public static void main(String args[]){
		System.out.println(fib(9));
	}

}
