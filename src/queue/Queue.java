package queue;

// queue using stack
public class Queue {
	
	static Stack stack1 = new Stack();
	static Stack stack2 = new Stack();
	
	void enQueue(int num) {
		// move all elements from stack1 to stack2
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		
		// push item to stack1
		stack1.push(num);
		
		// push everything back to stack1
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
	
	int deQueue() {
		if (stack1.isEmpty()) {
			System.out.print("Queue is empty");
			System.exit(0);
		}
		int num = stack1.peek();
		stack1.pop();
		return num;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(10);
		System.out.println(queue.deQueue());
	}
	
}
