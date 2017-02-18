package Zadaci_17_02_2017;

import java.util.Scanner;

public class ZadatakBr4 {
	/*
	 * 4. Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u
	 * stringu. Metoda treba da koristi sljedeæi header: public static int
	 * count(String str, char a). Na primjer, ukoliko pozovemo metodu na
	 * sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2. Napisati
	 * program koji pita korisnika da unese string i koji karakter želi da
	 * prebroji u datom stringu te mu ispiše koliko se puta odreðeni karakter
	 * ponovio u zadatom stringu.
	 */public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string:");
		String str = unos.nextLine();

		System.out.println("Unesite jedan karakter:");
		String cha = unos.next();

		// ako je duzina unesenog stringa veca od jednog karaktera, upada u
		// petlju i vrti dok ne bude tacno jedan karakter
		while (cha.length() != 1) {
			System.out
					.println("Unesite jedan karakter, a ne string!\nPokusajte ponovo:");
			cha = unos.next();
		}
		unos.close();

		// ako je povratna informacija 0, ispisuje da se ne pjavljuje
		if (count(str, cha.charAt(0)) == 0) {
			System.out.println("U unesenom stringu \"" + str + "\" karakter \""
					+ cha.charAt(0) + "\" se ne pojavljuje!");
		} else
			System.out.println("U unesenom stringu \"" + str + "\" karakter \""
					+ cha.charAt(0) + "\" se pojavljuje "
					+ count(str, cha.charAt(0)) + " puta.");
	}

	// metoda koja broji broj karaktera koji se pojavio u stringu
	public static int count(String str, char a) {
		int brojac = 0;
		for (int i = 0; i < str.length(); i++) {

			if (a == str.charAt(i))
				brojac++;
		}
		return brojac;
	}
}
