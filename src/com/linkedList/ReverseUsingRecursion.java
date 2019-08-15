package com.linkedList;

public class ReverseUsingRecursion {
	
	static Lnode head;
	
	public void printReverse(Lnode n){
		if(n == null){
			return;
		}
		printReverse(n.next);
		System.out.print(n.data+"->");
		
	}

	public static void main(String[] args) {
		ReverseUsingRecursion r = new ReverseUsingRecursion();
		head = new Lnode(1);
		head.next = new Lnode(4);
		head.next.next = new Lnode(6);
		head.next.next.next = new Lnode(9);
		
		//r.reverse(r.head);
		
		r.printReverse(head);
		System.out.print("null");

	}

}
