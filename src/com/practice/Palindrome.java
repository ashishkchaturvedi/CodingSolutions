package com.practice;

import java.util.Stack;

public class Palindrome {
	
	Node head;
	public boolean isPalindrome(Node n){
		Stack<Integer> stack = new Stack<Integer>();
		
		Node runner = n;
		Node curr = n;
		
		while(runner != null && runner.next != null){
			stack.push(curr.data);
			curr = curr.next;
			runner = runner.next.next;
		}
		if(runner != null){
			curr = curr.next;
		}
		
		while(curr != null){
			if(curr.data != stack.pop().intValue()){
				return false;
			}
			curr = curr.next;
		}
		
		return true;		
		
	}

	public static void main(String args[]){
		Palindrome p = new Palindrome();
		p.head = new Node(1);
		p.head.next = new Node(2);
		p.head.next.next = new Node(3);
		p.head.next.next.next = new Node(3);
		p.head.next.next.next.next = new Node(2);
		p.head.next.next.next.next.next = new Node(1);
		
		System.out.println(p.isPalindrome(p.head) ? "It is a palindrome" : "Not a palindrome");
		
	}
}
