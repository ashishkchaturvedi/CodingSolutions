package com.queue;

public class PriorityQueue {
	int size;
	int[] heap;
	
	public PriorityQueue(int maxSize){
		this.heap = new int[maxSize];
		size = 0;
	}

	public void push(int value){
		if(size == heap.length) throw new IllegalStateException();
	
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

	private void swapIndices(int i, int j){
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public int pop(){
		if(size == 0) throw new IllegalArgumentException();
		int toReturn = heap[0];
		heap[0] = heap[size - 1];
	
		int pos = 0;
		while(pos < size/2){
			int leftChild = (pos * 2) + 1;
			int rightChild = leftChild + 1;
		
			if(rightChild < size && heap[leftChild] < heap[rightChild]){
				if(heap[rightChild] <= heap[pos])break;
				swapIndices(pos, rightChild);
				pos = rightChild;
			}else {
				if(heap[leftChild] <= heap[pos]) break;
				swapIndices(pos, leftChild);
				pos = leftChild;
			}
		}
		size--;
		return toReturn;
	}
	
	public static void main(String args[]){
		PriorityQueue pq = new PriorityQueue(5);
		pq.push(8);
		pq.push(7);
		pq.push(1);
		pq.push(9);
		pq.push(4);
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
	}

}
