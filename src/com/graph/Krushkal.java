package com.graph;

import java.util.Arrays;

class Edge implements Comparable<Edge>{
	int src, dest, weight;
	
	public int compareTo(Edge compareEdge){
		return this.weight - compareEdge.weight;
	}
}

class SubSet{
	int parent, rank;
}

public class Krushkal {
	int V, E;
	Edge[] edge;

	Krushkal(int v, int e){
		V = v;
		E = e;
		edge = new Edge[E];
		for(int i = 0; i < e; i++){
			edge[i] = new Edge();
		}
	}
	
	public int findSet(SubSet subSets[], int i){
		if(subSets[i].parent != i){
			subSets[i].parent = findSet(subSets, subSets[i].parent);
		}
		return subSets[i].parent;
	}
	
	public void union(SubSet subSets[], int a, int b){
		int parent1 = findSet(subSets, a);
		int parent2 = findSet(subSets, b);
		
		if(subSets[parent1].rank >= subSets[parent2].rank){
			subSets[parent1].rank = (subSets[parent1].rank == subSets[parent2].rank) ? subSets[parent1].rank +  1 : subSets[parent1].rank;
			subSets[parent2].parent = parent1;	
		}else{
			subSets[parent1].parent = parent2;
		}
	}
	
	void krushkalMST(){
		Edge result[]  = new Edge[V];
		int e = 0;
		for(int i = 0; i < V; i++){
			result[i] = new Edge();
		}
		
		Arrays.sort(edge);
		SubSet subSets[] = new SubSet[V];
		for(int i = 0; i < V; i++){
			subSets[i] = new SubSet();
		}
		for(int v = 0 ;v < V; v++){
			subSets[v].parent = v;
			subSets[v].rank = 0;
		}
		
		int i = 0; 
		while(e < V - 1){
			Edge next_edge = new Edge();
			next_edge = edge[i++];
			
			int x = findSet(subSets, next_edge.src);
			int y = findSet(subSets, next_edge.dest);
			
			if(x != y){
				result[e++] = next_edge;
				union(subSets, x, y);
			}
		}
		for(int j = 0; j < e; j++){
			System.out.println(result[j].src+"----"+result[j].dest+" = "+result[j].weight);
		}
	}
	
	public static void main (String[] args)
    {
 
        /* Let us create following weighted graph
                 10
            0--------1
            |  \     |
           6|   5\   |15
            |      \ |
            2--------3
                4       */
        int V = 4;  // Number of vertices in graph
        int E = 5;  // Number of edges in graph
        Krushkal graph = new Krushkal(V, E);
 
        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 10;
 
        // add edge 0-2
        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 6;
 
        // add edge 0-3
        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 5;
 
        // add edge 1-3
        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 15;
 
        // add edge 2-3
        graph.edge[4].src = 2;
        graph.edge[4].dest = 3;
        graph.edge[4].weight = 4;
 
        graph.krushkalMST();
    }

}
