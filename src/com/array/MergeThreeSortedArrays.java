package com.array;

public class MergeThreeSortedArrays {
	public static void mergeKArray(int a[], int b[], int c[], int n1, int n2, int n3){
		int sortedArray[] = new int[n1+n2+n3]; 
		int index = 0;
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		while(aIndex <= n1-1 && bIndex <= n2-1 && cIndex <= n3-1){
			if(a[aIndex] < b[bIndex]){
				if(a[aIndex] < c[cIndex]){
					sortedArray[index] = a[aIndex++];
				}else{
					sortedArray[index] = c[cIndex++];
				}
			}else if(b[bIndex] < c[cIndex]){
				sortedArray[index] = b[bIndex++];
			}else{
				sortedArray[index] = c[cIndex++];
			}
			index++;
		}
		
		while(aIndex <= n1-1){
			sortedArray[index] = a[aIndex];
			index++;
			aIndex++;
		}
		
		while(bIndex <= n2-1){
			sortedArray[index] = b[bIndex];
			index++;
			bIndex++;
		}
		
		while(cIndex <= n3-1){
			sortedArray[index] = c[cIndex];
			index++;
			cIndex++;
		}
		
		for(int i = 0; i<sortedArray.length; i++){
			System.out.print(sortedArray[i]+" ");
		}
		
	}

	public static void main(String args[]){
		int a[] = {1, 4, 7};
		int b[] = {2, 5, 8};
		int c[] = {3, 6, 9};
		mergeKArray(a, b, c, 3, 3, 3);
	}

}
