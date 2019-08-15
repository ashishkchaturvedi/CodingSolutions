package com.number;

public class IntegerToRoman {
	
	public static final String numerals[] = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	public static final int values[] = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

	public static String integerToRoman(int value){

		if(value > 3999 || value < 1) throw new IllegalArgumentException();
	
		int i = 0;
		StringBuilder numeral = new StringBuilder();
		while(value > 0){
			if((value - values[i]) >= 0){
				numeral.append(numerals[i]);
				value = value - values[i];
			}
			else {
				i++;
			}
		}
		return numeral.toString();
	}
	
	public static void main(String args[]){
		int value = 1456;
		System.out.println(integerToRoman(value));
	}

}
