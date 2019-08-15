package com.tree;

import com.tree.InorderWithoutRecursion.Node;

public class CheckForBST {
	
	Node root;
	
	public boolean isBST(Node n){
		return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public boolean isBST(Node n, int min, int max){
		if(n == null){
			return true;
		}
		
		if (n.data < min || n.data > max){
			return false;
		}
		
		return isBST(n.left, min, n.data) && isBST(n.right, n.data+1, max);
	}

	public static void main(String[] args) {
		CheckForBST it = new CheckForBST();
		//InorderTraversal it = new InorderTraversal();
		it.root = new Node(5);
		it.root.left = new Node(3);
		it.root.right = new Node(7);
		it.root.left.left = new Node(1);
		it.root.left.right = new Node(4);
		it.root.right.left = new Node(6);
		it.root.right.right = new Node(8);
		
		if(it.isBST(it.root)){
			System.out.println("It is a BST");
		} else {
			System.out.println("Not a BST");
		}

	}

}
