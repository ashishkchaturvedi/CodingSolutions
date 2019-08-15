package com.tree;

/*       10
      /      \
    -5        16
   /   \        \
 -8     7 	     18
 /
6	


parent     current
null      10
10        -5
-5        7
7         null*/


public class BSTInsertion {
	static Tree root;	   
	public static Tree BSTInsert(Tree root, int data){
		Tree node  = new Tree(data);
		if(root == null) return node;
		
		Tree parent = null, current = root;
		
		while(current != null){
			parent  = current;
			if(current.value <= data){
				current = current.right;
			}else{
				current = current.left;
			}
		}
		
		if(parent.value <= data){
			parent.right = node;
		}else{
			parent.left = node;
		}
		return root;
	}

	public static void inorder(Tree root){
		if(root == null) return;
		
		inorder(root.left);
		System.out.print(root.value+" ");
		inorder(root.right);
	}

	public static void main(String args[]){
		root = new Tree(10);
		root.left = new Tree(-5);
		root.left.left = new Tree(-8);
		root.left.right = new Tree(7);
		root.right = new Tree(16);
		root.right.right = new Tree(18);
		BSTInsert(root, 6);
		inorder(root);
	}

}
