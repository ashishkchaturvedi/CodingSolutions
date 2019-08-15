package com.string;

public class LongestCommonSubstring {
	public static String longestSubstring(String a, String b){
		String out = "";
		if(a.length() == 0 || b.length() == 0) return out;
		int cache[][] = new int[a.length()][b.length()];
		
		for(int i = 0; i < a.length(); i++){
			for(int j = 0; j < b.length(); j++){
				if(a.charAt(i) == b.charAt(j)){
					if(i == 0 || j == 0){
						cache[i][j]  = 1;
					}else{
						cache[i][j] = cache[i-1][j-1] + 1;
					}
					if(cache[i][j] > out.length()){
						out = a.substring(i - cache[i][j] + 1, i + 1);
					}
				}
			}
		}
		return out;
	}

	public static void main(String args[]){
		String a = "abcdef";
		String b = "abdef";
		System.out.println("Longest Substring is: "+longestSubstring(a, b));
	}

}
