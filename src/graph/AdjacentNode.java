package graph;

public class AdjacentNode {
	
	public static void main(String[] args) {
		
		int size = 4;
		int matrix[][] = new int[size][size];
		
		AdjacencyMatrix adjMat = new AdjacencyMatrix(4);
		adjMat.addEdges(0, 1);
		adjMat.addEdges(0, 2);
		adjMat.addEdges(1, 0);
		adjMat.addEdges(1, 2);
		adjMat.addEdges(1, 3);
		adjMat.addEdges(2, 0);
		adjMat.addEdges(2, 1);
		adjMat.addEdges(3, 4);
		adjMat.addEdges(4, 3);
		
		System.out.println("Printing edges");
		for(int i=0; i<size; i++) {
			
			System.out.print("Adjacent node of "+i+" are nodes ");

			for(int j=0; j<size; j++) {
				if(matrix[i][j] == 1) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		
	}
	
}
