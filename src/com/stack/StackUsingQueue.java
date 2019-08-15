package com.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> primary = new LinkedList<Integer>();
	Queue<Integer> secondary = new LinkedList<Integer>();
	
	public void push(int x){
		secondary.add(x);
		
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
		StackUsingQueue s = new StackUsingQueue();
		s.push(1);;
		s.push(4);
		s.push(9);
		s.push(11);
		System.out.println(s.pop());
	}

}
