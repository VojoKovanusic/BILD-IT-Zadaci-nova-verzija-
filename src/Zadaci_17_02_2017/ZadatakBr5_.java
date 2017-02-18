package Zadaci_17_02_2017;

import java.util.Scanner;

public class ZadatakBr5_ {
	/*
	 * 5. Napisati program koji pita korisnika da unese dva stringa te
	 * provjerava i ispisuje da li je drugi string substring prvog stringa. Na
	 * primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao drugi
	 * string program mu ispisuje da je BC substring ABCD stringa.
	 */public static void main(String[] args) {
//korisnik upisuje  dva stringa u konzoli
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite prvi string:");
		String s1 = unos.nextLine();

		System.out.println("Unesite drugi string:");
		String s2 = unos.nextLine();
		unos.close();
		//provjeravamo da li je sadrzan
		if (s1.contains(s2)) {
			System.out.println("String \"" + s2 + "\" je substring stringa \""
					+ s1 + "\".");
		} else
			System.out.println("String \"" + s2
					+ "\" nije substring \"" + s1 + "\" stringa.");
	}

}
