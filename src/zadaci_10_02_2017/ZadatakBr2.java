package zadaci_10_02_2017;

import java.util.Scanner;

public class ZadatakBr2 {
	/*
	 * 2. Napisati metodu koja nalazi najmanji element u nizu decimalnih
	 * vrijednosti koristeæi se sljedeæim headerom: public static double
	 * min(double[ ] array) Napišite potom test program koji pita korisnika da
	 * unese deset brojeva te poziva ovu metodu da vrati najmanji element u
	 * nizu.
	 */

	public static void main(String[] args) {
		// objekat tipa Scanner kako bih omoguæili korisniku unos iz konzole
		Scanner unos = new Scanner(System.in);

		System.out
				.println("Unesite 10 decimalnih brojeva i program æe naæi najmanju unesenu vrjednost!");
		double niz[] = new double[10];// pravimo objekat, tj prazan 1d niz koji
										// prima deset decimalni vrjednosti

		// try catch blok omogucava da uhvatimo gresku u slucaju da korisnike ne
		// unese numericku vrednost iz konzole, te da samo vrati program na
		// pocetak
		try {
			for (int i = 0; i < 10; i++) {// petlja koja omogucava da
											// korisnik"napuni"niz sa decimalnim
											// vrjednostima

				System.out.println("Unesite decimalnu vrjednost br. " + (i + 1)
						+ ":");

				niz[i] = unos.nextDouble();

			}
			// pozivamo metodu i prosledjujemo joj argumenat
			System.out.println("Najmanja unesena vrjednost je : " + min(niz));
		}

		catch (Exception e) {// u slucaju da uhvati gresku
			System.out
					.println("Niste upisali numericki unos iz konzole, pokusajte ponovo!\n");
			ZadatakBr2.main(args);   //pozivamo main
									// metodu tj vracamo se na pocetak
		}
	}

	public static double min(double[] array) {

		double najmanjiBr = array[0]; // na samom pocetku najmanjemBroju dajemo
		// vrednost prvog elementa u nizu

		// prolazimo petljom kroz sve elemente u nizu
		for (int i = 0; i < array.length; i++) {
			if (najmanjiBr > array[i]) {// ako je najmanjiBr manji od nekog
										// elementa u niz onda najmanjemBroju
										// dobija tu vrjednost
				najmanjiBr = array[i];
			}

		}
		return najmanjiBr;// metoda na svom kraju nam vraca najmanji broj

	}
}
