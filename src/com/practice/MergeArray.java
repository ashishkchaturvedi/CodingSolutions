package com.practice;

public class MergeArray {
	public static void mergeArrays(int a[], int b[], int aLength, int bLength){
		if(aLength + bLength > a.length) throw new IllegalArgumentException();
		
		int aIndex = aLength - 1;
		int bIndex = bLength - 1;
		int index = aLength + bLength - 1;
		
		
		while(aIndex >= 0 && bIndex >= 0){
			if(a[aIndex] > b[bIndex]){
				a[index] = a[aIndex];
				aIndex --;
			} else {
				a[index] = b[bIndex];
				bIndex --;
			}
			index --;
		}
		
		while(bIndex >= 0){
			a[index] = b[bIndex];
			index --;
			bIndex --;
		}
		
	}

	public static void main(String args[]){
		int a[] = {1, 3, 5, 9, 0, 0, 0, 0};
		int b[] = {2, 4, 6, 8};
		mergeArrays(a, b, 4, 4);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

}
