package zadaci_08_02_2017;

import java.util.Scanner;

public class ZadatakBr3 {
	/*
	 * 3. Napisati metodu koja prima dva cijela broja kao argumente te vraæa
	 * najveæi zajednièki djelilac za ta dva broja.
	 * 
	 * PRIMJER:
	 * 
	 * Unesite prvi broj: 125 Unesite drugi broj: 2525 Najveæi zajednièki
	 * djelilac za brojeve 125 i 2525 je 25.
	 */
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out
				.println("Unesite dva cjela broja, kako bih našli najveæi zajednièki djelilac.");

		// korisnik unosi vrednosti
		System.out.print("Unesite prvi broj:");
		int prviBroj = unos.nextInt();
		System.out.print("Unesite drugi broj:");
		int drugiBroj = unos.nextInt();
		unos.close();

		// poziv metode i ispis rezultata
		System.out
				.println("Najveci zajednièki djelilac za brojeve " + prviBroj
						+ " i " + drugiBroj + " je : "
						+ max(prviBroj, drugiBroj) + ".");

	}

	public static int max(int prviBroj, int drugiBroj) {
		int maxZajednickiDjelilac = 1;

		// promjena vrjednosti parametara, u koliko je prvi veci
		if (prviBroj > drugiBroj) {
			int temp = prviBroj;
			prviBroj = drugiBroj;
			drugiBroj = temp;
		}
		// prolaz kroz petlju, pocevsi od veceg broja ka manjem
		for (int i = drugiBroj; i > 0; i--) {
			if (prviBroj % i == 0 && drugiBroj % i == 0) {
				maxZajednickiDjelilac = i; // prvi broj koji je djeljiv sa oba
											// unesena broja
				break; // cim nadje prvi, izlazak iz petlje
			}

		}
		return maxZajednickiDjelilac; // vraca vrjednost
	}
}
