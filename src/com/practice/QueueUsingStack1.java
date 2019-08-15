package com.practice;

import java.util.Stack;

public class QueueUsingStack1 {
	Stack<Integer> primary = new Stack<Integer>();
	Stack<Integer> secondary = new Stack<Integer>();
	
	public void enqueue(int value){
		while(!primary.isEmpty()){
			secondary.push(primary.pop());
		}
		
		primary.push(value);
		
		while(!secondary.isEmpty()){
			primary.push(secondary.pop());
		}
	}
	
	public int dequeue(){
		if(primary.isEmpty()) throw new IndexOutOfBoundsException();
		return primary.pop();
	}
	
	public static void main(String args[]){
		QueueUsingStack1 q = new QueueUsingStack1();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println("Dequeued: "+q.dequeue());
		System.out.println("Dequeued: "+q.dequeue());
		System.out.println("Dequeued: "+q.dequeue());
	}

}
