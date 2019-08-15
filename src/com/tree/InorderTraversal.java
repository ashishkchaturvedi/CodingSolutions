package com.tree;

import com.tree.InorderWithoutRecursion.Node;

public class InorderTraversal {

	Node root;

	InorderTraversal(){
		root = null;
	}
	
	public void ITraversal(Node node){
		if(node == null){
			return;
		}
		
		ITraversal(node.left);
		System.out.print(node.data+" ");
		ITraversal(node.right);
	}

	public static void main(String[] args) {
		
		InorderTraversal it = new InorderTraversal();
		it.root = new Node(5);
		it.root.left = new Node(3);
		it.root.right = new Node(7);
		it.root.left.left = new Node(1);
		it.root.left.right = new Node(4);
		it.root.right.left = new Node(6);
		it.root.right.right = new Node(8);
		
		
		
		it.ITraversal(it.root);

	}

}
