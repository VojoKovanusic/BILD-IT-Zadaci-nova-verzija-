package Zadaci16_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr4maxBrPonavljanje {
	public static void main(String[] args) {

		// Napišite program koji uèitava neodreðen broj cijelih brojeva (unos
		// prekida nula), pronalazi najveæi od unijetih brojeva te ispisuje
		// koliko se najveæi broj puta ponovio. Na primjer, ukoliko unesemo 3 5
		// 2 5 5 5 0 program ispisuje da je najveæi broj 5 te ispisuje da se
		// isti ponavlja 4 puta.

		Scanner unos = new Scanner(System.in);
		try {
			// pravimo listu u kju ce mo smjesatti nase elemente
			ArrayList<Integer> lista = new ArrayList<>();

			int brojac = 0;

			System.out
					.println("Unesite neodreðen broj cijelih brojeva (unos prekida nula),\nprogram pronalazi"
							+ " najveci od unijetih brojeva te ispisuje koliko se najveæi broj puta ponovio:");
			int broj = unos.nextInt();
			// ulazak u petlju
			do {
				brojac++;
				lista.add(broj);
				if (brojac == 1 && broj == 0) {
					System.out
							.println("Nula prekida unos! Vraceni ste na pocetak programa!\n");
					ZadatakBr4maxBrPonavljanje.main(args);
				}
				broj = unos.nextInt();
			} while (broj != 0);// vrti dok korisnik ne unese nulu
			unos.close();
			// za pocetak maxBroj je prvi elelemenat u nizu
			int maxBroj = lista.get(0);

			brojac = 0;
			for (int index = 0; index < lista.size(); index++) {

				// ako naidjemo na veci broj, max Broj postaje on
				if (lista.get(index) > maxBroj) {
					maxBroj = lista.get(index);
					brojac = 0;// resetujemo brojac

				}
				if (lista.get(index) == maxBroj) {
					brojac++; // i onda brojim od pocetka kada se pojavi isti

				}

			}

			System.out.println("Najveci uneseni broj je: " + maxBroj
					+ " i ponovio se :" + brojac + " puta.");
		} catch (InputMismatchException e) {
			// hvatanje greske, ispis poruke i vracanje na pocetak programa
			System.out.println("Pogresan unos, vraceni ste na pocetak\n");
			ZadatakBr4maxBrPonavljanje.main(args);
		}
	}
}
