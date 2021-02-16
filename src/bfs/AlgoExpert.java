package bfs;

// queue using linked list
public class AlgoExpert {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	Node tail = null;
	
	public void enQueue(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			// head 1st node but tail for new coming nodes
			// head not change position but tail do change
			tail.next = newNode;
		}
		
	}
	
	public int deQueue() {
		
		int val = head.data;
		head = head.next;
		return val;
		
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
	
	public static void main(String[] args) {
		
		AlgoExpert algo = new AlgoExpert();
		algo.enQueue(10);
		algo.enQueue(20);
		algo.enQueue(30);
		algo.printList();
//		algo.deQueue();
//		algo.printList();
		
	}
	
}
