package com.linkedList;

import java.util.HashSet;
import java.util.Set;

class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class DedupLinkedList {
	static Node head;
	public static Node dedup(Node n){
		if(n == null) return null;
		Node prev = null;
		Node temp = n;
		Set<Integer> visited = new HashSet<Integer>();
		
		while(temp != null){
			if(visited.contains(temp.data)){
				prev.next = temp.next;
			}else{
				visited.add(temp.data);
				prev = temp;
			}
			temp = temp.next;
		}
		return n;
	} 

	public static void main(String args[]){
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(1);
		
		Node res = dedup(head);
		
		while(res != null){
			System.out.print(res.data+" ");
			res = res.next;
		}
	}

}
