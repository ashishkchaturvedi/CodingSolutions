package com.linkedList;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle {
	static Node head;
	public static boolean hasCycle(Node n){
		if(n == null) return false;
		
		Set<Node> visited = new HashSet<Node>();
		Node curr = n;
		while(curr != null){
			if(visited.contains(curr)) return true;
			visited.add(curr);
			curr = curr.next;
		}
		return false;
	}	

	public static void main(String args[]){
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = head.next;
		
		if(hasCycle(head)){
			System.out.println("Has cycle");
		} else {
			System.out.println("Doesn't have cycle");
		}
	}

}
