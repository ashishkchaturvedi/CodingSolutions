package com.array;

public class ArrayMedian {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 12, 15, 26, 38};
		int[] arr2 = {2, 13, 17, 30, 45};		
		
		int n = arr1.length;
		int m = arr2.length;
		int[] arr3 = new int[m+n];
	
		int k = 0,i = 0, j = 0;
		
		while(i<n && j<m){
			
		//	System.out.println("hello");
			if(arr1[i]<arr2[j]){
				arr3[k++] = arr1[i++];
			}
			else {
				arr3[k++] = arr2[j++];
			}
		}
		
		while(i<n){
			arr3[k++] = arr1[i++]; 
		}
		
		while (j<m){
			arr3[k++] = arr2[j++];
		}
		/*System.out.print("[");
		for(int l = 0;l<arr3.length;l++){
			System.out.print(arr3[l]+", ");
		}
		System.out.println("]");*/
		float median = 0;
		int l = arr3.length;
		//System.out.println((arr3[(l-1)/2]+arr3[l/2])/2);
		if(l%2==0){
			median = (float)(arr3[(l-1)/2]+arr3[l/2])/2;
			//System.out.println("isme hoon");
		}
		else {
			median = arr3[l/2];
			System.out.println("aa gaya");
		}
		System.out.println("Median of combined array is: "+median);

	}

}
