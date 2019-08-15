package com.stack;

import java.util.Stack;

public class ReverseStack {
	private static void insertAtBottom(Stack<Integer> stack, int x){
		if(stack.isEmpty()){
			stack.push(x);
			return;
		}
		int temp = stack.pop();
		insertAtBottom(stack, x);
		stack.push(temp);
	}

	public static Stack<Integer> reverse(Stack<Integer> stack){
		if(stack.isEmpty()){
			return stack;
		}
		
		int temp = stack.pop();
		reverse(stack);
		insertAtBottom(stack, temp);
		return stack;
	}

	public static void main(String args[]){
		Stack<Integer> s = new Stack<Integer>();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		
		reverse(s);
		
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
	}

}
