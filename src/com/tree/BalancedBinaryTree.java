package com.tree;

class Tree{
	int value;
	Tree left, right;
	
	public Tree(int value) {
		this.value = value;
		left = right = null;
	}
}

public class BalancedBinaryTree {

	Tree root;

	public boolean isBalanced(Tree n){
		if(balancedHeight(n)  > -1) return true;
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
		BalancedBinaryTree t = new BalancedBinaryTree();
		t.root = new Tree(1);
		t.root.left = new Tree(2);
		t.root.right = new Tree(3);
		t.root.left.left = new Tree(4);
		t.root.right.left = new Tree(6);
		t.root.right.right = new Tree(7);
		
		System.out.println((t.isBalanced(t.root)) ? "Tree is balanced" : "Tree is not balanced");
	}

}
