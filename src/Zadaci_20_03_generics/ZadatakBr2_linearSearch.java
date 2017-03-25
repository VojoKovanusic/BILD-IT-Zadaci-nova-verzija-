package Zadaci_20_03_generics;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2_linearSearch {
	/*
	 * 19.4 (Generic linear search) Implement the following generic method for
	 * linear search. public static<E extendsComparable<E>> intlinearSearch(E[]
	 * list, E key)
	 */

	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			System.out.println("Unesite duzinu liste: ");
			int duzina = unos.nextInt();
			System.out.println("Unesite broj koji vas zanima: ");
			int broj = unos.nextInt();
			Integer niz[] = randomList(duzina);
			System.out.println(Arrays.toString(niz));
			if (linearSearch(niz, broj) == -1) {
				System.out.println("\nBroj " + broj + " se ne nalazi u listi");
			} else
				System.out.println("\nBroj " + broj
						+ " se nalazi na index-u broj: "
						+ linearSearch(niz, broj));
			unos.close();
		} catch (InputMismatchException e) {
			System.out.println("Greska pri unosu.");
		}
	}

	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {

		for (int i = 0; i < list.length; i++)
			if (list[i].equals(key))
				return i;
		return -1;

	}

	public static Integer[] randomList(int duzina) {

		Integer lista[] = new Integer[duzina];
		for (int i = 0; i < duzina; i++) {
			lista[i] = ((int) (Math.random() * duzina));

		}

		return lista;
	}
}
