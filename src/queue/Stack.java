package queue;

public class Stack {

	int size = 4;
	int[] stack = new int[size];
	int top = -1;
	
	void push(int data) {
		if(isFull()) {
			System.out.print("Stack is full");
		}
		top = top + 1;
		stack[top] = data;
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.print("Stack is empty");
			return -1;
		}
		return stack[top--];
	}
	
	boolean isFull() {
		return top==size-1;
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	
	int peek() {
		return stack[top];
	}
	
}
