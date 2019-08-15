package com.array;

public class MergeArrays {
	public static void mergeArrays(int a[], int b[], int aLength, int bLength) throws Exception{
		if(aLength + bLength > a.length) throw new Exception();
		
		int aIndex = aLength - 1;
		int bIndex = bLength - 1;
		int mergeIndex = aLength + bLength - 1;
		
		while (aIndex >= 0 && bIndex >= 0){
			if(a[aIndex] > b[bIndex]){
				a[mergeIndex] = a[aIndex];
				aIndex --;
			}
			else {
				a[mergeIndex] = b[bIndex];
				bIndex--;
			}
			mergeIndex --;
		}
		
		while(bIndex >= 0){
			a[mergeIndex] = b[bIndex];
			bIndex --;
			mergeIndex --;
		}
	}

	public static void main(String args[]) throws Exception{
		
		int a[] = {1, 3, 5, 9, 0, 0, 0, 0};
		int b[] = {2, 4, 6, 8};
		mergeArrays(a, b, 4, 4);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

}
