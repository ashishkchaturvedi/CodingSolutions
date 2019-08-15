package com.number;

public class IntegerToBinaryRecursion {
	public static int toBinary(int n){
		if(n == 1){
			return 1;
		}
		else {
		toBinary(n/2) ;
		return n%2 + 1;
		}
	}

	public static void main(String args[]){
		System.out.println(toBinary(7));
	}

}
