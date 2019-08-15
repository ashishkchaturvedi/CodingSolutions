package com.practice;

public class NStack {
	int[] topOfStack;
	int[] stackData;
	int[] nextIndex;
	
	int nextAvailable = 0;

	public NStack(int numOfStacks, int capacity){
		topOfStack = new int[numOfStacks];
		stackData  = new int[capacity];
		nextIndex = new int[capacity];
		
		for(int i = 0; i < numOfStacks; i++){
			topOfStack[i] = -1;
		}
		
		for(int i = 0; i < nextIndex.length - 1; i++){
			nextIndex[i] = i + 1;
		}
		nextIndex[nextIndex.length - 1]  = -1;
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
		if(stack < 0 || stack >= topOfStack.length) throw new IndexOutOfBoundsException();
		
		int currentIndex = topOfStack[stack];
		int value = stackData[currentIndex];
		topOfStack[stack] = nextIndex[currentIndex];
		nextIndex[currentIndex] = nextAvailable;
		nextAvailable = currentIndex;
		
		return value;
	}
	
	public static void main(String args[]){
		NStack n = new NStack(3, 8);
		
		n.push(0, 5);
		n.push(1, 2);
		n.push(2, 8);
		n.push(0, 12);
		n.push(1, 14);
		n.push(1, 15);
		System.out.println("Popped: "+n.pop(0));
		System.out.println("Popped: "+n.pop(1));
		System.out.println("Popped: "+n.pop(2));
	}

}
