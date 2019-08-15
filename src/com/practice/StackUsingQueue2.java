package com.practice;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue2 {
	Queue<Integer> primary = new LinkedList<Integer>();
	Queue<Integer> secondary = new LinkedList<Integer>();
	
	public void push(int value){
		primary.add(value);
	}
	
	public int pop(){
	
		if(primary.isEmpty()) throw new IndexOutOfBoundsException();
		
		while(primary.size() != 1){
			secondary.add(primary.remove());
		}
		
		Queue<Integer> temp = primary;
		primary = secondary;
		secondary = temp;
		
		return secondary.remove();
	}
	
	public static void main(String args[]){
		StackUsingQueue2 s = new StackUsingQueue2();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println("Popped: "+s.pop());
		System.out.println("Popped: "+s.pop());
		System.out.println("Popped: "+s.pop());
		System.out.println("Popped: "+s.pop());
		System.out.println("Popped: "+s.pop());
		//System.out.println("Popped: "+s.pop());
	}

}
