package org.harish.tree.application;

import org.harish.tree.impl.BinaryTreeCreation;
import org.harish.tree.impl.BinaryTreeNode;

// Find an element in a given binary tree
public class FindInBinaryTree {

	public boolean findElement(BinaryTreeNode root, int data){
		if(null == root)
			return false;
		if(root.getData() == data)
			return true;
		if(null != root.getLeft())
			return findElement(root.getLeft(),data);
		if(null != root.getRight())
			return findElement(root.getRight(),data);
		return false;
	}
	public static void main(String[] args) {
		BinaryTreeCreation btc = new BinaryTreeCreation();
		BinaryTreeNode bt = btc.create();
		FindInBinaryTree findInBinaryTree = new FindInBinaryTree();
		int data = 12;
		System.out.println("Element "+ data +" found ? " + findInBinaryTree.findElement(bt, data));
	}
}
