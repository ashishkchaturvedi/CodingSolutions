package com.linkedList;

public class FloydWarshall {
	
	static Node head;
	public static boolean hasCycle(Node n){
		if(n == null) return false;
		Node slow = n;
		Node fast = n.next;
		
		while(fast != null && fast.next != null){
			if(fast == slow) return true;
			slow = slow.next;
			fast  = fast.next.next;
		}
		return false;
	}


	public static void main(String args[]){
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		//head.next.next.next.next.next = head.next;
		if(hasCycle(head)){
			System.out.println("Has cycle");
		} else {
			System.out.println("Doesn't have cycle");
		}
	}

}
