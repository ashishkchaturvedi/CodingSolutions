package com.array;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		int a[] = {10,21,22,100,101,200,300};
		Arrays.sort(a);
		int count  = 0;
	
		for(int i=0;i<a.length-2;i++){
			for(int j=i+1;j<a.length-1;j++){
				for(int k = j+1;k<a.length;k++){
					
						if((a[i]+a[j]) > a[k]){
							count++;
						}
					
				}
			}
		}
		System.out.println("Total no. of possible triangles are: "+count);
	}

}
