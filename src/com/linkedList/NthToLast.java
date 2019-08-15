package com.linkedList;

public class NthToLast {
	Lnode head;
	//Node head;

	public static int nthToLast(Lnode n, int k){
		Lnode curr = n;
		Lnode follower = n;
		int i = 0;
		while(i <= k){
			curr = curr.next;
			i++;
		}
		
		while(curr != null){
			curr = curr.next;
			follower = follower.next;
		}
		
		return follower.data;
	}

	public static void main(String args[]){
		NthToLast n = new NthToLast();
		n.head = new Lnode(1);
		n.head.next = new Lnode(2);
		n.head.next.next = new Lnode(3);
		n.head.next.next.next = new Lnode(4);
		n.head.next.next.next.next = new Lnode(5);
		
		System.out.println(nthToLast(n.head, 4));
	}

}
