package com.number;

public class PrimeFactor {

	public static void main(String[] args) {
		
		int n = 15;
		
		long maxPrime = -1;
		
		while(n%2 == 0){
			maxPrime = 2;
			n = n/2;
		}
		
		for(int i=3;i<=Math.sqrt(n);i+=2){
			while(n%i==0){
				maxPrime = i;
				n = n/i;
			}
		}
		
		if(n>2){
			maxPrime = n;
		}
		
		System.out.println("The largest prime factor is: "+maxPrime);
		
	}

}
