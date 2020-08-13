package org.harish.tree.application;

import org.harish.tree.impl.BinaryTreeCreation;
import org.harish.tree.impl.BinaryTreeNode;
import  org.harish.tree.impl.InOrderTraversal;

public class InsertInBinaryTreeRecursive {

	public void insertInBinaryTree(BinaryTreeNode root, int data) {
		if (root == null)
			root = new BinaryTreeNode(data);
		if (root.getData() >= data) {
			if (root.getLeft() == null) {
				root.setLeft(new BinaryTreeNode(data));
			} else {
				insertInBinaryTree(root.getLeft(), data);
			}
		} else {
			if (root.getRight() == null) {
				root.setRight(new BinaryTreeNode(data));
			} else {
				insertInBinaryTree(root.getRight(), data);
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeCreation btc = new BinaryTreeCreation();
		BinaryTreeNode bt = btc.create();
		InOrderTraversal iot = new InOrderTraversal();
		iot.inOrderTraversal(bt);
		System.out.println(" ");
		InsertInBinaryTreeRecursive ibtr = new InsertInBinaryTreeRecursive();
		/*ibtr.insertInBinaryTree(bt, 99);
		iot.inOrderTraversal(bt);
		System.out.println(" ");*/
		ibtr.insertInBinaryTree(bt, 8);
		iot.inOrderTraversal(bt);
		
	}
}
