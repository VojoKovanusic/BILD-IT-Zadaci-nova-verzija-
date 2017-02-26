package Zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr3_uzastobniBrojeviU_nizu {
	/*
	 * (Pattern recognition: consecutive four equal numbers) Write the following
	 * method that tests whether the array has four consecutive numbers with the
	 * same value. public static boolean isConsecutiveFour(int[] values) Write a
	 * test program that prompts the user to enter a series of integers and
	 * displays if the series contains four consecutive numbers with the same
	 * value. Your program should first prompt the user to enter the input
	 * size—i.e., the number of values in the series. Here are sample runs:
	 */
	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);

			System.out.println("Enter the number of values:");
			// uzimamo od korisnika podatak za duzinu niza
			int duzinaNiza = unos.nextInt();
			while (duzinaNiza < 4) {
				System.out
						.println("To check the series for four consecutive numbers, "
								+ "must be at least four numbers in array,\ntry again:");
				duzinaNiza = unos.nextInt();
			}

			int niz[] = new int[duzinaNiza];
			System.out.println("Enter the values:");
			for (int index = 0; index < duzinaNiza; index++) {
				System.out.print(1 + index + ")");
				// uzimamo vrjednosti elemenata u nizu
				niz[index] = unos.nextInt();
			}
			unos.close();
			// ispitujemo preko metode zeljene podatke
			if (isConsecutiveFour(niz))
				System.out.println("The list has consecutive fours");
			else
				System.out.println("The list nas no consecutive fours");

		} catch (InputMismatchException e) {// hvatanje potencijalne greske
											// prilikom unosa
			System.out.println("unos nije validan, prekid programa!");
		}
	}

	// metoda koja vraca tru ako se u nizu pojave cetiri uzastopno ista broja
	private static boolean isConsecutiveFour(int[] values) {
		// dvije ugnjezde petlje
		for (int i = 0; i < values.length; i++) {
			// svaki put pri novom ulasku u drugu petlju resetujemo brojac, kao
			// bi ga mogli iskoristiti opet
			int brojac = 0;

			for (int j = 0; j < values.length; j++) {
				// ako su znakovi isti brojac inkrementujemo za 1
				if (values[i] == values[j]) {
					brojac++;
					// ako su cetiri uzastopno broja ista upada u ovu selekciju
					// i
					// vraca true
					if (brojac == 4) {
						return true;
					}
				}
				// cim naidje na prekid serije istih brojeve, resetuje brojac na
				// 0 i krece ispocetka
				if (values[i] != values[j]) {
					brojac = 0;

				}
			}
		}

		return false;
	}
}
