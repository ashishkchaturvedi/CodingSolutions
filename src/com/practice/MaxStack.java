package com.practice;

public class MaxStack {
	static Node stack;
	static Node max;

	public static void push(int data){
		Node n = new Node(data);
		
		if(stack == null){
			stack = n;
		}
		
		else {
			n.next = stack;
			stack = n;
		}
		
		if(max == null || n.data > max.data) {
			n.oldMax = max;
			max = n;
		}
	}

	public static int pop() {
		if(stack == null) throw new NullPointerException();
		
		Node n = stack;
		stack = stack.next;
		
		if(n.oldMax != null) {
			max = n.oldMax;
		}
		return n.data;
	}

	public static int max(){
		if(stack == null) throw new NullPointerException();
		
		return max.data;
	}

	public static void main(String args[]){
		//MaxStack  m = new MaxStack();
			push(2);
			push(3);
			push(4);
			push(1);
			push(5);
			System.out.println("Max is: "+max());
			System.out.println("Popped: "+pop());
			System.out.println("Popped: "+pop());
			System.out.println("Max is: "+max());
			System.out.println("Popped: "+pop());
			System.out.println("Max is: "+max());
			
	}

}
