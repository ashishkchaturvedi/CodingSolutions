package com.practice;

public class Median2 {
	public static float median(int a[], int b[]){
		int n = a.length;
		int count  = 0;
		int i = 0, j= 0;
		int m1 = -1, m2 = -1;
		
		for(count = 0; count <= n; count++){
			if(i == n){
				m1 = m2;
				m2 = b[0];
			}
			if(j == n){
				m1 = m2;
				m2 = a[0];
			}
			
			if(a[i] < b[j]){
				m1 = m2;
				m2 = a[i++];
			}else{
				m1 = m2;
				m2 = b[j++];
			}
		}
		
		return (float)(m1 + m2) / 2;
	}
	public static void main(String args[]){
		int[] a = {1, 3, 5};
		int[] b = {2, 4, 6};
		System.out.println(median(a, b));
	}

}
