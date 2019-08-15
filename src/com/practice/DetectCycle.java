package com.practice;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle {
	static Node head;
	public static boolean hasCycle(Node n){
		if(n == null) return false;
		
		Set<Node> visited = new HashSet<Node>();
		Node temp = n;
		while(temp != null){
			if(visited.contains(temp)) return true;
			visited.add(temp);
			temp = temp.next;
		}
		return false;
	}

	public static void main(String args[]){
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		//head.next.next.next.next = head.next;
		
		if(hasCycle(head)){
			System.out.println("It has cycle");
		}else{
			System.out.println("Don't have cycle");
		}
	}

}
