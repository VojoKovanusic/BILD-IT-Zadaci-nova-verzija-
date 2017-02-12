package zadaci_11_02_2017;

import java.util.Scanner;

public class ZadatakBr1 {
	/*//
	 * 1. Napisati program koji pita korisnika da unese neki cijeli broj te
	 * ispisuje njegove najmanje faktore u rastuæem redosljedu. Na primjer,
	 * ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2 * 2
	 * * 2 * 3 * 5 = 120)
	 */

	public static void main(String[] args) {
		// klasa skener omogucuje unos iz konzole
		Scanner unos = new Scanner(System.in);
		System.out
				.println("Unese neki cijeli broj da ispišemo njegove najmanje faktore u rastuæem redosljedu:");

		try {
			int broj = unos.nextInt();

			int potencijalniFaktor = 1;
int br=broj;//sacuvao vrednost za ispis
			while (true) { // petlja vrti dok neka od selekcija ne prekine
				potencijalniFaktor++; // na pocetku svake iteracije povecavamo
										// potencijalni faktor
				if (broj == 1) { // ako je uneseni broj 1, onda ima samo jedan
									// faktor, tj samog sebe
					System.out.println(1);
					break; // prekid
				}
				if (broj <=0) { // ako je uneseni broj 0 ili manji, onda nastupa prakid i
									// restartovanje programa
					System.out.println("Da bi se provjerili Faktori boja, uneseni broj mora biti vrci od 0\nPokusajte ponovo!");
					ZadatakBr1.main(args);

				}

				if (broj % potencijalniFaktor == 0) { // Faktor djeljiv onda je
														// on faktor
					System.out.print(potencijalniFaktor + " ");
					broj /= potencijalniFaktor; // djelimo broj sa faktorom
					potencijalniFaktor = 1; // resetujemo faktor
				}
				if (broj <= 1) { // da ne bi otisli u minus
					break;
				}
			}
System.out.print(" su najmanji faktori broja "+br+".");
		} catch (Exception e) { // hvatamo gresku iz konzole, pa korisnika
								// vracamo na pocetak
			System.out
					.println("Greska pri unosu iz konzole, unesite cjeli broj!");
			ZadatakBr1.main(args);// pozivamo main i vraca se na pocetak zadatka
		}
	}
}
