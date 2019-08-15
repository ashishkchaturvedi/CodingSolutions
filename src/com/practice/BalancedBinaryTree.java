package com.practice;

/*class Tree{
	int data;
	Tree left, right;
	
	public Tree(int data){
		this.data = data;
		left = right = null;
	}
}*/

public class BalancedBinaryTree {
	Tree root;
	public boolean isBinaryTree(Tree n){

		if(balancedHeight(n) > -1) return true;
		return false;
	}

	private int balancedHeight(Tree n){
		if(n == null) return 0;
		
		int h1 = balancedHeight(n.left);
		int h2 = balancedHeight(n.right);
		
		if(h1 == -1 || h2 == -1) return -1;
		if(Math.abs(h1 - h2) > 1) return -1;
		
		if(h1 > h2) return h1 + 1;
		return h2 + 1;
	}

	public static void main(String args[]){
		BalancedBinaryTree b = new BalancedBinaryTree();
		
		b.root = new Tree(1);
		b.root.left = new Tree(2);
		b.root.right = new Tree(3);
		b.root.left.left = new Tree(4);
		b.root.right.left = new Tree(6);
		b.root.right.right = new Tree(7);
		
		System.out.println(b.isBinaryTree(b.root) ? "It is a balanced binary tree" : "Not a abalnced binary tree");
	}

}
