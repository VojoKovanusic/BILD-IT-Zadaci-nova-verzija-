package Zadaci_17_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

/*1. Napisati metodu koja vraæa broj dana u godini.
 *  Metoda koristi sljedeæi header: public static int numberOfDayInAYear(int year). 
 *  Napisati program koji pita korisnika da unese poèetnu godinu, krajnju godinu te 
 *  ispisuje broj dana za svaku godinu u rasponu.
 */
public class ZadatakBr1_BrojDana_u_god {

	public static void main(String[] args) {
		System.out.println("\t\tPROGRAM ZA RACUNANJE BROJA DANA U GODINI\n\n"
				+ "Dobar dan,unesite pocetnu godinu i krajnju godinu:");
		Scanner unos = new Scanner(System.in);
		try {
			int pocetnaGodina = unos.nextInt();
			while (pocetnaGodina < 1) {
				System.out
						.println("Ponovo unesite godinu vecu od nule, kao pocetnu");
				pocetnaGodina = unos.nextInt();
			}

			System.out.println("Unesite do koje godine zelite da izracunamo:");
			int krajnjagodina = unos.nextInt();
			while (krajnjagodina < 1) {
				System.out
						.println("Ponovo unesite krajnju godinu vecu od nule:");
				krajnjagodina = unos.nextInt();
			}
			while (krajnjagodina <= pocetnaGodina) {
				System.out.println("Ponovo unesite krajnju godinu vecu od:"
						+ pocetnaGodina);
				krajnjagodina = unos.nextInt();
			}
			unos.close();

			// petlja ide od pocetne do krajnje godine,
			// pozivajuci metodu svaki put sa drugim argumentom(inkrementiranom
			// godinom)

			for (int i = pocetnaGodina; i <= krajnjagodina; i++) {
				System.out.println(i + " godina ima " + numberOfDayInAYear(i)
						+ " dana.");
			}

			// hvatanje greske i vracanje na pocetak zadatka
		} catch (InputMismatchException e) {
			System.out
					.println("Godinu morate unjeti numericki, kao cjelobrojnu vrjednost");
			ZadatakBr1_BrojDana_u_god.main(args);
		}
	}

	// metoda koja vraca broj dana u godini
	public static int numberOfDayInAYear(int year) {

		// ako je godina djeljiva sa 4 i nije djeljiva sa 100 ili je
		// djeljiva sa 400, onda je prestupna
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			return 366;

		}
		// u suprotnom ispisuje
		return 365;

	}
}