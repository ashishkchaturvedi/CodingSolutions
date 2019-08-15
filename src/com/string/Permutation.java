package com.string;

import java.util.ArrayList;

public class Permutation {

	public static ArrayList<String> permutation(String s){
		ArrayList<String> results = new ArrayList<String>();
		permutation("",s,results);
		return results;
	}
	
	public static void permutation(String prefix, String suffix, ArrayList<String> results){
		if(suffix.length() == 0){
			results.add(prefix);
		}
		else {
			for(int i = 0; i<suffix.length();i++){
				permutation(prefix+suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1, suffix.length()), results);
			}
		}
	}
	
	public static void main(String[] args) {
		
		String s = "ab";
		System.out.println(permutation(s));

	}

}
