package linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Implementation {
	
	int vertex = 4;
	LinkedList[] list = new LinkedList[vertex];
	
	public Implementation() {
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }
	
	public List<Integer> getAdjNode(int value){
		
		List<Integer> adjList = new ArrayList<>();
		
		for(int i=0; i<list[value].size(); i++) {
			adjList.add(list[value].getData(i));
		}
		return adjList;
	}
	
	public void BFS(int rootNode) {
		
		System.out.println("Printing BFS ");
		
		boolean visited[] = new boolean[vertex];
		Queue q = new Queue();
		visited[rootNode] = true;
		q.enQueue(rootNode);
		while(q.size()!=0) {
			int value = q.deQueue();
			System.out.println(value);
			Iterator<Integer> iter = getAdjNode(value).iterator();
			while(iter.hasNext()) {
				int adjValue = iter.next();
				if(!visited[adjValue]) {
					q.enQueue(adjValue);
					visited[adjValue] = true;
				}
			}
		}
				
	}
	
	public void addEdges(int source, int destination) {
		list[source].addNode(destination);
		list[destination].addNode(source);
	}

	public void printGraph() {
		for(int i=0; i<vertex; i++) {
			list[i].printList();
			if(list[i].size() > 0) {
				for(int j=0; j<list[i].size(); j++) {
					System.out.print
					(list[i].getData(j));
				}
			}
		}
	}
	
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        //list.printList();
        // get size of array
        //System.out.print(list.size());
        // get data at index
        //System.out.print(list.getData(1));
        
        Implementation imp = new Implementation();
        imp.addEdges(0, 1);
        imp.addEdges(0, 2);
        imp.addEdges(1, 2);
        imp.addEdges(2, 3);
        imp.printGraph();
        
        System.out.println();
        System.out.println("Printing BFS");
        System.out.println(imp.getAdjNode(2));
        imp.BFS(0);
        

    }
	
}
