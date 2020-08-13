package org.harish.generictree.impl;

/*
 *       10 
 *       |
 *       20 -> 30 -> 50 
 *             |  
 *            40  
 */
public class GenericTreeImpl {

	GenericTreeNode head;
	public GenericTreeNode create(){
		GenericTreeNode node1 = new GenericTreeNode(10,null,null);
		GenericTreeNode node2 = new GenericTreeNode(20,null,null);
		GenericTreeNode node3 = new GenericTreeNode(30,null,null);
		GenericTreeNode node4 = new GenericTreeNode(40,null,null);
		GenericTreeNode node5 = new GenericTreeNode(50,null,null);
	
		head = node1;
		head.setFirstChild(node2);
		
		node2.setNextSibling(node3);
		
		node3.setFirstChild(node4);
		node3.setNextSibling(node5);
		 return head;
		
	}
	
	public String toString(){
		String result = "[ ";
		GenericTreeNode next = null;
		if(head != null){
			result += head.getData()+" ";
		}
		if(head.getFirstChild() != null){
			result += head.getFirstChild().getData()+" "; 
			next = head.getFirstChild();
		}
		while(next.getNextSibling() != null){
			result += next.getNextSibling().getData()+" ";
			next = next.getNextSibling(); 
		}
		return result+ "]";
	} 
	
	public static void main(String[] args) {
		GenericTreeImpl genericTree = new GenericTreeImpl();
		genericTree.create();
		System.out.println(genericTree.toString());
		
		
	}
}
