package com.practice;

import java.util.HashMap;
import java.util.Set;

public class Duplicates {
	public static void duplicates(int a[]){
		HashMap<Integer, Integer> dupe = new HashMap<Integer, Integer>();
		for(int i = 0; i < a.length; i++){
			if(dupe.containsKey(a[i])){
				dupe.put(a[i], dupe.get(a[i]) + 1);
			}else{
				dupe.put(a[i], 1);
			}
		}
		
		Set<Integer> list = dupe.keySet();
		for(Integer i : list){
			if(dupe.get(i) > 1){
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]){
		int a[] = {1, 2, 2, 4, 4, 5};
		duplicates(a);
	}

}
