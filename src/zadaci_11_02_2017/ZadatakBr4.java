package zadaci_11_02_2017;

public class ZadatakBr4 {
	// Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100
	// nasumiènih brojeva, 10 po liniji.
	public static void main(String[] args) {

		// pozivamo metodu
		printRandomNumber_Char();
	}

	// metoda koja nasupicno printa 100 brojeva(int) i 100 upercase karaktera
	public static void printRandomNumber_Char() {
		System.out.println("Sto nasumicnih int brojeva: ");
		// petlja koja se vrti 100 puta
		for (int i = 1; i <= 100; i++) {
			// pozivamo random metodu iz klas Math
			int broj = (int) (Math.random() * 100);
			// ispisujemo
			System.out.printf("%5d", broj);
			// kada ispise 10 vrjednosti "i" je djeljivo sa 10
			if (i % 10 == 0) {
				// sto znaci da prelazimo u novi red svakih 10 iteracija
				System.out.println();
			}
		}

		System.out.println("\nSto nasmicnih upercase karaktera:");
		// petlja koja se vrti 100 puta
		for (int i = 1; i <= 100; i++) {
			// pozivamo random metodu iz klas Math
			// char karakter = (char) broj;
			// ispisujemo
			int broj = (int) (65 + Math.random() * 26);

			// kastujemo int u karakter
			System.out.print((char) broj + "  ");

			// kada ispise 10 vrjednosti "i" je djeljivo sa 10
			if (i % 10 == 0) {
				// sto znaci da prelazimo u novi red svakih 10 iteracija
				System.out.println();
			}
		}
	}
}