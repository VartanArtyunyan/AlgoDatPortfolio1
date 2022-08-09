// Vartan Artyunyan
// Martikelnummer 5120007

			
import java.util.Random;

public class Main {
	
	public static void testRun() {
		
		Random r = new Random();
		long zeitnormal;
		long zeitadaptiv;
		long start;
		long ende;

		einfachVerketteteListe l1 = new einfachVerketteteListe();
		einfachVerketteteListe l2 = new einfachVerketteteListe();
		
		for(int i = 0; i < 32000; i++) {
		int n = r.nextInt(32000);
		l1.addLast(n);
		l2.addLast(n);
		}
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 8000; i++) {
			l1.search(r.nextInt(32000));
		}
		ende = System.currentTimeMillis();
		zeitnormal = ende - start;
		start = System.currentTimeMillis();
		for(int i = 0; i < 8000; i++) {
			l2.searchAndAdapt(r.nextInt(32000));
		}
		ende = System.currentTimeMillis();
		zeitadaptiv = ende - start;
		
		System.out.println("Zeit für normale suche: " + zeitnormal + " Millisekunden");
		System.out.println("Zeit für adaptive suche: " + zeitadaptiv + " Millisekunden");
	}

	
	
	public static void main(String[] args) {
		
		
		testRun();
		
	

	}

}
