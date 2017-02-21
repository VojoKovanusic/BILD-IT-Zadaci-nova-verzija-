package Zadaci21_02_2017;

public class ZadatakBr4_paldromic_prime {

	/*
	 * 4. Palindrome prime je prosti broj koji je takoðer i palindrom. Na
	 * primjer, 131 je palindrome prime, kao i brojevi 313 i 757. Napisati
	 * program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po
	 * liniji.
	 */

	public static void main(String[] args) {
		System.out.println("Prvih sto \"Palindrome prime\" brojeva: \n");

		int brojac = 0;
		for (int broj = 2; true; broj++) {

			if (isPalindromePrime(broj)) {
				System.out.printf("%5d ",broj);
				brojac++;

				// da predje u novi red

				if (brojac % 10 == 0) {
					System.out.println();
				}
			}
			// kada ispise 100 puta prekida petlju
			if (brojac == 100) {
				break;
			}
		}
	}

	// metoda koja prima broj tipa integer i provjerava fa li je broj paldrome i
	// prime, te u tom slucaju vraca true
	public static boolean isPalindromePrime(int x) {
		if (isPrime(x)) {
			if (isPaldrom(x)) {
				return true;
			}
		}

		return false;
	}

	// provjeravamo da li je uneseni paldrom, tj isti citajuci sa obe strane
	private static boolean isPaldrom(int broj) {
		int x = reverse(broj);
		if (x == broj)
			return true;
		return false;
	}

	// metoda koja prima jedan argument i okrece ga naopako
	private static int reverse(int x) {
		int br = x;
		int cifra = 0;
		int reverse = 0;
		// petlja vrti dok uneseni br ne bude 0
		while (br != 0) {
			// vadimo zadnju cifru
			cifra = br % 10;
			// stavljamo je napred
			reverse = reverse * 10 + cifra;
			// da izbacimo dodati broj djelimo
			br /= 10;

		}

		return reverse;
	}

	// ako je broj prost metoda vraca true
	private static boolean isPrime(int broj) {
		for (int i = 2; i < broj; i++) {
			// u slucaju da je sjeljiv sa bilo kojim brojem manjim od sebe,
			// pocevsi od 2 vraca false
			if (broj % i == 0)
				return false;
		}
		return true;
	}
}
