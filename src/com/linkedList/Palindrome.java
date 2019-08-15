package com.linkedList;

import java.util.Stack;

class Lnode{
	int data;
	Lnode next;
	
	public Lnode(int d){
		this.data = d;
		this.next = null;
	}
}

public class Palindrome {
	
	Lnode head;
	
	public Palindrome(){
		head = null;
	}
	
	public boolean palindrome(Lnode n){
		Lnode curr = n;
		Lnode runner = n;
		 
		Stack<Integer> s = new Stack<Integer>();
		
		while(runner != null && runner.next != null){
			s.push(curr.data);
			curr = curr.next;
			runner = runner.next.next;
		}
		
		if(runner != null){
			curr = curr.next;
		}
		
		while(curr != null){
			if(s.pop().intValue() != curr.data){
				return false;
			}
			curr = curr.next;
		}
		return true;
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.head = new Lnode(1);
		p.head.next = new Lnode(2);
		p.head.next.next = new Lnode(3);
		p.head.next.next.next = new Lnode(3);
		p.head.next.next.next.next = new Lnode(2);
		p.head.next.next.next.next.next = new Lnode(1);
		
		if(p.palindrome(p.head)){
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
