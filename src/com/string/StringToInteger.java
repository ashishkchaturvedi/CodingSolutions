package com.string;

public class StringToInteger {
	public static void stringToInteger(String s){
		String[] seq = s.split(",:");
		int[] vals = new int[seq.length];
		int sum = 0;
		for(int i = 0 ; i < seq.length; i++){
			
			vals[i] = Integer.parseInt(seq[i]);
			sum += vals[i];
		}
		System.out.println("Total sum is: "+sum);
	}
	public static void main(String args[]){
		String s = "10,:20,:40,:5,:1,:9";
		stringToInteger(s);
	}


}
