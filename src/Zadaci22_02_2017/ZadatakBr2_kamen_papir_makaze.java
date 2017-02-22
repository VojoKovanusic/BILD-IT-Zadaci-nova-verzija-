package Zadaci22_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2_kamen_papir_makaze {
	// 2. Napisati program koji igra sa protivnikom rock-paper-scissors.
	// (papir-bunar-makaze ili tako nekako po naški) Program nasumièno generiše
	// brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita
	// korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik
	// pobijedio, da li je raèunar pobijedio ili je bilo neriješeno.
	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);

			// niz gdje su smjestene tri mogucnosti
			String niz[] = { "Kamen", "Papir", "Makaze" };

			// progrm nasumicno bira
			int index = (int) (Math.random() * 3);

			System.out
					.println("Izaberite opciju koju zelite:\n\n0-Kamen (razbija makaze)"
							+ "\n1-Papir (omotava kamen)\n2-Makaze (sjeku papir)");

			// korisnik bira opciju koju zeli uzeti iz niza
			int indexKorisnik = unos.nextInt();

			// ako je izabrao opcuju koje nema u nizu upada u petlju
			while (indexKorisnik < 0 || indexKorisnik > 2) {
				System.out.println("Pokusajte ponovo sa brojem izmedju 0 i 2:");
				indexKorisnik = unos.nextInt();
				unos.close();
			}

			System.out.println("Vi ste izabrali " + niz[indexKorisnik]
					+ ", a kompijuter je izabrao " + niz[index]);

			// u koliko su izabrane iste opcije
			if (niz[index] == niz[indexKorisnik]) {
				System.out.println("Obadvoje ste izabrali "
						+ niz[indexKorisnik] + " , NERJESENO!");

				// opcije u kojima korisik pobjedjuje
			} else if (niz[index] == "Makaze" && niz[indexKorisnik] == "Kamen"
					|| niz[index] == "Papir" && niz[indexKorisnik] == "Makaze"
					|| niz[index] == "Kamen" && niz[indexKorisnik] == "Papir") {
				System.out.println("\nVI STE POBJEDILI!");
			}
			// u svim drugim mogucnostima program pobjedjuje
			else {
				System.out.println("\nIZGUBILI STE!");
			}

		} catch (InputMismatchException e) {// u slucaju hvatanja greske ,
											// obavjestenje i prekid rada
											// progama
			System.out.println("Unos nije validan, kraj programa!");
		}
	}
}
