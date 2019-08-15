package com.tree;

import java.util.Stack;

public class PostOrderTraversalTwoStack {
	static Node head;
	public static void postOrderTraversal(Node n){
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.push(n);
		while(!s1.isEmpty()){
			s2.push(s1.pop());
			Node curr = s2.peek();
			if(curr.left != null){
				s1.push(curr.left);
			}if(curr.right != null){
				s1.push(curr.right);
			}
		}
		while(!s2.isEmpty()){
			Node temp = s2.pop();
			System.out.print(temp.data+" ");
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
		postOrderTraversal(head);
	}

}
