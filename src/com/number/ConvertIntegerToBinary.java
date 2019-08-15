package com.number;

import java.util.Stack;

public class ConvertIntegerToBinary {

public static void toBinary(int n){
	Stack<Integer> s = new Stack<Integer>();
	int bin = 0;
	while(n>=1){
		bin  = n % 2;
		s.push(bin);
		n = n/2;
	}
	
	while(!s.isEmpty()){
		System.out.print(s.pop());
	}
}

public static void main(String args[]){
	toBinary(10);
}
}
