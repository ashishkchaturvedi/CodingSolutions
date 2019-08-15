package com.tree;

class Node {
	int data;
	Node left, right;
	
	public Node(int d){
		this.data = d;
		left = right = null;
	}
}

public class LevelOrderTraversalRecursion { 
	
	Node root;
	public LevelOrderTraversalRecursion(){
		root = null;
	}
	
	void printGivenLevel(){
		int h = height(root);
		for(int i = 1; i<=h; i++){
			printGivenOrder(root, i);
		}
	}
	
	int height(Node root){
		if(root == null){
			return 0;
		}
		else {
			int lHeight = height(root.left);
			int rHeight = height(root.right);
			
			if(lHeight > rHeight){
				return (lHeight+1);
			}
			else {
				return (rHeight+1);
			}
		}
	}
	
	void printGivenOrder(Node root, int level){
		if(root == null){
			return;
		}
		else if(level == 1){
			System.out.print(root.data+"->");
		}
		else if(level > 1){
			printGivenOrder(root.left, level-1);
			printGivenOrder(root.right, level-1);
		}
	}
	
	public static void main(String args[]){
		LevelOrderTraversalRecursion l = new LevelOrderTraversalRecursion();
		l.root = new Node(1);
		l.root.left = new Node(2);
		l.root.right = new Node(3);
		l.root.left.left = new Node(4);
		l.root.left.right = new Node(5);
		
		l.printGivenLevel();
		System.out.print("null");
	}

}
