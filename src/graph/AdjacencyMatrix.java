package graph;

public class AdjacencyMatrix {
	
	int size;
	int[][] matrix = new int[size][size];
	
	AdjacencyMatrix(int size) {
		this.size = size;
	}
	
	void addEdges(int sourceNode, int destinationNode) {
		matrix[sourceNode][destinationNode] = 1;
		matrix[destinationNode][sourceNode] = 1;
	}
	
	void printGraph() {
		System.out.println("Printing graph");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	void printEdges() {
		System.out.println("Printing edges");
		for(int i=0; i<size; i++) {
			
			System.out.print(i+" is connected to nodes ");

			for(int j=0; j<size; j++) {
				if(matrix[i][j] == 1) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
	
}
