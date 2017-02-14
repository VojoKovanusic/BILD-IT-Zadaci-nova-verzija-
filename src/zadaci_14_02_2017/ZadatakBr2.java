package zadaci_14_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2 {
	/*
	 * 2. Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u
	 * rasponu godina koje korisnik unese. Program pita korisnika da unese
	 * poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
	 * Razmak izmeðu godina treba biti jedan space.
	 */public static void main(String[] args) {
		System.out.println("\t\tPROGRAM ZA RACUNANJE PRESTUPNIH GODINA\n\n"
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
			int brojac = 0;
			System.out
					.println("\nSve prestupne godine u periodu od "
							+ pocetnaGodina + " god. do " + krajnjagodina
							+ " god. su:\n");

			for (int i = pocetnaGodina; i <= krajnjagodina; i++) {
				// ako je godina djeljiva sa 4 i nije djeljiva sa 100 ili je
				// djeljiva sa 400
				if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
					// onda je ispisujemo
					System.out.print(i + " ");
					brojac++;
					// za ispisanu godinu, brojac inkrementujemo, da bi svaku
					// desetu presli u novi red
					if (brojac % 10 == 0) {
						System.out.println();
					}
				}

			}
		} catch (InputMismatchException e) {
			System.out
					.println("Godinu morate unjeti numericki, kao cjelobrojnu vrjednost");
			ZadatakBr2.main(args);
		}
	}

}
