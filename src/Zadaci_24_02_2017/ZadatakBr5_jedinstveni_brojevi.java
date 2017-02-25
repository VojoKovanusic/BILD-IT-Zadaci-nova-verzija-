package Zadaci_24_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5_jedinstveni_brojevi {
	/*
	 * 5. Napisati program koji uèitava 10 brojeva te ispisuje koilko je
	 * jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su unijeti,
	 * razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje više puta,
	 * broj treba ispisati samo jednom.
	 */

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out
				.println("Unesite deset brojeva, da ispisemo jedinstvne brojeve:");
		ArrayList<Integer> lista = new ArrayList<>();
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + ")");
				int broj = unos.nextInt();
				// u koliko lista ne sadrzi uneseni broj, dodajemo ga u listu
				if (!lista.contains(broj)) {
					lista.add(broj);
				}

			}
			unos.close();
			System.out.println("Ima "+lista.size()+" jedinstvenih brojeva, a oni su: ");
			for (Integer broj : lista) {
				System.out.print(broj + " ");
			}
		} catch (InputMismatchException e) {//hvatanje greske prilikom unosa
			System.out.println("Nepravilan unos. Kraj programa.");
		}

	}

}
