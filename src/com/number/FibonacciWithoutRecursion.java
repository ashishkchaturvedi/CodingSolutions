package com.number;

public class FibonacciWithoutRecursion {
	public static void fibonacci(int n){
		int a = 0, b = 1;
		System.out.print("[ ");
		System.out.print(a+" "+b);
		while(n!=0){
			int c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
			n--;
		}
		System.out.print(" ]");
	}

	public static void main(String args[]){
		fibonacci(8);
	}

}
