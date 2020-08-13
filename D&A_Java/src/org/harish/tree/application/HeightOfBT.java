package org.harish.tree.application;

import org.harish.tree.impl.BinaryTreeCreation;
import org.harish.tree.impl.BinaryTreeNode;
import org.harish.tree.impl.InOrderTraversal;

public class HeightOfBT {

	public int maxHeight(BinaryTreeNode root){
		if(root == null)
			return 0;
		int leftMax = maxHeight(root.getLeft());
		int rightMax = maxHeight(root.getRight());
		return (leftMax > rightMax) ? (leftMax+1) : (rightMax +1);
	}
	
	public static void main(String[] args) {
		BinaryTreeCreation btc = new BinaryTreeCreation();
		BinaryTreeNode bt = btc.create();
		InOrderTraversal iot = new InOrderTraversal();
		iot.inOrderTraversal(bt);
		System.out.println(" ");
		
		HeightOfBT hbt = new HeightOfBT();
		System.out.println("Height of the tree : " + hbt.maxHeight(bt));
	}
	
}
