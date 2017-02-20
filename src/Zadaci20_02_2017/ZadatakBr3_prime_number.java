package Zadaci20_02_2017;

public class ZadatakBr3_prime_number {

	/*
	 * 3. Napisati metodu sa sljedeæim headerom: public static int isPrime(int
	 * n) koja provjerava da li je broj prost/prime. Napsati test program koji
	 * poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
	 */

	public static void main(String[] args) {
		int brojac = 0;
		
		for (int i = 2; i < 100000; i++) {

			// metoda "isPrime" 1 ako je broj prost...
			if (isPrime(i) == 1) {
				System.out.print(i + " ");
				brojac++;
			}
			//za prelazak u novi red nakon 10 ispisa(radi preglednosti sam stavio)
			if (brojac == 10) {
				System.out.println();
				brojac = 0;
			}
		}
	}

	// ako je uneseni broj prost, vraca 1, u suprotnom nula
	public static int isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return 0;

		}
		return 1;
	}
}
