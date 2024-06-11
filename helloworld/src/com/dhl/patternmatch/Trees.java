package com.dhl.patternmatch;

import java.util.Scanner;

public class Trees {

	public static void main(String[] args) {

		int n;
		String word;
		BST t = new BST();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 : Add a new word");
		System.out.println("Press 2 : InOrder Tree Traversal");
		System.out.println("Press 3 : Exit");

		do {
			System.out.println("Enter number");
			n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.println("Enter the word to be inserted");
				word = sc.next();
				t.insert(word);
				break;

			case 2:
				System.out.println("Traversal output");
				t.inOrderTreeTraversal();
				break;

			default:
				System.out.println("Invalid Selection");
			}
		} while (n != 3);
		sc.close();
	}
}

class BST{
	private TreeNode root;

	public void insert(String s) {

		if (root == null) {
			root = new TreeNode(s);

		}
		TreeNode word = root;
		while (word != null) {
			if (s.compareTo(word.data) < 0) {
				if (word.left != null)
					word = word.left;
				else {
					word.left = new TreeNode(s);

				}
			} else if (s.compareTo(word.data) > 0) {
				if (word.right != null)
					word = word.right;
				else {
					word.right = new TreeNode(s);

				}
			} else
				break;

		}

	}

	public void inOrderTreeTraversal() {

		inOrderT(root);

	}

	public void inOrderT(TreeNode t) {
		if (t != null) {
			inOrderT(t.left);
			System.out.println(t.data);
			inOrderT(t.right);
		}
	}

	public class TreeNode {
		public String data;
		public TreeNode left, right;

		public TreeNode(String d) {
			this.data = d;
			this.left = null;
			this.right = null;
		}
	}
}
