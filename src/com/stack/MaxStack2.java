package com.stack;

class Node{
	int data;
	Node next;
	Node oldMax;
	
	public Node(int d){
		this.data = d;
		next = oldMax = null;
	}
}

public class MaxStack2 {
	
	Node max;
	Node stack;
	
	public void push(int x){
		Node newNode = new Node(x);
		
		if(stack == null){
			stack = newNode;
		} else {
			newNode.next = stack;
			stack = newNode;
		}
		
		if(max == null || newNode.data > max.data){
			newNode.oldMax = max;
			max = newNode;
		}
	}
	
	public int pop(){
		if(stack == null) throw new NullPointerException();
		Node n = stack;
		stack = n.next;
		if(n.oldMax !=  null) {
			max = n.oldMax;
		}
		return n.data;
	}
	
	public int max(){
		if(stack == null) throw new NullPointerException();
		return max.data;
	}

	public static void main(String[] args) {
		
		MaxStack2  m = new MaxStack2();
		m.push(2);
		m.push(5);
		m.push(3);
		m.push(4);
		m.push(1);
		System.out.println(m.max());
		System.out.println(m.pop());
		System.out.println(m.pop());
		

	}

}
