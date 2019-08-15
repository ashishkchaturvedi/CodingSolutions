package com.string;

public class StringCompression {

	public static void main(String[] args) {
		
		String s1 = "aaa";
		String out = "";
		int sum = 1;
		
		for(int i = 0; i < s1.length()-1; i++){
			if(s1.charAt(i) == s1.charAt(i+1)){
				sum++;
			} else {
				out = out + s1.charAt(i) + sum;
				sum = 1;
			}
		}
		
		out = out + s1.charAt(s1.length()-1) + sum;
		System.out.println(out.length() < s1.length() ? out : s1);

	}

}
