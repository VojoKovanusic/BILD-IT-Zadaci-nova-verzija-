package zadaci_08_02_2017;

import java.util.Scanner;

public class ZadatakBr5 {
	// 5. Napisati program koji uèitava niz brojeva, pronalazi najveæi broj te
	// ispisuje koliko se puta taj broj ponavlja. Pretpostavimo da se unos
	// brojeva završava sa nulom.

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		int broj;
		int max = 0;
		int brojac = 0;

		System.out.println("Unesite niz brojeva:");
		do { // do whilw petlja, koja radi sve dok korisnik ne unese nulu
			broj = unos.nextInt(); // korisnik unosi vrjednost

			if (broj > max) { // ako je uneseni broj, koji je veci od najveceg
								// broja
				max = broj; // onda max postaje uneseni broj
				brojac = 0; // brojac restartujemo na nulu svaki put kada se
							// javi novi max br
			}
			if (broj == max) { // pocinjemo brojanje ponvljanja najveceg broja
				brojac++;
			}
		} while (broj != 0);
		unos.close();
		// ispis
		System.out.println("Najveci uneseni broj je " + max + " i ponovio se "
				+ brojac + " puta.");
	}
}
