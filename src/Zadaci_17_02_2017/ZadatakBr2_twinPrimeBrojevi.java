package Zadaci_17_02_2017;

public class ZadatakBr2_twinPrimeBrojevi {
	/*
	 * 2. Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na
	 * primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer
	 * twin primes. Napisati program koji ispisuje sve twin prime brojeve manje
	 * od 10000, 10 parova po liniji.
	 */public static void main(String[] args) {
		int brojac = 0;

		for (int i = 2; i < 10000 - 2; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.printf("("+i + ";" + (i + 2) + ") ");
				brojac++;
				if (brojac == 10) {
					System.out.println();
					brojac = 0;
				}
			}

		}
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}



}
