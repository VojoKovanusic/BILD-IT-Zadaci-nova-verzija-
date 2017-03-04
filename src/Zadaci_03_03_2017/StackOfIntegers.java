package Zadaci_03_03_2017;

 // klasa sa tri atributa
public class StackOfIntegers {
	private int[] elementi;
	private int velicina;
	public static final int KAPACITET = 16;

	// konstruktor sa defalt kaapcitetom
	public StackOfIntegers() {
		this(KAPACITET);
	}

	// konstru. sa max kapacitetom
	public StackOfIntegers(int kapacitet) {
		elementi = new int[kapacitet];
	}

	// "Push" integer na vrh steka
	public void push(int vrjednost) {
		if (velicina >= elementi.length) {
			int[] temp = new int[elementi.length * 2];
			System.arraycopy(elementi, 0, temp, 0, elementi.length);
			elementi = temp;
		}

		elementi[velicina++] = vrjednost;
	}

	// vraca nam i pomjera elenemat na vrhu steka
	public int pop() {
		return elementi[--velicina];
	}

	// vraca nam top element u stack-u
	public int peek() {
		return elementi[velicina - 1];
	}

	// provjeravamo da li je stek prazan
	public boolean prazan() {
		return velicina == 0;
	}

	// vraca broj elemenata u steku
	public int getSize() {
		return velicina;
	}
}