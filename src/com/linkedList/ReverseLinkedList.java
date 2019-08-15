package com.linkedList;

public class ReverseLinkedList {
	static Node head;
	public static Node reverse(Node n){
		if(n == null) return n;
		Node prev = null;
		Node curr = n;
		Node next = null;
		
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		n = prev;
		return n;
	}

	public static void main(String args[]){
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next= new Node(4);
		
		Node res = reverse(head);
		while(res != null){
			System.out.print(res.data+" ");
			res = res.next;
		}
	}

}
