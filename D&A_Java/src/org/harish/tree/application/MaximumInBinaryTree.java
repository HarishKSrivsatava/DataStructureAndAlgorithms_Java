package org.harish.tree.application;

import org.harish.tree.impl.BinaryTreeNode;

public class MaximumInBinaryTree {

	public int maxInBinaryTree(BinaryTreeNode root) {
		int max = Integer.MIN_VALUE;
		if (root != null) {
			int leftMax = maxInBinaryTree(root.getLeft());
			int rightMax = maxInBinaryTree(root.getRight());
			if (leftMax > rightMax) {
				max = leftMax;
			} else
				max = rightMax;
			if (root.getData() > max)
				max = root.getData();
		}
		return max;
	}

	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(10);
		BinaryTreeNode node2 = new BinaryTreeNode(12);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		root.setLeft(node2);
		root.setRight(node3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(20);
		node2.setLeft(node4);
		node2.setRight(node5);
		BinaryTreeNode node6 = new BinaryTreeNode(9);
		BinaryTreeNode node7 = new BinaryTreeNode(11);
		node3.setLeft(node6);
		node3.setRight(node7);

		MaximumInBinaryTree maxBinaryTree = new MaximumInBinaryTree();
		System.out.println(maxBinaryTree.maxInBinaryTree(root));

	}

}
