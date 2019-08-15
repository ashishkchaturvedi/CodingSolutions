package com.practice;

class Node{
	int data;
	Node next;
	Node oldMax;
	public Node left;
	//public Node right;
	public Node right;
	
	public Node(int data){
		this.data = data;
		this.next = this.oldMax = null;
	}
}

public class NthToLast {

Node head;

public  NthToLast(){
	head = null;
}

public static int nthToLast(Node n, int k){
	int count  = 0;
	Node curr = n;
	while (n != null){
		n = n.next;
		count ++;
	}
	
	if (k > count){
		return 0;
	}
	
	int ele = count - k;
	int i = 0;
	while(i < ele-1){
		curr = curr.next;
		i++;
	}
	
	return curr.data;
}

public static void main(String args[]){
	NthToLast n = new NthToLast();
	n.head = new Node(1);
	n.head.next = new Node(2);
	n.head.next.next = new Node(3);
	n.head.next.next.next = new Node(4);
	n.head.next.next.next.next = new Node(5);
	
	System.out.println(nthToLast(n.head, 1));
	
}

}
