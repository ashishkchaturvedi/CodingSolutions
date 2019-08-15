package com.practice;

import java.util.Stack;

public class InorderTraversalTree {
	static Node head;
	public static void inorderTraversal(Node n){
		Stack<Node> s = new Stack<Node>();
		addToLeft(s, n);
		while(!s.isEmpty()){
			Node out = s.pop();
			System.out.print(out.data+" ");
			if(out.right != null){
				addToLeft(s, out.right);
			}
		}
	}

	private static void addToLeft(Stack<Node> s, Node n){
		while(n != null){
			s.push(n);
			n = n.left;
		}
	}

	public static void main(String args[]){
		head = new Node(5);
		head.left = new Node(2);
		head.right = new Node(3);
		head.left.left = new Node(1);
		head.left.right = new Node(4);
		head.right.left = new Node(6);
		head.right.right = new Node(7);
		
		inorderTraversal(head);
	}

}
