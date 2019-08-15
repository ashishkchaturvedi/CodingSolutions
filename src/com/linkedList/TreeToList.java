package com.linkedList;



/*            0
           /     \
          1       2
        /   \   /   \
       1     2 1     3


<- 1 <-> 1 <-> 2->           <- 1 <-> 2 <-> 3 ->*/


class Tree{
	int value;
	Tree left, right;
	
	public Tree(int value){
		this.value = value;
		left = right = null;
	}
}
public class TreeToList {


	static Tree root;

	private static Tree concatenate(Tree a, Tree b) {
		if(a == null) return b;
		if(b == null) return a;
		
	//	<-1<->2<->3-> <-4<->5<->6->
		
		Tree aEnd = a.left;
		Tree bEnd = b.left;
		
		a.left = bEnd;
		bEnd.right = a;
		aEnd.right = b;
		b.left = aEnd;
		return a;
	}

	public static Tree treeToList(Tree n){
		if(n == null) return n;
		
		Tree leftList = treeToList(n.left);
		Tree rightList = treeToList(n.right);
		
		n.left = n;
		n.right = n;
		
		n = concatenate(leftList, n);
		n = concatenate(n, rightList);
		return n;
	}

	public static void main(String args[]){
		root = new Tree(1);
		root.left = new Tree(2);
		root.right = new Tree(3);
		root.left.left = new Tree(4);
		root.left.right = new Tree(5);
		root.right.left = new Tree(6);
		root.right.right = new Tree(7);
		
		Tree t;
		t = treeToList(root);
		
		System.out.print("null<->");
		while(t != null){
			System.out.print(t.value+"<->");
			t = t.left;
		}
		System.out.print("null");
	}

}
