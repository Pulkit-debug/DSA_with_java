package graphs;

public class graphIntro {
		// ********************* TYPES OF GRAPH  *************************
			/* 
			 * 											Graph
			 * 								|											|
			 * 							Directed									Undirected
			 * 						|					|					|						|
			 * 					weighted			unweighted			weighted				unweighted
			 * 	
			 * 				|					|					|				|
			 * 			positive 			negetive			positive		negative
			 * 
			 * 
			 * 
			 * 	1. unWeighted-unDirected
			 *  2. unWeighted-Directed
			 *  3. Positive-Weighted-unDirected
			 *  4. Positive-Weighted-Directed
			 *  5. Negative-Weighted-unDirected
			 *  6. Negative-Weighted-Directed
			 * 
			 * 
			 * 
			 * */
	
	
	
	// 			************************** Representation of Graphs **********************
	
	// 1. Adjacency Matrix: In graph theory, an adjacency matrix is a square matrix used to represent a finite graph. The elements of the matrix indicate whether pairs of vertices are adjacent or not in a graph.
	
	// 2. Adjacency List: In graph theory, an adjacency list is a collections of unordered list used to represent finite graph. Each list describes the set of neighbors of a vertex in a graph.
	
	
	//*********************** When to use which representation ************************
	// 1. If the graph is a complete or 'near to complete Graph' then we should use Adjacency matrix
	
	// 2. If the number of edges are few. then we should use Adjacency List
	
	
	
	
	// *************************** Graph Traversal Techniques *****************************
	
	// 1. Breath First Search(BFS)				 2. Depth First Search(DFS)
	
	// ** What is Graph Traversal ??
		// Solution: Graph traversal refers to the process of visiting each vertex in a graph.
	
	
	
	// ****************** Breath First Search (BFS)
	
		// BFS is an algorithm for traversing graph data structures. It starts at some arbitary node of a  graph and explores
	// the neighbour nodes (which are at current level) first, before moving to the next level neighbors.
	
	
	// BFS can be compared to a level Order Traversal in Tree as it works the same. vising every node first at each level.
	
	
	
	//**************** Algorithm: Breath First Search(BFS)
	
	
	// NOTEL: BFS Uses Queue to implement.
	
	/*
	 * BFS(G):	// where G is the Graph
	 * 	while all vertices are not explored, do:
	 *		enqueue (any vertex)
	 *
	 *		while Queue is not empty
	 *			p = Dequeue()
	 *			if p is unvisited
	 *				print 'p'  and mark 'p' as visited
	 *				enqueue(all adjacent unvisited vertices of 'p')
	 * 
	 * 
	 * */
	
	
	// ******** Handling One Special Scenario of BFS:
		// 1. Disconnected Graph: If we have a Disconnected Graph then neighter we can do BFS nor DFS.
	
	
	// Time Complexity for Breath First Search(BFS)
	
	
	
	/*
	 * BFS(G):	// where G is the Graph
	 * 	while all vertices are not explored, do: -------------------------------O(V) // where V are total vertices
	 *		enqueue (any vertex)----------------------------O(1)
	 *
	 *		while Queue is not empty --------------------------------O(V)                                                        -|
	 *			p = Dequeue() ---------------------------------------O(1)                                    -|                   |
	 *			if p is unvisited----------------------------------------O(1)                                 |--o(Adj Vertex)    |---O(E)                       
	 *				print 'p'  and mark 'p' as visited------------------------O(1)                            |					  |
	 *				enqueue(all adjacent unvisited vertices of 'p')-------------------O(Adj Vertex)          -|					 -|
	 * 
	 * 
	 * */
	
	
	
	// Time Complexity: O(V + E)
	// Space Complexity: O(V + E)
	
	
	// NOTE: BFS can be applied on all the Six types of Graphs
	
	
}
