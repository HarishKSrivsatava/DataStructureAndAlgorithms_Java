package org.harish.tree.impl;
/*  Creation of following binary tree
 *        10
 *      /    \
 *     12     3
 *    /  \   /  \
 *   4    5  6   7
 */

class BTNode{
	private int data;
	private BTNode left, right;

	public BTNode(){}
	public BTNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;

	}
	public BTNode(int data, BTNode left, BTNode right){
		this.data = data;
		this.left = left;
		this.right = right;

	}
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public org.harish.tree.impl.BTNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(org.harish.tree.impl.BTNode leftChild) {
		this.leftChild = leftChild;
	}

	public org.harish.tree.impl.BTNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(org.harish.tree.impl.BTNode rightChild) {
		this.rightChild = rightChild;
	}


	public  void inOrderTraversal(BTNode root){
		while(root != null){
			inOrderTraversal(root.getLeftChild());
			print(root.data);
			inOrderTraversal(root.getRightChild());
		}
	}
}

public class Test {


	public static void main(String[] args) {

		System.out.println("Hello world");
        BTNode root = new BT(10);
		BTNode left = new BT(12);
		BTNode right = new BT(3);
		root.setLeftChild(left);
		root.setRightChild(right);

		root.inOrderTraversal(root);
	}
}
