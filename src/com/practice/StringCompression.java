package com.practice;

public class StringCompression {
	public static String compress(String s1){
		String out = "";
		int count = 1;

		for(int i = 0; i < s1.length()-1; i++){
			if(s1.charAt(i) == s1.charAt(i+1)){
				count++;
			}
			else {
				out = out + s1.charAt(i) + count;
				count = 1;
			}
		}
		
		out = out + s1.charAt(s1.length()-1) + count;
		
		if(out.length() < s1.length()){
			return out;
		}
		else {
			return s1;
		}
		
	}

	public static void main(String args[]){
		String s1 = "aaabbcc";
		System.out.println(compress(s1));
	}

}
