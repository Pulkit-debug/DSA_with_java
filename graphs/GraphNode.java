package graphs;
import java.util.*;

public class GraphNode {
	String name;
	int index; // this is for adjacency matrix to mark the cell
	ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

	boolean isVisited = false;
	GraphNode parent;
	
	
	public GraphNode(String name, int index) {
		this.name = name;
		this.index = index;
	}

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public boolean isVisited() {
		return isVisited;
	}
	
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	
	
	public GraphNode(String name) {
		this.name = name;
	}
	
	public ArrayList<GraphNode> getNeighbors() {
		return neighbors;
	}
	
	public void setNeighbors(ArrayList<GraphNode> neighbors) {
		this.neighbors = neighbors;
	}
	
	
}




