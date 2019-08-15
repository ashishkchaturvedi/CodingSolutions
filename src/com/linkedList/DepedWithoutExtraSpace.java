package com.linkedList;

public class DepedWithoutExtraSpace {
	static Node head;
	public static Node dedup(Node n){
		Node temp = n;
		while(temp != null){
			Node curr = temp;
			while(curr.next != null){
				if(curr.next.data == temp.data){
					curr.next = curr.next.next;
				}else{
					curr = curr.next;
				}
			}
			temp = temp.next;
		}
		return n;
	}

	public static void main(String args[]){
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(1);
		
		Node res = dedup(head);
		
		while(res != null){
			System.out.print(res.data+" ");
			res = res.next;
		}
	}

}
