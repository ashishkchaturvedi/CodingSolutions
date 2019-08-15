package com.array;

public class FindDuplicates {

	public static void main(String[] args) {
		int arr[] = {1,2, 2, 2, 2,3,4,5,6};
		
		if(arr[3]==arr[4]){
			System.out.println("The duplicate character is: "+arr[3]);
		}
		else if(arr[4]==arr[5]){
			System.out.println("The duplicate number is: "+arr[4]);
		}else {
			System.out.println("The duplicate number is: "+arr[5]);
		}

	}

}
