package com.tree;

public class LongestConsecutiveBranch {
	
static Tree root;

public static int consecutive(Tree t){
	if(t == null) return 0;
	return max(consecutive(t.left, t.value, 1), consecutive(t.right, t.value, 1));
	
}

public static int consecutive(Tree n, int prev, int length){
	if(n == null) return length;
	
	if(n.value == prev + 1){
		int leftHeight = consecutive(n.left, n.value, length + 1);
		int rightHeight = consecutive(n.right, n.value, length + 1);
		return max (leftHeight, rightHeight);
	}else {
		int leftHeight = consecutive(n.left, n.value, 1);
		int rightHeight = consecutive(n.right, n.value, 1);
		return max(leftHeight, rightHeight, length);
	}
	
}

private static int max(int...vals){
	int max = Integer.MIN_VALUE;
	for(int i: vals){
		if(i > max) {
			max = i;
		}
	}
	return max;
}

public static void main(String args[]){
	root = new Tree(0);
	root.left = new Tree(1);
	root.right = new Tree(2);
	root.left.left = new Tree(1);
	root.left.right = new Tree(2);
	root.right.left = new Tree(1);
	root.right.right = new Tree(3);
	System.out.println(consecutive(root));
}

}
