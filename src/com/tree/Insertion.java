package com.tree;

import java.util.LinkedList;
import java.util.Queue;
/*
class Node{
	int data;
	Node left, right;
	
	public Node(int d){
		this.data = d;
		left = right = null;
	}
}*/

public class Insertion {
	
	 Node root;
	 //Node temp = root;
	
	void printInorder(Node temp){
		if(temp == null){
			return;
		}
		
		printInorder(temp.left);
		System.out.print(temp.data+"->");
		printInorder(temp.right);
	}
	
	void insert(Node temp, int data){
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		
		while(!q.isEmpty()){
			temp = q.peek();
			q.remove();
			
			if(temp.left == null){
				temp.left = new Node(data);
				break;
			} 
			else {
				q.add(temp.left);
			}
			
			if(temp.right==null){
				temp.right = new Node(data);
				break;
			}
			else {
				q.add(temp.right);
			}
		}
	}
	
	public static void main(String args[]){
		
		Insertion in = new Insertion();
		in.root = new Node(10);
		in.root.left = new Node(11);
		in.root.right = new Node(9);
		in.root.left.left = new Node(7);
		in.root.right.left = new Node(15);
		in.root.right.right = new Node(8);
		//in.root.left.right.left= new Node(22);
		
		in.printInorder(in.root);
		System.out.print("null");
		
		System.out.println();
		
		in.insert(in.root, 12);
		
		in.printInorder(in.root);
		System.out.print("null");
		
		System.out.println();
		
		in.insert(in.root, 19);
		
		in.printInorder(in.root);
		System.out.print("null");
		
		System.out.println();
		
		in.insert(in.root, 36);
		
		in.printInorder(in.root);
		System.out.print("null");
		
		System.out.println();
		
		in.insert(in.root, 42);
		
		in.printInorder(in.root);
		System.out.print("null");
	}

}
