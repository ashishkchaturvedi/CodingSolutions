package com.practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
            --> 1* --
          /          \ 
4* -> 3* ->            --> 0*
          \          /
            --> 2* --

Per =    {0, 1, 2, 3, 4}
Tempt =  {}
result = {0, 1, 2, 3, 4}*/

public class BuildOrder {
	public static List<Integer> buildOrder(int[][] processes){
		Set<Integer> perm = new HashSet<Integer>();
		Set<Integer> temp = new HashSet<Integer>();
		List<Integer> result = new LinkedList<Integer>();
		
		for(int i = 0; i < processes.length; i++){
			if(!perm.contains(i)){
				visit(i, processes, temp, perm, result);
			}
		}
	    return result;	
	}

	public static void visit(int process, int[][] processes,
							Set<Integer> temp,
							Set<Integer> perm,
							List<Integer> result){
		if(temp.contains(process)) throw new RuntimeException();
		if(!perm.contains(process)){
			temp.add(process);
			for(int i : processes[process]){
				visit(i, processes, temp, perm, result);
			}
			perm.add(process);
			temp.remove(process);
			result.add(process);
		}
	}

	public static void main(String args[]){
		int[][] processes = {{},
							 {0},
							 {0},
							 {1, 2},
							 {3}};
		List<Integer> res = buildOrder(processes);
		for(int i : res){
			System.out.println(i);
		}
	}

}
