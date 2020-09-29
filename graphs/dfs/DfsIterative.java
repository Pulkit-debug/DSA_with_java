package graphs.dfs;

import java.util.*;

import graphs.GraphNode;

public class DfsIterative {
	
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	public DfsIterative(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	void dfs() {
		// if a node is unvisted then run dfs on it.
		for(GraphNode node: nodeList) {
			if(!node.isVisited()) {
				dfsVisit(node);
			}
		}
	}
	
	
	// dfs traversal by source node
	void dfsVisit(GraphNode node) {
		// first make an empty stack
		Stack<GraphNode> stack = new Stack<GraphNode>();
		// add source node to the stack.
		stack.push(node);
		// while stack is not empty
		while(!stack.isEmpty()) {
			GraphNode presentNode = stack.pop();
			presentNode.setVisited(true);
			System.out.print(presentNode.getName() + " ");
			// for each neighbor of present Node
			for(GraphNode neighbor : presentNode.getNeighbors()) {
				// if neighbor is not visited then add it to stack
				if(!neighbor.isVisited()) {
					stack.add(neighbor);
					neighbor.setVisited(true);
				}
			}// end of neighbor for
		}// end of while loop
	}// end of method
	
	
	// add an undirected edge between two nodes;
	void addUndirectedEdgeDfs(int i, int j) {
		GraphNode first = nodeList.get(i-1);
		GraphNode second = nodeList.get(j-1);
		first.getNeighbors().add(second);
		second.getNeighbors().add(first);
	}

}
