package Zadaci21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr1_napojnica {

	public static void main(String[] args) {
		/*
		 * 1. (Izraèunavanje napojnice) Napisati program koji uèitava ukupan
		 * iznos raèuna koji treba uplatiti kao i procenat tog raèuna kojeg
		 * želimo platiti kao napojnicu te izraèunava ukupan raèun i napojnicu.
		 * Na primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao procenat
		 * za napojnicu program treba da ispiše da je ukupan raèun za uplatiti
		 * 11.5 a napojnica 1.5.
		 */

		try {// pocetak bloka za hvatanje greske
			Scanner unos = new Scanner(System.in);
			System.out.println("Unesite vrjednost racuna koji morate platiti:");
			double racun = unos.nextDouble();

			// ako je racun manji od nula, upada u petlju
			while (racun <= 0) {
				System.out
						.println("Ne moze vrjednost racuna biti manja od 0, unesite ponovo:");
				racun = unos.nextDouble();
			}
			System.out
					.println("Unesite procenat koji zelite platiti kao naponicu:");
			double procenat = unos.nextDouble();

			// ako je unseni procenat negativan, upada u petlju dok ne unese
			// pozitivan
			while (procenat <= 0) {
				System.out
						.println("Unesite procenat napojnice veci od 0\nako ne zelite dati napojnicu "
								+ "platite samo racun od "
								+ racun
								+ " KM i ne treba vam ovaj program,\nu suprotnom  unesite ponovo procenat veci od 0: ");
				procenat = unos.nextDouble();
			}
			// napojnicu dobijemo tako sto racun pomnozimo sa procentom,
			// konvertovanim u decimalnu vrjednost
			double napojnica = racun * (procenat / 100);

			double savRacun = napojnica + racun;
			unos.close();
			// u slucaju da gost zeli postaviti napojnicu
			if (procenat >= 0)
				System.out.println("Ukupan  racun za platiti iznosi "
						+ savRacun + " KM, a vrjednost napojnice je "
						+ napojnica + " KM.");

			// u slucaju da gost ne zeli postaviti napojnicu
			else

				System.out
						.println("S obzirom da ne zelite ostaviti napojnicu vas racun za uplatiti iznosi "
								+ savRacun + " KM");

		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos, prekid programa.");
		}

	}

}
