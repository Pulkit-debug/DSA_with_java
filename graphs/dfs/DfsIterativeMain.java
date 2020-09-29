package graphs.dfs;
import java.util.*;
import graphs.GraphNode;


public class DfsIterativeMain {

	public static void main(String[] args) {
		
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		
		for(int i = 1;i<11;i++) {
			nodeList.add(new GraphNode("V" + i));
		}
		
		// constructor
		DfsIterative graph = new DfsIterative(nodeList);
		
		graph.addUndirectedEdgeDfs(1, 2);
		graph.addUndirectedEdgeDfs(1, 4);
		graph.addUndirectedEdgeDfs(2, 3);
		graph.addUndirectedEdgeDfs(2, 5);
		graph.addUndirectedEdgeDfs(4, 5);
		graph.addUndirectedEdgeDfs(3, 6);
		graph.addUndirectedEdgeDfs(3, 8);
		graph.addUndirectedEdgeDfs(6, 9);
		graph.addUndirectedEdgeDfs(7, 8);
		graph.addUndirectedEdgeDfs(9, 10);
		
//		dfs from v1
		
		System.out.println("Printing Dfs from V1");
		graph.dfs();
		

	}

}
