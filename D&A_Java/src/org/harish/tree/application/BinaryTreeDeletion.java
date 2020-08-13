package org.harish.tree.application;

import org.harish.tree.impl.BinaryTreeCreation;
import org.harish.tree.impl.BinaryTreeNode;
import org.harish.tree.impl.InOrderTraversal;

public class BinaryTreeDeletion {

	public void delete(BinaryTreeNode root){
		root = null;
	}
	
	public static void main(String[] args) {
		BinaryTreeCreation btc = new BinaryTreeCreation();
		BinaryTreeNode bt = btc.create();
		InOrderTraversal iot = new InOrderTraversal();
		iot.inOrderTraversal(bt);
		System.out.println(" ");
		//bt = null;
		BinaryTreeDeletion btd = new BinaryTreeDeletion();
		btd.delete(bt);
		iot.inOrderTraversal(bt);
		System.out.println(" ");
	}
}
