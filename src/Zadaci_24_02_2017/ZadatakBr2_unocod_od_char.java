package Zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2_unocod_od_char {
	/*
	 * 2. Napisati program koji prima karakter te vraæa njegov Unicode. Primjer:
	 * ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj
	 * karakter.
	 */
	public static void main(String[] args) {
		try {
			System.out
					.println("Program koji prima karakter te vraæa njegov Unicode.\n"
							+ "Unesite karakter:");
			Scanner unos = new Scanner(System.in);
			// u koliko korisnik unese vrjedost koja nije u zadatim granicama ,
			// upada u petlju

			String karakter = unos.next();
			while (karakter.length() != 1) {
				System.out.println("Ovaj put unesite karakter, a ne string:");
				karakter = unos.next();
			}
			unos.close();

			int code = karakter.charAt(0);
			System.out.println("Za karakter: " + karakter + " , uncode je: "
					+ code + "");
		} catch (InputMismatchException e) {// hvatanje unosa koji nije validan
			System.out
					.println("Unos nije bio validan, upravo je doslo do prekida programa!");
		}
	}

}
