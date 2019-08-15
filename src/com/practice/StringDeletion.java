package com.practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class StringDeletion {
	public static int delete(String query, HashSet<String> dictionary){
		Queue<String> queue = new LinkedList<String>();
		Set<String> queueElements = new HashSet<String>();
		
		queue.add(query);
		queueElements.add(query);
		
		while(!queue.isEmpty()){
			String s = queue.remove();
			queueElements.remove(s);
			if(dictionary.contains(s)) return query.length() - s.length();
			
			for(int i = 0; i < s.length(); i++){
				String sub = s.substring(0, i) + s.substring(i + 1, s.length());
				if(!queueElements.contains(sub) && sub.length() > 0){
					queue.add(sub);
					queueElements.add(sub);
				}
			}
		}
		return -1;
	}

	public static void main(String args[]){
		HashSet<String> dict = new HashSet<String>();
		dict.add("a");
		dict.add("aa");
		dict.add("aaa");
		String query = "abc";
		System.out.println(delete(query, dict));
	}

}
