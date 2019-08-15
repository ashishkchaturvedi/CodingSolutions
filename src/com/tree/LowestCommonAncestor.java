package com.tree;

public class LowestCommonAncestor {
	static Tree root;
	public static Tree lca(Tree root, int n1, int n2){
		if(root == null) return null;
		if(root.value == n1 || root.value == n2) return root;
		
		Tree left = lca(root.left, n1, n2);
		Tree right = lca(root.right, n1, n2);
		
		if(left != null && right != null) return root;
		if(left == null && right == null) return null;
		
		return left != null ? left : right;
	}

	public static void main(String args[]){
		
		root = new Tree(1);
		root.left  = new Tree(2);
		root.right = new Tree(3);
		root.left.left = new Tree(4);
		root.left.right = new Tree(5);
		root.right.left = new Tree(6);
		root.right.right = new Tree(7);
		
		
		System.out.println(lca(root, 2, 5).value);
	}

}
