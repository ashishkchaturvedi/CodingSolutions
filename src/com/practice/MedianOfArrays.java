package com.practice;

public class MedianOfArrays {
	public static float medianArray(int a[], int b[], int n, int m){
		int[] c = new int[n + m];
		int i = 0, j = 0, k = 0;
		float avg = 0;
		while(i < n && j < m){
			if(a[i] < b[j]){
				c[k++] = a[i++];
			}else{
				c[k++] = b[j++];
			}
		}
		while(i < n){
			c[k++] = a[i++];
		}
		while(j < m){
			c[k++] = b[j++];
		}
		for(int l = 0; l < c.length ; l++){
			System.out.println(c[l]);
		}
		int l = c.length;	
		if(l % 2 == 0){
			avg = (float) (c[l/2] + c[(l-1)/2]) / 2;
		}else{
			avg = (float) c[l/2];
		}
		return avg;
	}

	public static void main(String args[]){
		int[] arr1 = {1, 12, 15, 26, 38};
		int[] arr2 = {2, 13, 17, 30, 45};
		int n = arr1.length;
		int m = arr2.length;
		System.out.println(medianArray(arr1, arr2, n, m));	
	}

}
