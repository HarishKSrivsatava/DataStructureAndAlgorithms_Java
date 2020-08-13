package org.harish.tree.impl;

// PostOrderTraversal : [LRD] / [RLD]
public class PostOrderTravesal {

	public void postOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.print(root.getData() + " ");
		}
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

		PostOrderTravesal pot = new PostOrderTravesal();
		System.out.print("PostOrder Traversal : ");
		pot.postOrderTraversal(root);
	}
}
