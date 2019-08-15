package com.graph;

import java.util.LinkedList;

class Graph{
	int v;
	public LinkedList<Integer> adjListArray[];
	@SuppressWarnings("unchecked")
	Graph(int v){
		this.v = v;
		adjListArray = new LinkedList[v];
		
		for(int i = 0; i < v; i++){
			adjListArray[i] = new LinkedList<>();
		}
	}
}


public class AdjacencyList {
	static void addEdge(Graph graph, int src, int dest){
		graph.adjListArray[src].addFirst(dest);
		graph.adjListArray[dest].addFirst(src);
	}

	static void printGraph(Graph graph){
		for(int i = 0; i < graph.v; i++){
			System.out.println("Adjacency list of vertex: "+i);
			System.out.print("head");
			for(Integer j : graph.adjListArray[i]){
				System.out.print(" -> "+j);
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		int v = 5;
		Graph graph = new Graph(v);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);
		
		
		printGraph(graph);
	}

}
