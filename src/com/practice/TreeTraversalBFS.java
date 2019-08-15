package com.practice;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversalBFS {
	static Tree root;
	public static void traversal(Tree n){
		Queue<Tree> q = new LinkedList<Tree>();
		q.add(n);
		while(!q.isEmpty()){
			Tree temp  = q.peek();
			q.remove();
			System.out.print(temp.data+" ");
			if(temp.left!= null){
				q.add(temp.left);
			}
			if(temp.right != null){
				q.add(temp.right);
			}
		}
	}

	public static void main(String args[]){
		root = new Tree(1);
		root.left = new Tree(2);
		root.right = new Tree(3);
		root.left.left = new Tree(4);
		root.left.right = new Tree(5);
		root.right.left = new Tree(6);
		root.right.right = new Tree(7);
		
		traversal(root);
	}

}
