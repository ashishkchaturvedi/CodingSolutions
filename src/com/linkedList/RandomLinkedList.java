package com.linkedList;
class Node1{
	Node1 next;
	Node1 random;
	int data;
	
	public Node1(int data){
		this.data = data;
		this.next = this.random = null;
	}
}
public class RandomLinkedList {
	
	static Node1 head;
	public static Node1 clone(Node1 n){
		Node1 nCurr = n;
		while(nCurr != null){
			Node1 temp = new Node1(nCurr.data);
			//temp.data = nCurr.data;
			temp.next = nCurr.next;
			nCurr.next = temp;
			nCurr = nCurr.next.next;
		}
		nCurr = n;
		while(nCurr != null){
			//if(nCurr.next.random != null){
			nCurr.next.random = nCurr.random.next;
			
			nCurr = nCurr.next.next;
		}
		
		Node1 copy = n.next;
		nCurr = n;
		while(nCurr.next != null){
			Node1 temp = nCurr.next;
			nCurr.next = nCurr.next.next;
			nCurr = temp;
		}
		return copy;
	}

	public static void main(String args[]){
		head = new Node1(1);
		head.next = new Node1(2);
		head.next.next = new Node1(3);	
		head.next.next.next = new Node1(4);
		head.random = head.next.next.next;
		head.next.random = head.next.next;
		head.next.next.random = head;
		head.next.next.next.random = head.next;
		//System.out.println(head.next.random.data);
		
		Node1 res = clone(head);
		//System.out.println(res.next.random.data);

		while(res != null){
			System.out.print(res.data+" -> ");
			System.out.print(res.random.data);
			System.out.println();
			res = res.next;
		}
	}

}
