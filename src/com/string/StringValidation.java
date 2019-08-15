package com.string;



public class StringValidation {
	public static boolean isValid(String s){
		if(s == null) return true;
		if(!(isFirstCharacterCapital(s)) || !(isQuotesEven(s))
			|| !(isPeriodCharAtEnd(s)) || !(isPeriodCharInBetween(s))){
			return false;
		}
		return true;
	}
	
	private static boolean isFirstCharacterCapital(String s){
		if(!Character.isUpperCase(s.charAt(0))) return false;
		return true;
	}
	
	private static boolean isQuotesEven(String s){
		int quoteCount = 0;
		for(char ch : s.toCharArray()){
			if(ch == '"') quoteCount++;
		}
		if(quoteCount % 2 != 0) return false;
		return true;
	}
	
	private static boolean isPeriodCharAtEnd(String s){
		int length = s.length();
		if(s.charAt(length - 1) != '.') return false;
		return true;
	}
	
	private static boolean isPeriodCharInBetween(String s){
		int length = s.length();
		char[] ch = s.toCharArray();
		for(int i = 0; i < length - 2; i++){
			if(ch[i] == '.')return false;
		}
		return true;
	}

	public static void main(String args[]){
		String s = "One lazy dog is too few, 12 is too many.";
		System.out.println(isValid(s) ? "String is valid" : "String is invalid");
	}

}
