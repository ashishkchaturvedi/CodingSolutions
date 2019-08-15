package com.practice;

import java.util.Stack;

public class Reverse {
	
	Node head;
	
	
	public void reverse(Node n){
		Stack<Integer> s = new Stack<Integer>();
		
		while(n != null){
			s.push(n.data);
			n = n.next;
		}
		
		while(!s.isEmpty()){
			System.out.println(s.pop().intValue());
		}
	}

	public static void main(String args[]){
		Reverse r = new Reverse();
		r.head = new Node(1);
		r.head.next = new Node(4);
		r.head.next.next = new Node(6);
		r.head.next.next.next = new Node(9);
			
		r.reverse(r.head);
	}

}
