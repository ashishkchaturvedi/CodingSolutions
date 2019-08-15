package com.number;

/*
{{0x03, 0xED}, 10} = 5
(0 * 16^3 + 3 * 16^2 + 14 * 16^1 + 13 * 16^0) = (0 + 768 + 224 + 13) = 1005 % 10 = 5
*/

public class BigIntModulus {
	public static int mod(byte[] a, int b){
		int m = 0;
		for(int i = 0; i < a.length; i++){
			m <<= 8;
			m += a[i];
			m = m % b;
		}
		return m;
	}

	public static void main(String args[]){
		byte a[] = {0x03, 0x12};
		int b = 10;
		System.out.println(mod(a, b));
	}

}
