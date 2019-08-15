package com.array;

import java.util.ArrayList;
import java.util.List;

public class HackerRank {
    static int minimumSwaps(List<Integer> popularity) {
        int count  = 0;
        for(int i = 0; i < popularity.size() - 1; i++){
            if(popularity.get(i) < popularity.get(i + 1)){
                int temp = popularity.get(i);
                popularity.add(i, popularity.get(i + 1));
                popularity.add(i + 1, temp);
                count = count + 1;
            }
        }
        return count;
    }
    public static void main(String args[]){
    	List<Integer> popularity = new ArrayList<Integer>();
    	popularity.add(3);
    	popularity.add(3);
    	popularity.add(1);
    	popularity.add(2);
    	System.out.println(minimumSwaps(popularity));
    }
}


