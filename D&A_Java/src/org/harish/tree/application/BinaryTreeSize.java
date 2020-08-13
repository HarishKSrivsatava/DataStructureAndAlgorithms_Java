package org.harish.tree.application;

import org.harish.tree.impl.BinaryTreeCreation;
import org.harish.tree.impl.BinaryTreeNode;

public class BinaryTreeSize {

	public int size(BinaryTreeNode root){
		int leftCount = root.getLeft() == null ? 0 : size(root.getLeft());
		int rightCount = root.getRight() == null ? 0 : size(root.getRight());
		return (1 + leftCount + rightCount);
		
	}
	
	public static void main(String[] args) {
		BinaryTreeCreation bt = new BinaryTreeCreation();
		BinaryTreeSize btSize = new BinaryTreeSize();
		System.out.println(btSize.size(bt.create()));
	}
}
