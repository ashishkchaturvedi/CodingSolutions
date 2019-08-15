package com.practice;

public class ReverseUsingRecursion {
	
	private Node head;

	public void reverse(Node n){
	
		if(n == null) return;
		reverse(n.next);
		System.out.println(n.data);
	}

	public static void main(String args[]){
		ReverseUsingRecursion r = new ReverseUsingRecursion();
		r.head = new Node(1);
		r.head.next = new Node(4);
		r.head.next.next = new Node(6);
		r.head.next.next.next = new Node(9);
			
		r.reverse(r.head);
	}

}
