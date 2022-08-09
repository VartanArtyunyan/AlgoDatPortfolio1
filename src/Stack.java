// Vartan Artyunyan
// Martikelnummer 5120007

			

public class Stack {
	
	
	einfachVerketteteListe stack;

	public Stack() {
		stack = new einfachVerketteteListe();
	}
	
	public void push(int wert) {
		stack.addLast(wert);
	}
	
	public int pop() {
		return stack.removeLast();
	}

}
