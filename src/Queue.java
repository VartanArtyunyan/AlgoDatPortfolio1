
// Vartan Artyunyan
// Martikelnummer 5120007

			
public class Queue {
	
	einfachVerketteteListe queue;
	
	
	public Queue() {
		queue = new einfachVerketteteListe();
	}
	
	public void enqueue(int wert) {
		queue.addLast(wert);
	}
	
	public int dequeue() {
		return queue.removeFirst();
	}

}
