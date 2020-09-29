package graphs.dfs;

import java.util.*;

import graphs.GraphNode;
public class DfsRecursiveMain {
	public static void main(String[] args) {

	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	// create 10 nodes v1 - v10
	for(int i=1;i<11; i++) {
		nodeList.add(new GraphNode("V"+i));
	}
	
	
	DfsRecursive graph = new DfsRecursive(nodeList);
	
	
	//add edges following graph in graph.docx
	graph.addUndirectedEdgedfsR(1,2);
	graph.addUndirectedEdgedfsR(1,4);
	graph.addUndirectedEdgedfsR(2,3);
	graph.addUndirectedEdgedfsR(2,5);
	graph.addUndirectedEdgedfsR(3,6);
	graph.addUndirectedEdgedfsR(3,10);
	graph.addUndirectedEdgedfsR(4,7);
	graph.addUndirectedEdgedfsR(5,8);
	graph.addUndirectedEdgedfsR(6,9);
	graph.addUndirectedEdgedfsR(7,8);
	graph.addUndirectedEdgedfsR(8,9);
	graph.addUndirectedEdgedfsR(9,10);
	
	//dfs from v1
	System.out.println("Printing DFS from source: V1");
	graph.dfsR();
	
	
}

}
