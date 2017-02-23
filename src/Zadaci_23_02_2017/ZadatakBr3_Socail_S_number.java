package Zadaci_23_02_2017;

import java.util.Scanner;

public class ZadatakBr3_Socail_S_number {
	/*
	 * 3. Napisati program koji pita korisnika da unese Social Security Number
	 * (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da
	 * provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije,
	 * program pita korisnika da pokuša ponovo. Ukoliko jeste unešen u pravom
	 * formatu, program završava sa radom.
	 */
	public static void main(String[] args) {

		System.out
				.println("Unesite Social Security Number(SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj:");
		Scanner unos = new Scanner(System.in);
		String ssn = unos.nextLine();
		// u koliko nije unjet validan ssn br, upada u petlju
		while (!validacija(ssn)) {
			System.out
					.println("Niste unjeli validan Social Security Number(SSN)\n"
							+ "Unesite ga u formatu DDD-DD-DDDD gdje D predstavlja broj:");
			ssn = unos.nextLine();
		}
		// kada validacija uspije, ispisuje
		System.out.println("Vas unos je validan!");

		unos.close();
	}

	// objedinjenje validacije
	public static boolean validacija(String str) {

		if (brojevi(str) && crtice(str))
			return true;

		return false;
	}

	// u koliko crtice nisu na svojim mjestima metoda vraca gresku
	private static boolean crtice(String str) {

		if ((str.charAt(3) == '-') && (str.charAt(6) == '-')) {
			return true;
		}

		return false;
	}

	private static boolean brojevi(String str) {
		// izbacujemo sve crtice
		str = str.replace("-", "");
		// ako nema 9 karaktera, izbacuje kgresku
		if (str.length() != 9) {
			return false;
		}
		// ako neki od preostalih karaktera nije broj, izbacuje gresku
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
