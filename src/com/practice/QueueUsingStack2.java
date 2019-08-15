package com.practice;

import java.util.Stack;

public class QueueUsingStack2 {
	Stack<Integer> primary = new Stack<Integer>();
	Stack<Integer> secondary = new Stack<Integer>();

	public void enqueue(int value){
		primary.push(value);
	}
	
	public int dequeue(){
		while(!primary.isEmpty()){
			secondary.push(primary.pop());
		}
		
		int value =  secondary.pop();
		
		while(!secondary.isEmpty()){
			primary.push(secondary.pop());
		}
		return value;
		
	}
	
	public static void main(String args[]){
	
		QueueUsingStack2 q = new QueueUsingStack2();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println("Dequeued: "+q.dequeue());
		q.enqueue(6);
		System.out.println("Dequeued: "+q.dequeue());
		System.out.println("Dequeued: "+q.dequeue());
		System.out.println("Dequeued: "+q.dequeue());
		System.out.println("Dequeued: "+q.dequeue());
		System.out.println("Dequeued: "+q.dequeue());
	}

}
