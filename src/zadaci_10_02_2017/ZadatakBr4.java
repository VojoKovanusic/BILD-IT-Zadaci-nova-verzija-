package zadaci_10_02_2017;

import java.util.Scanner;

public class ZadatakBr4 {
	/*
	 * 4. Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu.
	 * Metoda treba da koristi sljedeæi header: public static int[ ]
	 * locateLargest(double[ ][ ] a) Napisati test program koji pita korisnika
	 * da unese 2D niz te mu ispisuje lokaciju najveæeg elementa u nizu.
	 */public static void main(String[] args) {

		// objekat tipa Scanner kako bih omoguæili korisniku unos iz konzole

		Scanner unos = new Scanner(System.in);
		System.out
				.println("Unesite vrjednosti za 2d niz kako bih pronasli lokaciju najveceg elementa!");

		System.out.println("Za pocetak unesite koliko redova ce imat niz:");

		// try catch blok omogucava da uhvatimo gresku u slucaju da korisnike ne
		// unese numericku vrednost iz konzole, te da samo vrati program na
		// pocetak
		try {
			int brRedova = unos.nextInt();
			//validacija, petlja vrti dok ne unesemo br redova veci od nule
			while (brRedova <= 0) {
				System.out
						.println("Br. redova mora biti veca od 0, da bih mogli upisati vrjednosti u njega\n"
								+ "pokusajte ponovo unjeti br redova:");

				brRedova = unos.nextInt();
			}
			System.out.println("Zatim unesite koliko kolona ce imat niz:");

			int brKolona = unos.nextInt();
			//validacija, petlja vrti dok ne unesemo br kolona veci od nule
			while (brKolona <= 0) {
				System.out
						.println("Br. kolona mora biti veca od 0, da bih mogli upisati vrjednosti u njega\n"
								+ "pokusajte ponovo unjeti br kolona:");

				brKolona = unos.nextInt();
			}
			System.out.println("Unesite " + (brKolona * brRedova)
					+ " decimalnih vrjednosti");

			double niz[][] = new double[brRedova][brKolona];

			for (int i = 0; i < niz.length; i++) { // ugnjezdena petlja koja
													// omogucava da
				for (int j = 0; j < niz[i].length; j++) { // korisnik"napuni"2niz
															// sa
															// decimalnim
															// vrjednostim
					niz[i][j] = unos.nextDouble(); // unos iz konzole
					
				}
			}

			System.out.println("Upravo uneseni 2d niz izgleda ovako:");
			// ispis unesenog 2dniza, pozivanjem metode i prosledjivanje
			// argumenta u
			// vidu 2d niza
			ispisiNiz(niz);

			int lokacija[] = locateLargest(niz);

			// ispis lokacije vrjednosti najveceg element u nizu
			System.out.println("Najveci element se nalazi u\nredu br: "
					+ lokacija[0] + " i koloni br: " + lokacija[1] + "!");
		} catch (Exception e) {// u slucaju da uhvati gresku
			System.out
					.println("Niste upisali validan unos iz konzole, pokusajte ponovo!");
			ZadatakBr4.main(args); // pozivamo main
									// metodu tj vracamo se na pocetak
		}
	}

	public static int[] locateLargest(double[][] a) {
		double max = a[0][0];
		int lokaciajMaxEl[] = new int[2]; // ovdje ce mo smjestiti red i kolonu
											// max elemnta u nizu
		for (int red = 0; red < a.length; red++) {// ugnjezdenim for petljama
													// prolazimo kroz sve
													// elemente 2d niza
			for (int kolona = 0; kolona < a[red].length; kolona++) {
				if (max < a[red][kolona]) {
					max = a[red][kolona];
					lokaciajMaxEl[0] = red; // prvom elementu dodjeljujemo
											// indeks reda
					lokaciajMaxEl[1] = kolona; // drugom elementu dodeljujemo
												// ideks kolone
				}

			}

		}

		return lokaciajMaxEl; // ovdje vracamo red i kolonu kom se nalazi max
								// elemenat 2d niza
	}

	// metoda sa dvije ugnjezdene for petlje, koja slizi za ispis 2d niza
	public static void ispisiNiz(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(); // prelazak u novi red

		}
	}
}
