package Zadaci28_02_2017;


public class ZadatakBr3_Stoperica {

	public static void main(String[] args) {

		Stoperica stoperica = new Stoperica();

		int niz[] = new int[100000];
		for (int i = 0; i < 100000; i++) {
			niz[i] = (int)(Math.random() * 100000);
		}
		// pocetak mjerenja vremena
		stoperica.start();
		
		sortArray(niz);
		
		// kraj mjerenja vremena
		stoperica.end();

		System.out.println(stoperica);

	}
	//sortiranje niza
	public static void sortArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int minimumIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minimumIndex] > array[j]) {
					minimumIndex = j;
				}
				if (minimumIndex != i) {
					int tempElement = array[minimumIndex];
					array[minimumIndex] = array[i];
					array[i] = tempElement;
				}
			}
		}

	}
}

// klasa stoperica, koja ima dva atributa sa pratecim geterima i seterima
class Stoperica {
	private long startTime;
	private long endTime;

	public void start() {

		this.startTime = System.currentTimeMillis();

	}

	public void end() {
		this.endTime = System.currentTimeMillis();

	}


	public long getElapsedTime() {
		return endTime - startTime;
	}

	public long getStart() {
		return this.startTime;
	}

	public long getEnd() {
		return this.endTime;
	}
	//za ispis
	public String toString() {
		return "Potrebno vrjeme za sortiranje niza iznosi " + getElapsedTime() + " milisek.";
	}
}