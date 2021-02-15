package graph;

public class Graph {
	// graph is ordered pair or collection of vertices and edges.
	// G = O(V,E)
	// in DSA graph is collection of node and edges.
	public static void main(String[] args) {
		AdjacencyMatrix mat = new AdjacencyMatrix();
		mat.addEdges(0, 1);
		mat.addEdges(0, 2);
		mat.addEdges(0, 3);
		mat.addEdges(1, 0);
		mat.addEdges(1, 2);
		mat.addEdges(1, 3);
		mat.addEdges(2, 0);
		mat.addEdges(2, 1);
		mat.addEdges(3, 0);
		mat.addEdges(3, 1);
		mat.printGraph();
		mat.printEdges();
	}
}
