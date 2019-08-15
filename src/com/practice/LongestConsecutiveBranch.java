package com.practice;

public class LongestConsecutiveBranch {
	static Tree root;

	public static int consecutive(Tree n){
		if(n == null) return 0;
		return max(consecutive(n.left, n.data, 1), consecutive(n.right, n.data, 1));
	}

	private static int consecutive(Tree n, int prev, int length){
		if(n == null) return length;
		
		if(n.data == prev + 1){
			int leftHeight = consecutive(n.left, n.data, length + 1);
			int rightHeight = consecutive(n.right, n.data, length + 1);
			return max(leftHeight, rightHeight);
		}else {
			int leftHeight = consecutive(n.left, n.data, 1);
			int rightHeight = consecutive(n.right, n.data, 1);
			return max(leftHeight, rightHeight, length);
		}
	}

	private static int max(int... vals){
		int max = Integer.MIN_VALUE;;
		for(int i : vals){
			if(i > max){
				max = i;
			}
		}
		return max;
	}

	public static void main(String args[]){
		root = new Tree(0);
		root.left  = new Tree(1);
		root.right = new Tree(2);
		root.left.left = new Tree(1);
		root.left.right = new Tree(2);
		root.right.left = new Tree(1);
		root.right.right = new Tree(3);
		System.out.println(consecutive(root));
	}


}
