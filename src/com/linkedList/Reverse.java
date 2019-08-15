package com.linkedList;

import java.util.Stack;

public class Reverse {
	
	Lnode head;
	
	public Reverse (){
		head = null;
	}
	
	public void reverse(Lnode n){
		Stack<Integer> s = new Stack<Integer>();
		Lnode curr = n;
		while(curr != null){
			s.push(curr.data);
			curr = curr.next;
		}
		while(!s.isEmpty()){
			System.out.print(s.pop().intValue()+" ");
		}
	}

	public static void main(String[] args) {
		
		Reverse r = new Reverse();
		r.head = new Lnode(1);
		r.head.next = new Lnode(4);
		r.head.next.next = new Lnode(6);
		r.head.next.next.next = new Lnode(9);
		
		r.reverse(r.head);

	}

}
