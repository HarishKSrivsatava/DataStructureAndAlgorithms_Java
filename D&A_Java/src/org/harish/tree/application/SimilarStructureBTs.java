package org.harish.tree.application;

import org.harish.tree.impl.BinaryTreeCreation;
import org.harish.tree.impl.BinaryTreeNode;
import org.harish.tree.impl.InOrderTraversal;
public class SimilarStructureBTs {
	
	public boolean similarStructuredBT(BinaryTreeNode root1, BinaryTreeNode root2){
		
		if(root1 == null && root2 == null)
			return true;
		if(root1 == null || root2 == null)
			return false;
		if(root1.getData() != root2.getData())
			return false;
		return (similarStructuredBT (root1.getLeft(),root2.getLeft())
				&& similarStructuredBT (root1.getRight(),root2.getRight()));
	}
	
	public static void main(String[] args) {
		BinaryTreeCreation btc = new BinaryTreeCreation();
		InOrderTraversal iot = new InOrderTraversal();
		BinaryTreeNode bt1 = btc.create();
		iot.inOrderTraversal(bt1);
		System.out.println(" ");
		
		BinaryTreeNode bt2 = btc.create();
		iot.inOrderTraversal(bt2);
		System.out.println(" ");
		
		BinaryTreeNode bt3 = btc.create2();
		iot.inOrderTraversal(bt3);
		System.out.println(" ");
		
		SimilarStructureBTs sst = new SimilarStructureBTs();
		
		System.out.println(sst.similarStructuredBT(bt1, bt2));
		System.out.println(sst.similarStructuredBT(bt2, bt3));
		
	}

}
