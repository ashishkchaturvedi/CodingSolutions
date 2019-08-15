package com.dynamicProgramming;

public class LongestCommonSubsequence {
	public int lcs(char s1[], char s2[]){
		int[][] temp = new int[s1.length + 1][s2.length + 1];
		int max = 0;
		for(int i = 1; i <= s1.length; i++){
			for(int j = 1 ; j <= s2.length; j++){
				if(s1[i - 1] == s2[j - 1]){
					temp[i][j] = temp[i - 1][j - 1] + 1;
				}else{
					temp[i][j] = Math.max(temp[i][j - 1], temp[i - 1][j]);
				}
				if(temp[i][j] >  max){
					max = temp[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String args[]){
		LongestCommonSubsequence l = new LongestCommonSubsequence();
		String s1 = "ABCDGHLQR";
		String s2 = "AEDPHR";
		System.out.println("Longest Commonn Subsequence: "+l.lcs(s1.toCharArray(), s2.toCharArray()));
	}

}
