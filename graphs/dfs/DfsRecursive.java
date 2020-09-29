package graphs.dfs;
import java.util.*;

import graphs.GraphNode;
public class DfsRecursive {
	
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	
	// constructor
	 DfsRecursive(ArrayList<GraphNode> nodeList) {
		 this.nodeList = nodeList;
	 }
	
	void dfsR() {
		// if a node is visited then run dfs on it
		for(GraphNode node : nodeList) {
			if(!node.isVisited()) {
				dfsVisitR(node);
			}
		}
	}
	
	void dfsVisitR(GraphNode node) {
		// mark node as visited
		node.setVisited(true);
		System.out.print(node.getName() + " ");
		// for each neighbor of present Node
		for(GraphNode neighbor : node.getNeighbors()) {
			// if neighbor is not visited
			if(!neighbor.isVisited()) {
				// then do recursive call to dfs function
				dfsVisitR(neighbor);
			}
		}
		
	}
	
	void addUndirectedEdgedfsR(int i , int j) {
		GraphNode first = nodeList.get(i-1);
		GraphNode second = nodeList.get(j-1);
		first.getNeighbors().add(second);
		second.getNeighbors().add(first);
		
	}

}
