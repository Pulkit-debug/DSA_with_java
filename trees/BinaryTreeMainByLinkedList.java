package trees;

public class BinaryTreeMainByLinkedList {

	public static void main(String[] args) {
		// In total we have four options to traverse a binary tree
		// **** Depth first Search *******
		//1. Preorder Traversal
		//2. InOrder Traversal
		//3. PostOrder Traversal
		
		// ****** Breadth First Search *****
		//1. LevelOrder Traversal
		
		
		BinaryTreeByLinkedList tree = new BinaryTreeByLinkedList();
		
		System.out.println("Inserting Nodes in Tree!");
		for(int i = 1;i<=10;i++) {
			tree.insertNodeInBinaryTree(i*10);
		}
		
		System.out.println("Level order Traversal!");
		tree.levelOrderTraversal();
		System.out.println();
		
		
		System.out.println("pre order Traversal");
		tree.preOrderTraversal(tree.root);
		System.out.println();
		
		
		System.out.println("post order Traversal!");
		tree.postOrderTraversal(tree.root);
		System.out.println();
		
		
		System.out.println("in order Traversal");
		tree.inOrderTraversal(tree.root);
		System.out.println();
		
		
		System.out.println("Searching in tree");
		tree.searchInBinaryTree(7);
		System.out.println();
		
		System.out.println("Deleting node in Binary Tree");
		tree.deleteNodeInBinaryTree(50);
		tree.deleteNodeInBinaryTree(30);
		
		System.out.println("Level order Traversal!");
		tree.levelOrderTraversal();
		System.out.println();
	
		System.out.println("Deleting Full Tree");
		tree.deleteBinaryTree();

	}

}
