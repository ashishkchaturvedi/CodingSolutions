package com.graph;

import java.util.HashMap;
import java.util.Map;

class Node{
	int rank;
	Node parent;
	int data;
	Node(int data){
		this.data = data;
	}
}


public class DisjointSets {
	static Map<Integer, Node> map = new HashMap<Integer, Node>();

	public static void makeSet(int data){
		Node node = new Node(data);
		node.parent = node;
		node.rank = 0;
		map.put(data, node);
	}

	public static boolean union(int a, int b){
		Node n1 = map.get(a);
		Node n2 = map.get(b);
		
		Node parent1 = findSet(n1);
		Node parent2 = findSet(n2);
		
		if(parent1.data == parent2.data) return false;
		if(parent1.rank >= parent2.rank){
			parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank + 1 : parent1.rank;
			parent2.parent = parent1;
		}else{
			parent1.parent = parent2;
		}
		return true;
	}

	private static Node findSet(Node node){
		Node parent = node.parent;
		if(parent == node) return parent;
		node.parent = findSet(parent);
		return node.parent;
	}

	public static int findSet(int data){
		return findSet(map.get(data)).data;
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
