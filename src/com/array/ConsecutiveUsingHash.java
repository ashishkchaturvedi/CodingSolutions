package com.array;

import java.util.HashSet;

public class ConsecutiveUsingHash {

	public static void main(String[] args) {
		
		int a[] = {4, 2, 1, 6, 5};
		HashSet<Integer> hs = new HashSet<Integer>();
		int max = 0;
		
		for(int i : a){
			hs.add(i);
		}
		
		for(int i:hs){
			if(hs.contains(i-1)){
				continue;
			}
			int length = 0;
			while(hs.contains(i++)){
				length++;
			}
			
			max = Math.max(max, length);
		}
		
		System.out.println("The maximum count of consecutive array is: "+max);

	}

}
