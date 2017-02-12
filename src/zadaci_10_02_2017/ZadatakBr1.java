package zadaci_10_02_2017;

import java.io.IOException;
import java.util.Scanner;

public class ZadatakBr1 {
	/*
	 * 1. Napisati metodu koja prima 2 argumenta: pocetni broj i krajnji broj te
	 * printa sve proste brojeve u zadanom rangu. BONUS: metoda moze primati i
	 * treæi argument, broj brojeva za isprintati po liniji.
	 */
	public static void main(String[] args) {

		// objekat tipa Scanner kako bih omogucili korisniku unos iz konzole
		Scanner unos = new Scanner(System.in);
		System.out
				.println("Upisite dva broja u cijem intervalu da ispisemo proste brojeve !\n"
						+ "Poèetni broj:");

		// try catch blok omogucava da uhvatimo gresku u slucaju da korisnike ne
		// unese numericku vrednost iz konzole, te da samo vrati program na
		// pocetak
		try {

			// korisniku omogucujemo upis iz konzole
			int pocetniBroj = unos.nextInt();
			{
				while (pocetniBroj < 0) {
					System.out.println("Unesite pocetni br veci od nule!");
					pocetniBroj = unos.nextInt();
				}

				System.out.println("Unesite krajnji broj:");

				// korisniku omogucujemo upis iz konzole
				int krajnjiBroj = unos.nextInt();

				// validacija, da petlja vrti dok unos ne bude validan
				while (pocetniBroj >= krajnjiBroj) {
					System.out
							.println("Pa za Boga miloga, krajnji broj mora biti veci! \nPokusajte sa veæim brojm od "
									+ pocetniBroj + "!");
					krajnjiBroj = unos.nextInt();
				}
				System.out
						.println("Koliko želite brojeva da se isprintati po liniji:");

				// korisniku omogucujemo upis iz konzole
				int brojevaPoLiniji = unos.nextInt();

				// validacija, da petlja vrti dok unos ne bude validan
				while (brojevaPoLiniji <= 0) {
					System.out
							.println("Unesite broj koji je veci od nule, ne moze biti negativan broj linija");
					brojevaPoLiniji = unos.nextInt();
				}

				System.out.println("Svi prosti brojevi u intervalu od "
						+ pocetniBroj + " do " + krajnjiBroj + ":");
				isprintajProsteBrojeve(pocetniBroj, krajnjiBroj,
						brojevaPoLiniji);
			}
		} catch (Exception e) {// hvata potencijalnu gresku
			System.out.println("Program samo prima numericke vrjednosti, "
					+ "vraæeni ste na pocetak programa");
			ZadatakBr1.main(args);// pozivamo main metodu, tj vracamo se na
									// pocetak
		}

	}

	// metoda za ispisivanje prostih brojeva
	public static void isprintajProsteBrojeve(int pocetak, int kraj,
			int brojevaPOLiniji) {
		int brojac = 0;

		for (int i = pocetak; i < kraj; i++) {// petlja koja ide (od-do)u
												// zadatom intervalu od strane
												// korisnika

			if (daLiJeprost(i)) { // prosledjivanje argumenta metodi
				System.out.printf("%5d ", i); // ispis
				brojac++;
				if (brojac == brojevaPOLiniji) { // da predje u novi red
					System.out.println();
					brojac = 0; // restartujemo brojac, da bih mogao brojati
								// izpocetka
				}
			}
		}
	}

	// metoda sa jednim parametrom,koja ispituje da li je uneseni broj prost
	public static boolean daLiJeprost(int brojKojiSeIspituje) {
		for (int i = 2; i < brojKojiSeIspituje; i++) {
			if (brojKojiSeIspituje % i == 0) {// ako je broj djeljiv sa nekim
												// brpjem manjim od sebe
				return false; // vraca false
			}
		}

		return true; // u suprotnom, prost je
	}
}
