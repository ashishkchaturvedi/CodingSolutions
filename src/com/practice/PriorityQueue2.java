package com.practice;

public class PriorityQueue2 {
	int size;
	int[] heap;
	
	public PriorityQueue2(int maxSize){
		this.size = 0;
		heap = new int[maxSize];
	}
	
	public void push(int value){
		if(size  == heap.length) throw new IllegalArgumentException();
		int pos = size;
		heap[pos] = value;
		
		while(pos > 0){
			int parent = (pos + 1) / 2 - 1;
			if(heap[parent] >= heap[pos]) break;
			swapIndices(parent, pos);
			pos = parent;
		}
		size++;
	}
	
	public int pop(){
		if(size == 0) throw new IllegalArgumentException();
		int value = heap[0];
		heap[0] = heap[size - 1];
		
		int pos = 0;
		while(pos < size / 2){
			int leftChild = (pos * 2) + 1;
			int rightChild = leftChild + 1;
			if(rightChild < size && heap[leftChild] < heap[rightChild]){
				if(heap[rightChild] <= heap[pos]) break;
				swapIndices(pos, rightChild);
				pos = rightChild;
			}else{
				if(heap[leftChild] <= heap[pos]) break;
				swapIndices(pos, leftChild);
				pos = leftChild;
			}
		}
		size--;
		return value;
	}
	
	
	public void swapIndices(int i, int j){
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	public static void main(String args[]){
		PriorityQueue q = new PriorityQueue(10);
		q.push(1);
		q.push(9);
		q.push(8);
		q.push(7);;
		q.push(10);
		System.out.println(q.pop());
	}

}
