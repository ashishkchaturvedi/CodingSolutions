package com.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BuildOrder {
	public static List<Integer> buildOrder1(int[][] processes){
		Set<Integer> temp = new HashSet<Integer>();
		Set<Integer> perm = new HashSet<Integer>();
		List<Integer> results = new LinkedList<Integer>();
		
		for(int i = 0; i < processes.length; i++){
			if(!perm.contains(i)){
				visit(i, processes, temp, perm, results);
			}
		}
		return results;
	}

	public static void visit(int process, int[][] processes, Set<Integer> temp, Set<Integer> perm, List<Integer> results){
		if(temp.contains(process)) throw new RuntimeException();
		if(!perm.contains(process)){
			temp.add(process);
			for(int i : processes[process]){
				visit(i, processes, temp, perm, results);
			}
			perm.add(process);
			temp.remove(process);
			results.add(process);
		}
	}

	public static void main(String args[]){
		int[][] processes = {{},
							 {0},
							 {0},
							 {1, 2},
							 {3}};

								
		List<Integer> res = buildOrder1(processes);
		for(int i : res){
			System.out.println(i);
		}
	}

}
