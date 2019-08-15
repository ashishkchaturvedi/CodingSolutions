package com.array;

import java.util.ArrayList;

public class Permutation {
	
	public static ArrayList<int[]> permutation(int a[]){
		ArrayList<int[]> results = new ArrayList<int[]>();
		permutation(a, 0, results);
		return results;
	}
	
	public static void permutation(int a[], int start, ArrayList<int[]> results){
		if(start >= a.length){
			results.add(a.clone());
		}
		else{
			for(int i = start; i< a.length; i++){
				swap(a, start, i);
				permutation(a, start + 1, results);
				swap(a, start, i);
			}
		}
		
	}
	
	public static void swap(int a[], int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		
		//Permutation p  = new Permutation();
		int a[] = {1, 2, 3};
		System.out.println(permutation(a));

	}

}
