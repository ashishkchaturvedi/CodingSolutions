package com.string;

import java.util.HashMap;

class CountIndex {
	int count;
	int index;
	
	public CountIndex(int index){
		this.count = 1;
		this.index = index;
	}
	
	public void incCount(){
		this.count++;
	}
}

public class FirstNonRepeatingCharacter {
	
	static int no_of_chars = 256;
	
	static HashMap<Character, CountIndex> hm = new HashMap<Character, CountIndex>(no_of_chars);
	
	public static void getCharCountArray(String str){
		for(int i=0;i<str.length();i++){
			if(hm.containsKey(str.charAt(i))){
				hm.get(str.charAt(i)).incCount();
			}
			else {
				hm.put(str.charAt(i), new CountIndex(i));
			}
		}
	} 
	
	static int firstNonRepeatingCharacter(String str){
		getCharCountArray(str);
		
		int result = Integer.MAX_VALUE;
		
		for(int i=0;i<str.length();i++){
			if(hm.get(str.charAt(i)).count == 1 && result > hm.get(str.charAt(i)).index){
				result = hm.get(str.charAt(i)).index;
			}
		}
		return result;
	}
	
	

	public static void main(String[] args) {
		
		String str = "ashish";
		int index = firstNonRepeatingCharacter(str);
		
		System.out.println(index == Integer.MAX_VALUE? "Either all characters are repeating or string is empty": "first non repeating character is:" +str.charAt(index) );

	}

}
