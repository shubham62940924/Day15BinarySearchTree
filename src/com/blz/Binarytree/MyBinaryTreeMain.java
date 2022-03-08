package com.blz.Binarytree;

public class MyBinaryTreeMain {
	public static void main(String[] args) {

		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(14);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);

		myBinaryTree.searchBST(30);
		int size = myBinaryTree.getSize();
		System.out.println("Size of binary tree is: " + size);
		System.out.println("Binary Tree is :");
		myBinaryTree.print();
	}
}
