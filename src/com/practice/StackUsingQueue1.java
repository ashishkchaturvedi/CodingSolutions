package com.practice;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue1 {
	Queue<Integer> primary = new LinkedList<Integer>();
	Queue<Integer> secondary = new LinkedList<Integer>();
	
	public void push(int value){
		secondary.add(value);
		
		while(!primary.isEmpty()){
			secondary.add(primary.remove());
		}
		
		Queue<Integer> temp = primary;
		primary = secondary;
		secondary = temp;
	}
	
	public int pop(){
		if(primary.isEmpty()) throw new IndexOutOfBoundsException();
		return primary.remove();
	}


	public static void main(String args[]){
		StackUsingQueue1 s  = new StackUsingQueue1();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println("Popped: "+s.pop());
		System.out.println("Popped: "+s.pop());
		System.out.println("Popped: "+s.pop());
		System.out.println("Popped: "+s.pop());
		//System.out.println("Popped: "+s.pop());
	}


}
