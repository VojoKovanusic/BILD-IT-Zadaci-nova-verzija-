package Zadaci20_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5_br_ponavljanja_br_u_nizu {

	public static void main(String[] args) {
		try {
			System.out
					.println("Unesite brojeve izmedju 1 i 100, 0 prekida program.\n"
							+ "Program racuna koliko je koji broj unesen puta.");
			Scanner unos = new Scanner(System.in);

			// niz u koji ce mo smestati podatke
			int niz[] = new int[101];

			int broj = unos.nextInt();

			while (broj < 0 || broj > 100) {
				System.out
						.println("Poslednje uneseni broj se nece racunati\nProgram primaa brojeve u rangu od 1 i 100.\n"
								+ "Unesite broj izmedju 1 -100 ili nulu za dosadasnje rezultate.");
				broj = unos.nextInt();
			}

			do {
				// u slucaju da je prvi unjeti br nula
				if (broj == 0) {
					System.out
							.println("Nula sluzi za prekid programa, a ne pocetak!!");
					break;
				}
				// kada korisnik unese broj, nadjemo elemenat sa tim indexom,
				// povecamo njegu vrjednost za 1
				niz[broj] = niz[broj] += 1;

				broj = unos.nextInt();
				while (broj < 0 || broj > 100) {
					System.out
							.println("Poslednje uneseni broj se nece racunati\nProgram prima brojeve u rangu od 1 i 100.\n"
									+ "Unesite broj izmedju 1 -100 ili nulu za dosadasnje rezultate.");
					broj = unos.nextInt();
				}

				// petlja funkcionise dok je korisnikov unos ne bude 0
			} while (broj != 0);
			unos.close();

			// ispis samo onih elemenata cija je vrjednost veca od 0
			for (int i = 0; i < niz.length; i++) {
				if (niz[i] > 0) {
					System.out.println("Broj " + i + " je unesen " + niz[i]
							+ " puta!");
				}
			}
		} catch (InputMismatchException e) { // hvatanje greske
			System.out
					.println("Greska pri unosu. Program prima samo cjelobrojne numericke vrjednosti.");
		}
	}
}
