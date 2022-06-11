package revCN;
import java.util.*;

public class TreeMain {
	
	public static TreeNode<Integer> takeInput(Scanner sc) {
		
		System.out.println("Enter node Data: ");
		int n = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(n);
		System.out.println("Enter no. of childrens for " + n);
		int childCount = sc.nextInt();
		for(int i = 0;i<childCount;i++) {
			TreeNode<Integer> child = takeInput(sc);
			root.children.add(child);
		}
		return root;
		
	}
	
	public static void print(TreeNode<Integer> root) {

		String s = root.data + ":";
		for(int i = 0;i<root.children.size();i++) {
			s = s + root.children.get(i).data + ",";
		}
		
		System.out.println(s);
		
		for(int i = 0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
		
	}

	public static TreeNode<Integer> takeInputLevelWise(Scanner sc) {
		
		System.out.println("Enter root data: ");
		int rootData = sc.nextInt();
		// now make queue
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData); 
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.poll();
			System.out.println("Enter no. of childrens of " + frontNode.data);
			int childCount = sc.nextInt();
			for(int i = 0;i<childCount;i++) {
				System.out.println("Enter " + i + "th child of " + frontNode.data);
				int data = sc.nextInt();
				TreeNode<Integer> child = new TreeNode<>(data);
				frontNode.children.add(child);
				pendingNodes.add(child);
			}
		}
		
		return root;
	}
	
	
	public static int numNodes(TreeNode<Integer> root) {
		if(root == null) return 0; // this is not a base case we don't need base case here because of the loop.
		int count = 1;
		for(int i = 0;i<root.children.size();i++) {
			count += numNodes(root.children.get(i));
		}
		
		return count;
	}

	public static int treeHeight(TreeNode<Integer> root) {
		// given that I'm providing atleast 1 node.
		int maxHeightCount = 0;
		for(int i = 0;i<root.children.size();i++) {
			int max = treeHeight(root.children.get(i));
			maxHeightCount = Math.max(max, maxHeightCount);
		}
		maxHeightCount += 1;
		
		return maxHeightCount;
	}
	
	public static void printLevelWise(TreeNode<Integer> root) {

	
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.poll();
			String s = frontNode.data + ":";
			for(int i = 0;i<frontNode.children.size();i++) {
				TreeNode<Integer> child = frontNode.children.get(i);
				s += frontNode.children.get(i).data + ",";
				pendingNodes.add(child);
			}
			System.out.println(s);
		}
	}

	public static int largestNode(TreeNode<Integer> root) {
		if(root == null) return 0; //edge case
		
		int max = root.data;
		
		for(int i = 0;i<root.children.size();i++) {
			int childValue = largestNode(root.children.get(i));
			if(childValue > max) max = childValue;
		}
		
		return max;
	}
	
	
	public static void depthOfNode(TreeNode<Integer> root, int k) { // k is depth of a node.
		if(k < 0) return;
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		
			for(int i = 0;i<root.children.size();i++) {
				depthOfNode(root.children.get(i), k-1);
			}
		
	}
	
	public static int countLeafNodes(TreeNode<Integer> root) {
		if(root == null) return 0;
		if(root.children.size() == 0) return 1;
		int leafCount = 0;
		for(int i = 0;i<root.children.size();i++) {
			leafCount += countLeafNodes(root.children.get(i));
			
		}
		return leafCount;
	}

	public static void preOrderTraversal(TreeNode<Integer> root) {
		if(root == null) return ;
		System.out.print(root.data + " ");
		for(int i = 0;i<root.children.size();i++) {
			preOrderTraversal(root.children.get(i));
		}
	}
	
	public static void postOrderTraversal(TreeNode<Integer> root ) {
		if(root == null) return ;
		if(root.children.size() == 0) {
			System.out.print(root.data + " ");
			return;
		}
		for(int i = 0;i<root.children.size();i++) {
			preOrderTraversal(root.children.get(i));
		}
		
		System.out.print(root.data + " ");
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		TreeNode<Integer> root = takeInput(sc);
//		print(root);
		TreeNode<Integer> root = takeInputLevelWise(sc);
		printLevelWise(root);
		System.out.println("Number of nodes in the tree are: " + numNodes(root));
		System.out.println("Maximum size of node is: " + largestNode(root));
		System.out.println("Maximum Height of tree is: " + treeHeight(root));
		depthOfNode(root, 2);
		System.out.println("No. of leaf nodes are: " + countLeafNodes(root));
//		preOrderTraversal(root);
//		System.out.println();
		postOrderTraversal(root);
		

//		TreeNode<Integer> tn = new TreeNode<Integer>(5);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(4);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(2);
//		tn.children.add(node1);
//		tn.children.add(node2);
//		node1.children.add(node2);
		
		

	}

}
