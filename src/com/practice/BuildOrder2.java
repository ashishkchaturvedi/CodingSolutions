package com.practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


/*
0: 
1: 0
2: 0
3: 1, 2
4: 3
      /-- <- 2 --\
     /            \  			 
<- 0               <- 3 <- 4 
   	 \            /
      \-- <- 1 --/
*/

public class BuildOrder2 {
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

	private static void visit(int process, int[][] processes, Set<Integer> temp, Set<Integer> perm, List<Integer> result){
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
		int a[][] = {{},
			         {0},
					 {0},
					 {1, 2},
					 {3}};
		List<Integer> res = buildOrder(a);
		for(int i : res)
			System.out.println(i);
	}

}
