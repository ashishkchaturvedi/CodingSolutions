package com.array;

import java.util.HashMap;
import java.util.Set;

public class DuplicatesInArray {
	public static void findDuplicates(int a[]){
		HashMap<Integer, Integer> dupe = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < a.length; i++){
			if(dupe.containsKey(a[i])){
				dupe.put(a[i], dupe.get(a[i]) + 1);
			} else {
				dupe.put(a[i], 1);
			}
		}
		
		Set<Integer> set =  dupe.keySet();
		
		for(int i : set) {
			
		if(dupe.get(i) > 1){
			System.out.println(i);
		}	
		}
	}

	public static void main(String args[]){
		int a[] = {2, 1, 2, 1, 3, 4, 8, 9, 9};
		findDuplicates(a);
	}

}
