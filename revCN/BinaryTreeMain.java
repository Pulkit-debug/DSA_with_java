package revCN;
import java.util.*;

public class BinaryTreeMain {
	
	public static void printRec(BinaryTreeNode<Integer> root) {
		if(root == null) return; // base case.
		String s = root.data + ": ";
		if(root.left != null) {
			s += "L: " + root.left.data + ",";
		}
		if(root.right != null) {
			s += "R: " + root.right.data;
		}
		
		System.out.println(s);
		
		printRec(root.left);
		printRec(root.right);
		
		
	}

	public static BinaryTreeNode<Integer> takeInput(Scanner sc) { // recurrsively taking input
		int rootData;
		System.out.println("Enter root data: ");
		rootData = sc.nextInt();
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(sc);
		root.right = takeInput(sc);
		
		return root;
		
	}

	public static BinaryTreeNode<Integer> inputLevelWise(Scanner sc) {
		
		int rootData;
		System.out.println("Enter root data: ");
		rootData = sc.nextInt();
		
		if(rootData == -1)
			return null;
		
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
			System.out.println("Enter left child of " + frontNode.data);
			int leftChildData = sc.nextInt();
			if(leftChildData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(leftChildData);
				pendingNodes.add(leftChild);
				frontNode.left = leftChild;
			}
			
			System.out.println("Enter right child of " + frontNode.data);
			int rightChildData = sc.nextInt();
			if(rightChildData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(rightChildData);
				pendingNodes.add(rightChild);
				frontNode.right = rightChild;
			}
		}
		return root;
	}
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root == null) return 0;
		
		int option1 = height(root.left)+ height(root.right);
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);
		
		return Math.max(option1, Math.max(option2, option3));
		
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		
		return 1 + Math.max(lh, rh);
	}

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) return ;
		
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {			
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
			String s = frontNode.data + ": ";
			if(frontNode.left != null) {
				s += "L:" + frontNode.left.data + ", ";
				pendingNodes.add(frontNode.left);
			}
			if(frontNode.right != null) {
				s += "R: " + frontNode.right.data;
				pendingNodes.add(frontNode.right);
			}
			
			System.out.println(s);
			 
		}
	}

	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) return Integer.MAX_VALUE;
		
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}
	
	public static int maximum(BinaryTreeNode<Integer> root) {
		if(root == null) return Integer.MAX_VALUE;
		
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root ==  null) return true;
		
		int leftMax = maximum(root.left);
		int rightMin = minimum(root.right);
		
		if(root.data <= leftMax) return false;
		if(root.data >= rightMin) return false;
		
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		
		if(isLeftBST && isRightBST) {
			return true;
		} else return false;
		
	}
	
	
	public static int countNodes(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		
//		if(root.left == null) {
//			return 0;
//		}
//		if(root.right == null) return 0;
//		
		int count = 1;
		
		
		

		
//		if(root == null) return count;
//		if(root.left == -1) return 0;
		
		count += countNodes(root.left);
		count += countNodes(root.right);
		
		return count;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		2 3 4 5 -1 6 7 -1 -1 -1 -1 -1 -1
		
//		BinaryTreeNode<Integer> root = takeInput(sc);
//		printRec(root);
		BinaryTreeNode<Integer> root = inputLevelWise(sc);
		printLevelWise(root);
		int nodesCount = countNodes(root);
		System.out.println("No. of nodes are : " + nodesCount);
		System.out.println("Diameter of tree is: " + diameter(root));
		

	}

}
