package com.graph;

import java.util.Iterator;

public class DFS {
	public static void addEdge(Graph1 graph, int src, int dest){
		graph.adj[src].add(dest);
	}

	private static void traversal(Graph1 graph, int src, boolean[] visited ){
		visited[src] = true;
		System.out.print(src+" ");
		
		Iterator<Integer> i = graph.adj[src].listIterator();
		while(i.hasNext()){
			int n = i.next();
			if(!visited[n]){
				traversal(graph, n, visited);
			}
		}
	}

	public static void traversal(Graph1 graph, int src){
		boolean[] visited = new boolean[graph.V];
		traversal(graph, src, visited);
	}

	public static void main(String args[]){
		Graph1 g  = new Graph1(5);
		addEdge(g, 0, 1);
		addEdge(g, 0, 2);
		addEdge(g, 1, 3);
		addEdge(g, 1, 2);
		addEdge(g, 2, 4);
		addEdge(g, 2, 0);
		addEdge(g, 3, 4);
		
		traversal(g, 0);
	}


}
