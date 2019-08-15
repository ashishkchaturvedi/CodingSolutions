package com.stack;

import java.util.Stack;

public class SortStack {
	public static void sort(int a[]){
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		s1.push(a[0]);
		for(int i = 1; i < a.length; i++){
			if(a[i] > s1.peek()){
				while (!s1.isEmpty() && a[i] > s1.peek()){
				int item = s1.pop();
				s2.push(item);
				}
				s1.push(a[i]);
				while(!s2.isEmpty()){
					int item = s2.pop();
					s1.push(item);
				}
			}
			else {
			s1.push(a[i]);
			}
			
		}
		System.out.println("Array after sorting:");
		while(!s1.isEmpty()){
			System.out.print(s1.pop()+" ");
		}
	}

	public static void main(String args[]){
		int a[] = {6, 7, 1, 4, 8, 12, 13};
		sort(a);
	}

}
