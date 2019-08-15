package com.practice;

import java.util.LinkedList;
import java.util.Queue;
/*
class Tree{
	int data;
	Tree left;
	Tree right;
	
	public Tree(int data){
		this.data = data;
		left = right = null;
	}
}*/

public class BFSQueue {
	Tree root;
	public void traverse(Tree n){
		Queue<Tree> q = new LinkedList<Tree>();
		
		q.add(n);
		
		while(!q.isEmpty()){
			Tree front = q.peek();
			
			if(front.left != null) q.add(front.left);
			
			if(front.right != null) q.add(front.right);
			
			System.out.print(q.poll().data+" ");
		}
	}

	public static void main(String args[]){
		BFSQueue it = new BFSQueue();
		it.root = new Tree(5);
		it.root.left = new Tree(3);
		it.root.right = new Tree(7);
		it.root.left.left = new Tree(1);
		it.root.left.right = new Tree(4);
		it.root.right.left = new Tree(6);
		it.root.right.right = new Tree(8);
		it.traverse(it.root);
	}

}
