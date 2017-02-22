package Zadaci22_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr4_zbir_brojeva_metoda {

	public static void main(String[] args) {
		/*
		 * 4. Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju.
		 * Koristite sljedeæi header: public static int sumDigits(long n). Na
		 * primjer, ako pozovemo metodu i proslijedimo joj broj 234
		 * (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
		 */
		try {
			System.out
					.println("Unesite cjeli broj, cije elemente zelite da saberemo:");
			Scanner unos = new Scanner(System.in);

			// pozivamo moetodu i odmah joj iz konzole prosledjujmo argument
			System.out.println("Zbir pojedinacnih cifara unesenog broja je "
					+ sumDigits(unos.nextLong()) + ".");

			unos.close();
		} catch (InputMismatchException e) {
			System.out.println("Greska pri unosu, kraj programa!");
		}
	}

	// prima long broj , a vraca sumu u integer vrjednosti
	public static int sumDigits(long n) {
		// u slucaju da je uneseni broj negativan
		n = Math.abs(n);
		int sum = 0;
		// petlja radi dok uneseseni broj nije 0
		while (n != 0) {
			// uzimamo zadnju cifru
			int cifra = (int) (n % 10);
			// dodajemo je na sumu
			sum += cifra;
			// smanjujemo uneseni broj za zadnju cifru, iduci prema nuli
			n /= 10;
		}
		// vracamo rezultat
		return sum;
	}
}
