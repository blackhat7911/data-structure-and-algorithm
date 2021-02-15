package linkedList;

public class Implementation {
	
	int vertex = 4;
	LinkedList[] list = new LinkedList[vertex];
	
	public Implementation() {
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
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
    }
	
}
