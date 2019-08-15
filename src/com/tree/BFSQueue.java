package com.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.tree.InorderWithoutRecursion.Node;

public class BFSQueue {

	Node root;
	
	public void traverse(Node n){
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(n);
		while(!q.isEmpty()){
			
			Node e = q.peek();
			if(e.left!=null){
				q.add(e.left);
			}
			if(e.right!=null){
				q.add(e.right);
			}
			System.out.print(q.poll().data+" ");
		}
		
	}
	
	public static void main(String[] args) {
		BFSQueue it = new BFSQueue();
		it.root = new Node(5);
		it.root.left = new Node(3);
		it.root.right = new Node(7);
		it.root.left.left = new Node(1);
		it.root.left.right = new Node(4);
		it.root.right.left = new Node(6);
		it.root.right.right = new Node(8);
		it.traverse(it.root);

	}

}
