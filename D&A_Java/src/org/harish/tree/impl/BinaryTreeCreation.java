package org.harish.tree.impl;

/*  Creation of following binary tree
 *        10
 *      /    \
 *     12     3
 *    /  \   /  \
 *   4    5  6   7
 */
public class BinaryTreeCreation {

	public BinaryTreeNode create(){
		BinaryTreeNode root = new BinaryTreeNode(10);
		BinaryTreeNode node2 = new BinaryTreeNode(12);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		root.setLeft(node2);
		root.setRight(node3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		node2.setLeft(node4);
		node2.setRight(node5);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		node3.setLeft(node6);
		node3.setRight(node7);
		
		return root;
	}
	
	public BinaryTreeNode create2(){
		BinaryTreeNode root = new BinaryTreeNode(10);
		BinaryTreeNode node2 = new BinaryTreeNode(12);
		BinaryTreeNode node3 = new BinaryTreeNode(31);
		root.setLeft(node2);
		root.setRight(node3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		node2.setLeft(node4);
		node2.setRight(node5);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		node3.setLeft(node6);
		node3.setRight(node7);
		
		return root;
	}
}
