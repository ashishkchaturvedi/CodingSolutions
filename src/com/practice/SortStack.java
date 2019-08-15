package com.practice;

import java.util.Stack;

public class SortStack {

public static void sort(int a[]){
	Stack<Integer> primary = new Stack<Integer>();
	Stack<Integer> secondary = new Stack<Integer>();
	
	primary.push(a[0]);
	for(int i = 1 ; i < a.length; i++){
		if(a[i] > primary.peek()){
			while(!primary.isEmpty() && a[i] > primary.peek()){
				secondary.push(primary.pop());
			}
			primary.push(a[i]);
			
			while(!secondary.isEmpty()){
				primary.push(secondary.pop());
			}
		}
		else {
			primary.push(a[i]);
		}
	}
	System.out.println("Sorted Stack:");
	while(!primary.isEmpty()){
		System.out.println(primary.pop());
	}
}

public static void main(String args[]){
	int a[] = {6, 7, 1, 4, 8, 12, 13};
	sort(a);
}

}
