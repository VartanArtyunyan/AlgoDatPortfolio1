// Vartan Artyunyan
// Martikelnummer 5120007

			
public class einfachVerketteteListe {

	private class Knoten {
		int wert;
		Knoten next;

		public Knoten(int wert) {
			this.wert = wert;
		}
	}

	Knoten anfang, ende;
	int size;

	public einfachVerketteteListe() {
		anfang = null;
		ende = null;
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public void addLast(int wert) {
		if (searchOhneAusgabe(wert)) return;
		size++;
		Knoten neuerKnoten = new Knoten(wert);
		if (size == 1) {
			ende = neuerKnoten;
			anfang = neuerKnoten;
			return;
		}
		ende.next = neuerKnoten;
		ende = ende.next;
	}

	public void addFirst(int wert) {
		if (searchOhneAusgabe(wert)) return;
		size++;
		Knoten neuerKnoten = new Knoten(wert);
		if (size == 1) {
			ende = neuerKnoten;
			anfang = neuerKnoten;
			return;
		}
		neuerKnoten.next = anfang;
		anfang = neuerKnoten;
	}

	public int removeLast() {
		try {
			if (size == 0) throw new RuntimeException("Du hast versucht ein Element aus einer leeren Liste zu entfernen");
			size--;
			int output = ende.wert;
			Knoten temp = anfang;
			for (int i = 0; i < size - 1; i++) {
				temp = temp.next;
			}

			ende = temp;
			return output;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int removeFirst() {
		try {
			if (size == 0) throw new RuntimeException("Du hast versucht ein Element aus einer leeren Liste zu entfernen");
			size--;
			int output = anfang.wert;
			anfang = anfang.next;
			return output;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public boolean searchOhneAusgabe(int wert) {
		boolean output = false;
		Knoten temp = anfang;

		while (!output && temp != null) {
			if (temp.wert == wert) output = true;
			temp = temp.next;
		}
		return output;
	}

	
	public boolean search(int wert) {
		boolean output = false;
		int count = 0;
		Knoten temp = anfang;

		while (!output && temp != null) {
			if (temp.wert == wert) output = true;
			temp = temp.next;
			count++;
		}
		System.out.println("Normale Suche: Es wurden " + count + " Vergleichsoperationen durchgeführt");
		return output;
	}

	public boolean searchAndAdapt(int wert) {

		boolean output = false;
		int count = 0;
		Knoten temp = anfang;
		Knoten prev = null;

		while (!output && temp != null) {
			if (temp.wert == wert) output = true;
			else {
				prev = temp;
				temp = temp.next;
			}
			count++;
		}
		if (output && count > 1) {
			prev.next = temp.next;
			temp.next = anfang;
			anfang = temp;
		}
		System.out.println("Adaptive Suche: Es wurden " + count + " Vergleichsoperationen durchgeführt");
		return output;

	}

}
