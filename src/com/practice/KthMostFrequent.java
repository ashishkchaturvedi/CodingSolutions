package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KthMostFrequent {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static String kthMostFrequent(String[] str, int k){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s: str){
			Integer x = map.get(s);
			if (x == null){
				x = 0;
			}
			map.put(s, ++x);
		}
		
		List<Map.Entry> list = new ArrayList(map.entrySet());
		Collections.sort(list, new Comparator(){
			public int compare(Object o1, Object o2){
				Integer v1 = (Integer) ((Map.Entry) o1).getValue();
				Integer v2 = (Integer) ((Map.Entry) o2).getValue();
				return v1.compareTo(v2);
			}
		});
		
		if(list.size() > k){
			return (String) (list.get(k)).getKey();
		}
		return null;
		
	}

	public static void main(String args[]){
		String s[] = {"a", "a", "b", "c", "a", "b"};
		System.out.println(kthMostFrequent(s, 2));
	}

}
