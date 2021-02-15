package linkedList;

public class Graph {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNode(10);
		linkedList.addNode(20);
		linkedList.addNode(30);
		linkedList.printList();
		System.out.println("There are "+linkedList.size()+" nodes");
		for (int i=0; i<linkedList.size(); i++) {
			System.out.println("Data at index "+ i +" is "+linkedList.getData(i));
		}
	}
}
