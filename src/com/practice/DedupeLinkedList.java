package com.practice;

import java.util.HashSet;
import java.util.Set;
class Node1{
	int data;
	Node1 next;
	
	public Node1(int data){
		this.data = data;
		this.next = null;
	}
}

public class DedupeLinkedList {
	static Node1 head;
	public static void dupe(Node1 n){
		if(n == null) return;
		Set<Integer> nodes = new HashSet<Integer>();
		Node1 prev = null;
		Node1 temp = n;
		while(temp != null){
			if(nodes.contains(temp.data)){
				prev.next = temp.next;
			}else{
				nodes.add(temp.data);
				prev = temp;
			}
			temp = temp.next;
		}
		while(n != null){
			System.out.print(n.data+" ");
			n = n.next;
		}
	}

	public static void main(String args[]){
		head = new Node1(1);
		head.next = new Node1(2);
		head.next.next = new Node1(3);
		head.next.next.next = new Node1(2);
		head.next.next.next.next = new Node1(1);
		dupe(head);
	}
}
