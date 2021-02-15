package stack;

public class Algo {
	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.printStack();
		
		st.pop();
		st.printStack();
		
	}
}
