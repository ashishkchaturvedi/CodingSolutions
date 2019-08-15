package com.practice;

public class PriorityQueue {
	int size;
	int heap[];
	
	public PriorityQueue(int maxCapacity){
		this.heap = new int[maxCapacity];
		size = 0;
	}
	
	public void push(int value){
		if(size == heap.length) throw new IllegalArgumentException();
		
		int pos  = size;
		heap[pos] = value;
		
		while(pos > 0){
			int parent = ((pos + 1) / 2) - 1;
			if(heap[parent] >= heap[pos]) break;
			swapIndices(parent, pos);
			pos = parent;
		}
		size++;
	}
	
	public void swapIndices(int a, int b){
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	
	public int pop(){
		if(size == 0) throw new IllegalStateException();
		int toReturn = heap[0];
		heap[0] = heap[size - 1];
		
		int pos = 0;
		while(pos < size/2){
			int leftChild = (pos * 2) + 1;
			int rightChild = leftChild + 1;
			
			if(rightChild < size && heap[leftChild] < heap[rightChild]){
				if(heap[rightChild] <= heap[pos]) break;
				swapIndices(pos, rightChild);
				pos = rightChild;
			}else {
				if(heap[leftChild] < heap[pos]) break;
				swapIndices(pos, leftChild);
				pos = leftChild;
			}
		}
		size--;
		return toReturn;
	}
	
	public static void main(String args[]){
		PriorityQueue p = new PriorityQueue(5);
		p.push(4);
		p.push(3);
		p.push(1);
		p.push(12);
		p.push(11);
		System.out.println("Popped: "+p.pop());
	}

}
