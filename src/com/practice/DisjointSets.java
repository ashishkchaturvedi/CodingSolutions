package com.practice;

import java.util.*;

class Node2{
	int data;
	Node2 parent;
	int rank;
	
	public Node2(int data){
		this.data = data;
	}
}

public class DisjointSets {

static Map<Integer, Node2> map = new HashMap<Integer, Node2>();

public static void makeSet(int data){
	Node2 Node1 = new Node2(data);
	Node1.rank = 0;
	Node1.parent = Node1;
	map.put(data, Node1);
}

public static boolean union(int a, int b){
	Node2 n1 = map.get(a);
	Node2 n2 = map.get(b);
	
	Node2 parent1 = findSet(n1);
	Node2 parent2 = findSet(n2);
	
	if(parent1.data == parent2.data) return false;
	if(parent1.rank >= parent2.rank){
		parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank + 1 : parent1.rank;
		parent2.parent = parent1;
	}else{
		parent1.parent = parent2;
	}
	return true;
}

public static Node2 findSet(Node2 Node1){
	Node2 parent = Node1.parent;
	if(parent == Node1) return parent;
	Node1.parent = findSet(parent);
	return Node1.parent;
}

public static int findSet(int n){
	return findSet(map.get(n)).data;
}

public static void main(String args[]){
	makeSet(1);
	makeSet(2);
	makeSet(3);
	makeSet(4);
	makeSet(5);
	makeSet(6);
	makeSet(7);
	
	union(1, 2);
	union(2, 3);
	union(4, 5);
	union(6, 7);
	union(5, 6);
	union(3, 7);
	
	System.out.println(findSet(1));
	System.out.println(findSet(2));
	System.out.println(findSet(3));
	System.out.println(findSet(4));
	System.out.println(findSet(5));
	System.out.println(findSet(6));
	System.out.println(findSet(7));
}


}
