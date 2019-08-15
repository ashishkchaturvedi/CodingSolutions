package com.array;

public class AverageOfStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float arr[] = { 10,20,30,40,50,60};
		int n = arr.length;
		streamAvg(arr, n);

	}
	
	static float getAvg(float prev_avg, float x, int n){
		
		return (prev_avg*n + x) / (n+1);
	}
	
	static void streamAvg(float[] arr, int n){
		
		float avg = 0;
		for(int i =0;i<n;i++){
			avg =  getAvg(avg,arr[i],i);
			System.out.printf("Average of %d numbers is %f \n", i+1, avg);
		}
		return;
	}

}
