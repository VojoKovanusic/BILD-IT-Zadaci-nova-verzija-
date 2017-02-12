package zadaci_08_02_2017;

public class ZadatakBr4 {
	/*
	 * 4. Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0
	 * i 9 te ispisuje koliko se puta koji broj ponovio.
	 */
	public static void main(String[] args) {

		int brojevi[] = new int[10];// napravljen niz koji ima 10 elemenata tipa int, od
									// 0 do 9
		for (int i = 0; i < 100; i++) { // pustanje u opticaj 100 nasumicni
										// brojeva
			int broj = (int) (Math.random() * 10);

			brojevi[broj]++; // povecava vrjednosti svakog elelmenta u nizu za jedan
								// kada se nasumicno ponvi broj koji je jednak elementu u nizu
		}

		// ispis rezultata
		for (int i = 0; i < brojevi.length; i++) {
			System.out.println("Broj " + i + " se ponovio " + brojevi[i]
					+ " puta");

		}
	}
}
