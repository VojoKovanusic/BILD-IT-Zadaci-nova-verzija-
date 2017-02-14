package zadaci_14_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZAdatakBr3 {
	/*
	 * 3. Napisati metode sa sljedeæim headerima: . Prva metoda prima cijeli
	 * broj kao argument i vraæa isti ispisan naopako. (npr. reverse(456) vraæa
	 * 654.) Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko
	 * nije. Koristite reverse metodu da implementirate isPalindrome metodu.
	 * Napišite program koji pita korisnika da unese broj te mu vrati da li je
	 * broj palindrome ili ne.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner unos=new Scanner(System.in);
			System.out.println("Unesite neki broj da provjerimo da li je palindrome:");
			int broj=unos.nextInt();
			unos.close();
			System.out.println("Da li je "+broj+" palindrome?\nOdgovor : "+isPalindrome(broj)+"!");

		} catch (InputMismatchException e) {
			System.out.println(" Niste unjeli validan br , unesite neki drugi broj:");
			ZAdatakBr3 .main(args);
		}
	}

	// metoda koja prima jedan argument, te ga vraca u reverse(okrenutom)obliku
	public static int reverse(int number) {
		int reverse = 0;

		// vrti dok prosledjeni argument nije 0
		while (number != 0) {
			int cifra = number % 10; // uzimamo zadnju cifru

			reverse *= 10; // svaki reverse(mjesto gdje smjestamo novi
							// broj),mnozimo sa 10
							// kako ne bi kod sabiranja doslo do greske, vec da
							// se sabira sa 0

			reverse += cifra; // dodajemo zadnju cifru an pocetak...

			number /= 10; // zadani broj pri svakoj iteraciji smanjujemo za
							// zadnju cifru
							// koju smo u predhdnim naredbaam vec prebacili u
							// "reverse", kada dodje do 0, prekida petlja
		}
		return reverse;

	}

	// provjeravamo da li je broj palindrom
	public static boolean isPalindrome(int number) {
		// inicializujemo int broj "okreni",dajemo mu vrednost
		// preko metode kojoj prosledjuemo joj atribut
		int okreni = reverse(number);

		if (okreni == number) { // ako jeste
			return true;
		}

		return false; // ako nije
	}

}
