package com.practice;

class Tree{
	int data;
	Tree left, right;
	
	public Tree(int data){
		this.data = data;
		this.left = this.right = null;
	}
}

public class CheckBST {
	Tree root;

	public static boolean isBST(Tree n){
		return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean isBST(Tree n, int min, int max){
		if(n == null){
			return true;
		}
		
		if(n.data < min || n.data > max){
			return false;
		}
		
		return isBST(n.left, min, n.data) && isBST(n.right, n.data+1, max);
	}

	public static void main(String args[]){
		CheckBST it = new CheckBST();
		it.root = new Tree(5);
		it.root.left = new Tree(3);
		it.root.right = new Tree(7);
		it.root.left.left = new Tree(1);
		it.root.left.right = new Tree(4);
		it.root.right.left = new Tree(6);
		it.root.right.right = new Tree(8);
		
		System.out.println(isBST(it.root) ? "It is a BST" : "It is not a BST");
		
	}


}
