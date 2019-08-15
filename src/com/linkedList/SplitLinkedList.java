package com.linkedList;

public class SplitLinkedList {
	
	public static Lnode head;
	
	public static void split(Lnode n){
		Lnode ll1 = n;
		Lnode runner = n;
		while(runner != null && runner.next != null){
			System.out.print(ll1.data+"->");
			ll1 = ll1.next;
			runner = runner.next.next;
		}
		
		//ll2 = ll1;
		System.out.println();
		
		while(ll1 != null){
			System.out.print(ll1.data+"->");
			ll1 = ll1.next;
		}
		
	}
	
	public void insert(int n){
		Lnode newNode = new Lnode(n);
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = new Lnode(1);
		head.next = new Lnode(2);
		head.next.next = new Lnode(3);
		head.next.next.next = new Lnode(6);
		head.next.next.next.next = new Lnode(4);
		//head.next.next.next.next.next = new Lnode(8);
		
		split(head);

	}

}
