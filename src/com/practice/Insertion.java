package com.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Insertion {
	
	static Tree root;
	public static void insert(Tree temp, int value){
		Queue<Tree> q = new LinkedList<Tree>();
		
		q.add(temp);
		
		while(!q.isEmpty()){
			temp = q.peek();
			q.remove();
			if(temp.left == null){
				temp.left = new Tree(value);
				break;
			}else{
				q.add(temp.left);
			}
			if(temp.right == null){
				temp.right = new Tree(value);
				break;
			}else{
				q.add(temp.right);
			}
		}
	}

	public static void inorder(Tree n){
		if(n == null) return;
		inorder(n.left);
		System.out.print(n.data+" ");
		inorder(n.right);
	}

	public static void main(String args[]){
		root = new Tree(1);
		insert(root, 2);
		insert(root, 3);
		insert(root, 4);
		insert(root, 5);
		insert(root, 6);
		insert(root, 7);
		//insert(root, 7);
		
		inorder(root);
		
	}

}
