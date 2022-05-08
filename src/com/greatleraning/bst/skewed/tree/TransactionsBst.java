package com.greatleraning.bst.skewed.tree;

public class TransactionsBst {

	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void ConvertBSToSkewed(Node root, int order) {

		if (root == null) {
			return;
		}
		if (order > 0) {
			ConvertBSToSkewed(root.right, order);
		} else {
			ConvertBSToSkewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		// Condition to check if the root Node of skewed tree is not defined
		
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0) {
			ConvertBSToSkewed(leftNode, order);
		} else {
			ConvertBSToSkewed(rightNode, order);
		}
	}

	// Traverse the right one skewed using recursion
	static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}
	
public static void main(String args[]) {
		
		TransactionsBst.node = new Node(50);
		TransactionsBst.node.left = new Node(30);
		TransactionsBst.node.right = new Node(60);
		TransactionsBst.node.left.left = new Node(10);
		TransactionsBst.node.right.left = new Node(55);

		int order = 0;
		ConvertBSToSkewed(node, order);
		traverseRightSkewed(headNode);
	}
	
}
