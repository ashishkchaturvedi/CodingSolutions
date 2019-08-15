package com.array;

import java.util.HashMap;

public class FindThePair {
	
	static int pairCount(int a[], int sum){
		
		int twice_count = 0;
		
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			if(!h.containsKey(a[i])){
				h.put(a[i], 0);
			}
			
			h.put(a[i], h.get(a[i])+1);
		}
		
		for(int i=0 ;i<a.length;i++){
			if(h.get(sum-a[i])!=null){
				twice_count += h.get(sum-a[i]); 
			}
			
			if(sum-a[i] == a[i]){
				twice_count--;
			}
		}
		return twice_count/2;
		
		}
	

	public static void main(String[] args) {
		
		int a[] = {1,5,7,-1,5};
		int sum = 6;
		int count = pairCount(a,sum);
		System.out.println("Total number of pairs is/are: "+count);

	}

}
