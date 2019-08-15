package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

/*
"10.12.134.51, 5\n"+
"10.12.134.52, 9\n"+
"10.12.134.53, 10\n"+
"10.12.134.54, 7\n"+
"10.12.134.55, 8\n"+
"10.12.134.56, 2\n"+
"10.12.134.57, 9\n"; */

public class IpAddress {
	
	public static List<String> ipRange(String input, int min, int max){
		List<String> result = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] str = input.split("\n");
		for(int i = 0; i < str.length; i++){
			String[] s1 = str[i].split(",");
			for(int j = 0; j < s1.length; j++){
				//System.out.println(s1[j]);
				map.put(s1[0], Integer.parseInt(s1[1]));
			}
		}
		Set<String> set = map.keySet();
		for(String s : set){
			if(map.get(s) >= 5 && map.get(s) <= 10){
				result.add(s);
			}
		}
		return result;
	}
	
	public static void main(String args[]){
		String input = "10.12.134.51,4\n"+
					   "10.12.134.52,9\n"+
					   "10.12.134.53,10\n"+
					   "10.12.134.54,7\n"+
					   "10.12.134.55,8\n"+
					   "10.12.134.56,2\n"+
					   "10.12.134.57,9\n";
		//System.out.println(input);
		List<String> res = new ArrayList<String>();
		res = ipRange(input, 5, 10);
		System.out.println(res);
	}

}
