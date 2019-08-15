package com.array;

public class ArrayMedian2 {

	public static void main(String[] args) {
		
		int arr1[] = {1, 3, 5};
		int arr2[] = {2, 4, 6};
		int n = arr1.length;
		int i=0,j=0;
		int m1=-1,m2=-1;
		float median = 0;
		
		for(int count = 0; count<=n; count++){
			
			if(i==n){
				m1 = m2;
				m2=arr2[0];
				break;
			}
			else if(j==n){
				m1 = m2;
				m2 = arr1[0];
				break;
			}
			
			if(arr1[i] < arr2[j]){
				m1 = m2;
				m2 = arr1[i++];
			}
			else {
				m1 = m2;
				m2 = arr2[j++];		
			}
		}
		System.out.println(m2);
		median =(float)(m1+m2)/2;
		System.out.println("Median of combined array is: "+median);

	}

}
