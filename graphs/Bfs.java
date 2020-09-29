package graphs;

import java.util.*;
public class Bfs {

	
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	
	// constrcutor
	public Bfs(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	
	void bfs() {
		// if a node is unvisited then run bfs on it.
		for(GraphNode node : nodeList) {
			if(!node.isVisited()) {
				// then do bfs on it
				bfsVisit(node);
			}
		}
	}
	
	
	// BFS Internal Method
	void bfsVisit(GraphNode node) {
		ArrayList<GraphNode> queue = new ArrayList<GraphNode>();
		// here I can also create a queue that with interface linked list but never mind arraylist also works!!!
		queue.add(node); // add source node to queue
		while(!queue.isEmpty()) {
			GraphNode presentNode = queue.remove(0);
			presentNode.setVisited(true);
			System.out.print(presentNode.getName() + " ");
			for(GraphNode neighbor : presentNode.getNeighbors()) { // for each neighbor of presentNode
				if(!neighbor.isVisited()) {
					queue.add(neighbor);
					neighbor.setVisited(true);
				}
			} // end of for loop
		} // end of while loop
	} // end of method
	
	
	
	// Add an undirected edge between two nodes
	
	public void addUndirectedEdge(int i, int j) {
		GraphNode first = nodeList.get(i-1);
		GraphNode second = nodeList.get(j-1);
		first.getNeighbors().add(second); // neighbor of the first is second. Store it.
		second.getNeighbors().add(first); // neighbor of the seond is first. Store it.
		
	} // end of method
	
	
	
} // end of class
