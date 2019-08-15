package com.tree;

import java.util.Stack;

public class InorderWithoutRecursion {
	
	static class Node{
		int data;
		Node left, right;
		public Node(int d){
			this.data = d;
			left = right = null;
		}
	}
	
	Node root;
	
	public static void traverse(Node n){
		Stack<Node> s = new Stack<Node>();
		addLeftToStack(s, n);
		while(!s.isEmpty()){
			Node curr = s.pop();
			System.out.print(curr.data+" ");
			if(curr.right!=null){
				addLeftToStack(s, curr.right);
			}
		}
	}
	
	private static void addLeftToStack(Stack<Node> s, Node n){
		while(n!=null){
			s.push(n);
			n = n.left;
		}
	}

	public static void main(String[] args) {
		InorderWithoutRecursion it = new InorderWithoutRecursion();
		it.root = new Node(5);
		it.root.left = new Node(3);
		it.root.right = new Node(7);
		it.root.left.left = new Node(1);
		it.root.left.right = new Node(4);
		it.root.right.left = new Node(6);
		it.root.right.right = new Node(8);
		
		traverse(it.root);

	}

}
