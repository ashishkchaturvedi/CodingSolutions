package com.practice;

public class TwoMisssingNumbers {
	public static void missingNumbers(int a[]){
		int k = 0;
		for(int i = 1; i < a.length + 2; i++){
			if(a[k] != i){
				System.out.print(i+ " ");
			}else{
				k++;
			}
		}
	}

	public static void main(String args[]){
		int a[] = {1, 2, 3, 6, 7};
		missingNumbers(a);
	}

}
