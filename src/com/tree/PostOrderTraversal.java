package com.tree;

import java.util.Stack;

/*
         5
       /   \
      2     3
    /   \ /   \
   1    4 6    7

Inorder   = 1 2 4 5 6 3 7
postorder = 1 4 2 6 7 3 5 
*/

public class PostOrderTraversal {

static Node head;
public static void postorderTraversal(Node n){
	Stack<Node> s = new Stack<Node>();
	Node curr = n;
	while(curr != null || !s.isEmpty()){
		if(curr != null){
			s.push(curr);
			curr = curr.left;
		}else{
			Node temp = s.peek().right;
			if(temp != null){
				curr = temp;
			}else{
				temp = s.pop();
				System.out.print(temp.data+" ");
				while(!s.isEmpty() && s.peek().right == temp){
					temp = s.pop();
					System.out.print(temp.data+" ");
				}
			}
		}
	}
}

public static void main(String args[]){
	head = new Node(5);
	head.left = new Node(2);
	head.right = new Node(3);
	head.left.left = new Node(1);
	head.left.right = new Node(4);
	head.right.left = new Node(6);
	head.right.right = new Node(7);
	
	postorderTraversal(head);
}

}
