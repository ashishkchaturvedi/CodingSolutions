package com.practice;

public class FloydWarshall2 {
	static Node head;
	public static boolean hasCycle(Node n){
		if(n == null) return false;
		Node slow = n;
		Node fast  = n.next;
		
		while(fast != null && fast.next != null){
			if(slow == fast) return true;
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}

	public static void main(String args[]){
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		//head.next.next.next = head.next;
		
		System.out.println(hasCycle(head) ? "It has Cycle" : "It doesn't have cycle");
	}

}
