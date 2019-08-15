package com.number;

public class GrayNumber {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 7;
		int x = a^b;
		System.out.println(x);
		int index = -1;
		
			if(x % 2 == 0 || x>>1 == 0){
				index = 1;
			}
		System.out.println(index == 1?"It is a gray number":"It is not a gray number");

	}

}
