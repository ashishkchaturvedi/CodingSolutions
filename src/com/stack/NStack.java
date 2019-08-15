package com.stack;

public class NStack {
	int[] topOfStack;
	int[] stackData;
	int[] nextIndex;
	
	int nextAvailable = 0;
	
	public NStack(int numStack, int capacity){
		topOfStack = new int[numStack];
		for(int i = 0; i< topOfStack.length; i++){
			topOfStack[i] = -1;
		}
		stackData = new int[capacity];
		nextIndex = new int[capacity];
		
		for(int i = 0; i < nextIndex.length - 1; i++){
			nextIndex[i] = i+1;
		}
		nextIndex[nextIndex.length - 1] = -1;
	}
	
	public void push(int stack, int value){
		if(stack < 0 || stack >= topOfStack.length) throw new IndexOutOfBoundsException();
		
		if(nextAvailable < 0) return;
		
		int currentIndex = nextAvailable;
		nextAvailable = nextIndex[currentIndex];
		stackData[currentIndex] = value;
		nextIndex[currentIndex] = topOfStack[stack];
		topOfStack[stack] = currentIndex; 
	}
	
	public int pop(int stack){
		if(stack < 0 || stack >= topOfStack.length || topOfStack[stack] < 0) throw new IndexOutOfBoundsException();
		
		int currentIndex = topOfStack[stack];
		int value = stackData[currentIndex];
		topOfStack[stack] = nextIndex[currentIndex];
		nextIndex[currentIndex] = nextAvailable;
		nextAvailable = currentIndex;
		return value;
	}
	
	public static void main(String args[]){
		
		NStack ns = new NStack(2, 5);
		ns.push(0, 5);
		ns.push(0, 8);
		ns.push(1, 3);
		ns.push(0, 12);
		System.out.println(ns.pop(0));
		System.out.println(ns.pop(1));
		System.out.println(ns.pop(0));
		System.out.println(ns.pop(0));
	}

}
