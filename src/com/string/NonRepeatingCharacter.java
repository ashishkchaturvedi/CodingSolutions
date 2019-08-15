package com.string;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		
		String str = "ashish";
		int index = 0;
		int NO_OF_CHARS = 256;
		
		char count[] = new char[NO_OF_CHARS];
		
		for(int i = 0;i<str.length();i++){
			count[str.charAt(i)]++;
		}
		
		for(int i= 0; i<str.length();i++){
			if(count[str.charAt(i)] == 1){
				index = i;
				break;
			}
		}
		System.out.println("First non repating character is: "+str.charAt(index));

	}

}
