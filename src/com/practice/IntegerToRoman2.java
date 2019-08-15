package com.practice;

public class IntegerToRoman2 {
	public static String integerToRoman(int n){
		String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		StringBuilder res = new StringBuilder();
		if(n > 3999 || n < 1) throw new IllegalArgumentException();
		int i = 0;
		while(n > 0){
			if(n - values[i] >= 0){
				res.append(roman[i]);
				n = n - values[i];
			}else{
				i++;
			}
		}
		return res.toString();
	}

	public static void main(String args[]){
		System.out.println(integerToRoman(3575));
	}

}
