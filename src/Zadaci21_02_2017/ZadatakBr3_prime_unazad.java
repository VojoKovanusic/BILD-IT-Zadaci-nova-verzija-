package Zadaci21_02_2017;

/*3. Emirp brojevi (prime unazad) je nepalindromski 
 * prosti broj koji je prosti broj i kada ispišemo naopako. 
 * Na primjer, broj 17 i broj 71 su prosti brojevi tako da su brojevi i 17 i 71 
 * emirp brojevi. Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. 
 */

public class ZadatakBr3_prime_unazad {

	public static void main(String[] args) {
		System.out.println("Prvih sto \"Empire\" brojeva: \n");

		int brojac = 0;
		for (int broj = 2; true; broj++) {
			
//ako je  broj empire, upada u selekciju i ispisujemo ga
			if (isEmpire(broj)) {
				System.out.printf("%5d",broj);
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
	
//metoda koja provjerava da li je unjeti argument empire
	public static boolean isEmpire(int broj) {
		int okreniNaopako = reverse(broj);
		//ako nije palindrom
		if (!isPalindrom(okreniNaopako)) {
			//ako su oba prosti i okrenuti i "normalan"
			if (isPrime(okreniNaopako) && isPrime(broj)) {
				//vraca 
				return true;
			}
		}
		//u suprotnom
		return false;
	}
// met. provjerava da i je argumenat prime
	private static boolean isPrime(int broj) {
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0)
				return false;

		}
		return true;
	}
//metoda koja uneseni argumenat okrece naopako
	public static int reverse(int x) {
		int br = x;
		int cifra = 0;
		int reverse = 0;
		while (br != 0) {
			cifra = br % 10;
			reverse = reverse * 10 + cifra;
			br /= 10;

		}

		return reverse;
	}

	//provjerava da li je uneseni broj pali.
	private static boolean isPalindrom(int broj) {
		if (reverse(broj) == broj)
			return true;
		return false;
	}

}
