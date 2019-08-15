package com.practice;

import java.util.Stack;

public class InorderTraversal {
	Tree root = null;
			public void traverse(Tree n){
				Stack<Tree> s = new Stack<Tree>();
				addLeftToStack(s, n);
				while(!s.isEmpty()){
					Tree curr = s.pop();
					System.out.println(curr.data+" ");
					if(curr.right != null){
						addLeftToStack(s, curr.right);
					}
				}
			}

			private void addLeftToStack(Stack<Tree> s, Tree n){
				while(n != null){
					s.push(n);
					n = n.left;
				}
			}

			public static void main(String args[]){
				InorderTraversal it = new InorderTraversal();
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
