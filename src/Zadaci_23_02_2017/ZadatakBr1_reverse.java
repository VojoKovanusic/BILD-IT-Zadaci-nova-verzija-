package Zadaci_23_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

//1. Napisati program koji pita korisnika da unese 
//cijeli trocifreni broj te provjerava da li je unijeti broj palindrom. 
//Broj je palindrom ukoliko se èita isto i sa lijeva na desno i sa desna 
//na lijevo npr. 121, 131, itd.

public class ZadatakBr1_reverse {

	public static void main(String[] args) {
		try {
			System.out
					.println("Unesite cijeli trocifreni broj, da program provjeri da li je uneseni broj palindrom:");
			Scanner unos = new Scanner(System.in);
			int number = unos.nextInt();

			// u slucaju da korisnik unese broj koji nije trocifren, upada u
			// petlju
			while (number < 100 || number > 999) {
				System.out
						.println("Greska pri unosu!\nUnesite ponovo cijeli trocifreni broj:");
				number =  unos.nextInt();
			}
			unos.close();
			// ispis, pozivanje metode i prosledjivanje argumenta
			if (IsPalindrome(number)) {
				System.out.println("Uneseni broj je palindrom!");
			} else
				System.out.println("Uneseni broj nije palindrom!");
		} catch (InputMismatchException e) {
			System.out.println("Ilegalan unos, prekid programa!");
		}
	}

	public static boolean IsPalindrome(int number) {
		String str = number + "";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if (number == Integer.parseInt(reverse)) {
			return true;
		}

		return false;
	}
}
