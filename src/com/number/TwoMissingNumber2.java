package com.number;

public class TwoMissingNumber2 {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 5, 7};
		int k = 0;
		for(int i = 1; i<= a.length+2; i++){
			if(a[k] != i){
				System.out.println(i);
			}
			else {
				k++;
			}
			
		}

	}

}
