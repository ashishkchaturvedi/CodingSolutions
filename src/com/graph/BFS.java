package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

class Graph1{
	int V;
	LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	Graph1(int v){
		//System.out.println(v);
		this.V = v;
		adj = new LinkedList[V];
		for(int i = 0; i < V; i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
}


public class BFS {
public static void addEdge(Graph1 graph,int v, int s){
	graph.adj[v].add(s);
}

public static void traversal(Graph1 graph, int s){
	boolean[] visited = new boolean[graph.V];
	LinkedList<Integer> queue = new LinkedList<Integer>();
	
	visited[s] = true;
	queue.add(s);
	
	while(queue.size() != 0){
		int i  = queue.poll();
		System.out.print(i+" ");
		
		Iterator<Integer> j = graph.adj[i].listIterator();
		while(j.hasNext()){
			int n = j.next();
			if(!visited[n]){
				visited[n] = true;
				queue.add(n);
			}
		}
	}
}

public static void main(String args[]){
		int v = 5;
		Graph1 graph = new Graph1(v);
		addEdge( graph,0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);
		
		
		traversal(graph, 1);
	}
}

