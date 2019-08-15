package com.practice;

public class Anagrams {
	public static boolean isAnagram(String s1, String s2){
		
		if (s1.length() != s2.length()){
			return false;
		}
		int NO_OF_CHARS = 256;
		int count[] = new int[NO_OF_CHARS];
		
		for(int i = 0; i < s1.length(); i++){
			count[s1.charAt(i)]++;
		}
		
		for(int i = 0; i < s2.length(); i++){
			count[s2.charAt(i)]--;
		}
		
		for(int i = 0; i < s1.length(); i++){
			if(count[i] == 1){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]){
		
		String s1 = "applee";
		String s2 = "leappe";
		
		System.out.println(isAnagram(s1, s2) ? "Strings are anagram" : "Not an angaram");
		
	}

}
