package com.practice;

import java.util.Stack;

public class ReverseStack {
	public static Stack<Integer> reverse(Stack<Integer> stack){
		if(stack.isEmpty()) return stack;
		int temp1 = stack.pop();
		reverse(stack);
		insertAtBottom(stack, temp1);
		return stack;
	}

	public static void insertAtBottom(Stack<Integer> stack, int x){
		if(stack.isEmpty()){
			stack.push(x);
			return;
		}
		int temp = stack.pop();
		insertAtBottom(stack, x);
		stack.push(temp);
	}
	
	public static void main(String args[]){
		Stack<Integer> input = new Stack<Integer>();
		//Stack<Integer> result = new Stack<Integer>();
		input.push(1);
		input.push(2);
		input.push(3);
		input.push(4);
		
		reverse(input);
		while(!input.isEmpty()){
			System.out.println(input.pop());
		}
	}

}
