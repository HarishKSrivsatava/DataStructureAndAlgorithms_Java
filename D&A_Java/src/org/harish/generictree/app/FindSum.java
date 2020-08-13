package org.harish.generictree.app;

import org.harish.generictree.impl.GenericTreeNode;
import org.harish.generictree.impl.GenericTreeImpl;;
public class FindSum {

	public int findSum(GenericTreeNode root) {
		if (root == null)
			return 0;
		return root.getData() + findSum(root.getFirstChild()) + findSum(root.getNextSibling());
	}

	public static void main(String[] args) {
		GenericTreeImpl genTree = new GenericTreeImpl();
		GenericTreeNode root = genTree.create();
		FindSum f = new FindSum();
		System.out.println(f.findSum(root));
	}
}
