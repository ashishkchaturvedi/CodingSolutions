package com.practice;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle2 {
	static Node head;
	public static boolean hasCycle(Node n){
		if (n == null) return false;
		Set<Node> visited = new HashSet<Node>();
		
		while(n != null){
			if(visited.contains(n)) return true;
			else{
				visited.add(n);
				n = n.next;
			}
		}
		return false;
	}

	public static void main(String args[]){
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		//head.next.next.next = head.next;
		
		System.out.println(hasCycle(head) ? "It has cycle" : "It doesn't have cycle");
	}

}
