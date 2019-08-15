package com.stack;

import java.util.Stack;

public class MaxStack {

	public static void main(String[] args) {
		
		int a[] = {4,19,16,54,2,14,12};
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0;i<a.length;i++){
			s.push(a[i]);
		}
		System.out.println(max(s));

	}
	
	public static int max(Stack<Integer> s){
		int max = 0;
		int value = 0;
		while(!s.isEmpty()){
			value = s.pop();
			if(value > max){
				max = value;
			}
		}
		return max;
	}

}
