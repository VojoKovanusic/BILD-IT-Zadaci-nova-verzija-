package zadaci_15_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr1ZbirNasumicnihBr {

	/*
	 * 1. Napisati program koji ispisuje tri nasumièna cijela broja te pita
	 * korisnika da unese njihov zbir. Ukoliko korisnik pogriješi, program
	 * ispisuje pitanje ponovo sve sa porukom da pokuša ponovo. Ukoliko korisnik
	 * unese taèan odgovor, program mu èestita i završava sa radom.
	 */public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		try {
			int zbir = 0;
			System.out.println("Koliko iznosi zbir ova tri broja?");
			for (int i = 0; i < 3; i++) {
				// nasumican broj
				int x = (int) (Math.random() * 100);

				zbir += x;
				// uslov da u zadnjem broju ne ispise znak +, vec upitnik
				if (i == 2) {
					System.out.print(x + " ?");
					break;
				}

				System.out.print(x + "+");

			}
             System.out.println();
			int odgovor = unos.nextInt();

			if (odgovor != zbir) {
				System.out.println("Odgovor nije tacan, tacan odgovor je: "
						+ zbir + "\nPokusajte ponovo, sa nova tri broja!");
				ZadatakBr1ZbirNasumicnihBr.main(args);

			} else
				System.out.println("Cestitamo!!!");
			unos.close();
		} catch (InputMismatchException e) {
			System.out
					.println("Greska, program samo prima cjelobrojne brojeve!");
			ZadatakBr1ZbirNasumicnihBr.main(args);
		}
	}
}
