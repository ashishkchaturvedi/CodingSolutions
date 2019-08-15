package com.string;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "albatta";
		String s2 = "battala";
		int index = -1;
		
		int[] count = new int[256];
		
		for(char c: s1.toCharArray()){
			count[c]++;
		}
		
		for(char c: s2.toCharArray()){
			count[c]--;
		}
		
		for(int i : count){
			if ( i != 0){
				index = 1;
			}
		}
		System.out.println(index == -1?"It is an Anagram":"It is not an Anagram");

	}

}
