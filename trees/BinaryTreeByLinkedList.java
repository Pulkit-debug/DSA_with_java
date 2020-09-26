package trees;
import java.util.*;

public class BinaryTreeByLinkedList {

	BTNode root;
	
	// constructor for creating a blank binary tree
	BinaryTreeByLinkedList() {
		this.root = null;
	}

	
	
	void insertNodeInBinaryTree(int value) {
		BTNode node = new BTNode();
		node.setValue(value);
		if(root == null) {
			root = node;
			System.out.println("Successfully Inserted new node at root!");
			return;
		}
		else {
			// Now in this case we will do level order travsersal and find the first null;
			Queue<BTNode> queue = new LinkedList<BTNode>();
			queue.add(root);
			while(!queue.isEmpty()) {
				BTNode presentNode = queue.remove();
				if(presentNode.getLeft() == null) {
					presentNode.setLeft(node);
					System.out.println("Successfully inserted new node at left");
					return;
				}
				else if(presentNode.getRight() == null) {
					presentNode.setRight(node);
					System.out.println("Successfully inwerted new node at right");
					return;
				}
				else {
//					if(presentNode.getLeft() != null) 
						queue.add(presentNode.getLeft());
//					if(presentNode.getRight() != null)
						queue.add(presentNode.getRight());
				}
			}
		}
	}
	
	
	void deleteNodeInBinaryTree(int value) {
		Queue<BTNode> queue = new LinkedList<BTNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BTNode presentNode = queue.remove();
			if(presentNode.getValue() == value) {
				presentNode.setValue(getDeepestNode().getValue());
				deleteDeepestNode();
				System.out.println("Node Deleted Successfully!!");
				return;
				}
			else {
				if(presentNode.getLeft() != null) 
					queue.add(presentNode.getLeft());
				if(presentNode.getRight() != null) 
					queue.add(presentNode.getRight());
			}
		}
		System.out.println("Was not able to find the Node!!");
				
	}
	
	void deleteDeepestNode() {
		Queue<BTNode> queue = new LinkedList<BTNode>();
		queue.add(root);
		BTNode presentNode = null;
		BTNode previousNode = null;
		while(!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			if(presentNode.getLeft() == null) {
				previousNode.setRight(null);
				return;
			}
			else if(presentNode.getRight() == null) {
				presentNode.setLeft(null);
				return;
			}
			queue.add(presentNode.getLeft());
			queue.add(presentNode.getRight());
		}
	}
	
	
	
	// Deleting Binary Tree
	void deleteBinaryTree() {
		root = null;
		System.out.println("Full Tree Deleted!!");
	}
	// T.C -> O(1)
	
	
	
	// get last node of last level of binary tree
	public BTNode getDeepestNode() {
		Queue<BTNode> queue = new LinkedList<BTNode>();
		queue.add(root);
		BTNode presentNode = null;
		while(!queue.isEmpty()) {
			presentNode = queue.remove();
			if(presentNode.getLeft() != null) 
				queue.add(presentNode.getLeft());
			if(presentNode.getRight() != null) 
				queue.add(presentNode.getRight());
		}
		return presentNode;
		// this is the deepest node we are returning
	}
	
	// preorder traversal of binary tree
	void preOrderTraversal(BTNode node) {
		if(node == null) return;
		else {
			System.out.print(node.getValue() + " ");
			preOrderTraversal(node.getLeft());
			preOrderTraversal(node.getRight());
		}
	}
	// T.C -> O(n)
	// S.C -> O(n)
	
	
	// in Order Traversal
	void inOrderTraversal(BTNode node) {
		if(node == null) return;
		else {
			inOrderTraversal(node.getLeft());
			System.out.print(node.getValue() + " ");
			inOrderTraversal(node.getRight());
		}
	}
	// T.C -> O(n)
		// S.C -> O(n)
	
	
	// post order traversal
	void postOrderTraversal(BTNode node) {
		if(node == null) return;
		else {
			postOrderTraversal(node.getLeft());
			postOrderTraversal(node.getRight());
			System.out.print(node.getValue() + " ");
			
		}
	}
	// T.C -> O(n)
		// S.C -> O(n)
	
	
	void levelOrderTraversal() {
		
		// make a queue for level order. Queue is Interface and linked list is class
		Queue<BTNode> queue = new LinkedList<BTNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BTNode presentNode = queue.remove();
			System.out.print(presentNode.getValue() + " ");
			if(presentNode.getLeft() != null) {
				queue.add(presentNode.getLeft());
			}
			if(presentNode.getRight() != null) {
				queue.add(presentNode.getRight());
			}
		}
	}
	
	
	void searchInBinaryTree(int value) {
		if(root == null) return;
		else {
			// NOw here do the level order traversal
			Queue<BTNode> queue = new LinkedList<BTNode>();
			queue.add(root);
			while(!queue.isEmpty()) {
				BTNode presentNode = queue.remove();
				if(presentNode.getValue() == value) {
					System.out.println("Value " + value + " is present in the Tree");
					return;
				}
				else {
				if(presentNode.getLeft() != null) {
					queue.add(presentNode.getLeft());
				}
				if(presentNode.getRight() != null) {
					queue.add(presentNode.getRight());
				}
				}
			}
			System.out.println("Value " + value + " is not present in the Tree");
		}
	}
	
	
	
}
