package com.practice;

public class Median {

public static float median(int a[], int b[], int aLength, int bLength){
	
	int[] c = new int[aLength + bLength];
	int i = 0, j = 0, k = 0;
	float avg = 0;
	
	while(i < aLength && j < bLength){
		if(a[i] < b[j]){
			c[k] = a[i++];
		}else{
			c[k] = b[j++];
		}
		k++;
	}
	
	while(i < aLength){
		c[k++] = a[i++];
	}
	
	while(j < bLength){
		c[k++] = b[j++];
	}
	for(int l = 0; l < c.length ; l++){
		System.out.println(c[l]);
	}
	
	int n = c.length;
	System.out.println(n);
	
	if(n % 2 == 0) {	
		avg = (float) (c[(n-1)/2] + c[n/2]) / 2;
	} else{
		avg  = (float) c[n/2];
	}
	
	return avg;
}

public static void main(String args[]){
	int[] arr1 = {1, 12, 15, 26, 38};
	int[] arr2 = {2, 13, 17, 30, 45};
	
	System.out.println("Median of arrays is: "+median(arr1, arr2, 5, 5));
}

}
