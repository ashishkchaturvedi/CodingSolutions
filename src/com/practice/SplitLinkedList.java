package com.practice;



public class SplitLinkedList {
	static Node head;

	public static void split(Node n){

		Node slow = n;
		Node fast = n;
		while(fast != null && fast.next != null){
			System.out.print(slow.data+" ");
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node secondList = slow;
		
		System.out.println();
		
		while(secondList != null){
			System.out.print(secondList.data+" ");
			secondList  = secondList.next;
		}
	}

//	public static void insert(int data){
//		Node n = new Node(data);
//		n.next = head;
//		head = n;
//	}

	public static void main(String args[]){
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(6);
		head.next.next.next.next = new Node(4);
		head.next.next.next.next.next = new Node(8);
		split(head);
	}

}
