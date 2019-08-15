package com.string;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class FindWordInDictionary {
	public static int delete(String query, HashSet<String> dictionary){
		Queue<String> queue = new LinkedList<String>();
		Set<String> queueElements = new HashSet<String>();
		
		queue.add(query);
		queueElements.add(query);
		
		while(!queue.isEmpty()){
			String s = queue.remove();
			queueElements.remove(s);
			if(dictionary.contains(s)) {
				return query.length() - s.length();
			}
			
			for(int i=0; i<s.length(); i++){
				String sub = s.substring(0,i) + s.substring(i+1, s.length());
				if(!queueElements.contains(sub) && sub.length() > 0){
					queue.add(sub);
					queueElements.add(sub);
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String args[]){
		HashSet<String> dictionary = new HashSet<String>();
		dictionary.add("a");
		dictionary.add("aa");
		dictionary.add("aaa");
		dictionary.add("ab");
		
		String query = "abc";
		
		System.out.println(delete(query, dictionary));
	}

}
