package linkedList;

public class LinkedList {
	
	static class Node {
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	
	// function to addNode in linked list	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}
		else {
			Node currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}
	
	public void printList() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public int size() {
		int count = 0;
		
		Node currentNode = head;
		
		while(currentNode != null) {
			currentNode = currentNode.next;
			count++;
		}
		
		return count;

	}
	
	public int getData(int index) {
		if (size()!=0 && index<=size()) {
			Node currentNode = head;
			for (int j=0; j<index; j++) {
				currentNode = currentNode.next;
			}
			return currentNode.data;
		}
		return -1;
	}

}
