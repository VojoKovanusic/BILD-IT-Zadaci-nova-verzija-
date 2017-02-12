package zadaci_11_02_2017;

import java.util.Scanner;

public class ZadatakBr2 {
//
	public static void main(String[] arg) {

		// da bi omogucili korisniku unos iz konzole, moramo napraviti objekat
		// Scanner
		Scanner unos = new Scanner(System.in);

		
		//unos iz konzole, nisam bas bio siguran,
		// da li korisnik treba unjeti broj po broj ili devetocifreni odmah, meni je logicnije da ide ovako 
		System.out
				.println("Upisite devetocifreni broj, da ispisemo desetocifreni ISBN-10 broj: ");
		String str = unos.next();

		// prosledjujemo argumenat metodi, koja vrsi validaciju
		while (validacijaUnosa(str) == false) {
			System.out
					.println("Unesite validan ISBN broj, koji se sastoji od 9 pozitivnih cjeliobrojnih cifara!");
			str = unos.next();
		}
		// deklaracija objekata niz,koji prima int vrjednosti,  
		//inicijalizacija  pozivanjem metode kojoj prosledjujem argument
		
		int niz[] = vratiNiz(str);

		// deklarisemo i inic. vrjednost u koju ce mo smjestati rezultate iz zadane
		// formule
		int ISBN = 0;
		// formula
		for (int i = 0; i < 9; i++) {
			ISBN += niz[i] * (i + 1);
		}
		ISBN = ISBN % 11;

		// ako smo dobili 10, znaci da je zadnja cifra x
		if (ISBN == 10) {
			System.out.println("International Standard Book Number: " + str
					+ "X");
		}
		// u suprotnom samo rezultat formule kastujemo u String i pridodamo ga
		// izvornom obliku koisnikovog unosa
		else {
			String ISBN_10broj = str + Integer.toString(ISBN);
			System.out.println("International Standard Book Number: "
					+ ISBN_10broj);
		}
	}

	public static boolean validacijaUnosa(String str) {
		// ako nije tacno devet karaktera greska
		if (str.length() != 9) {
			return false;
		}
		// ako nije neki karakter broj, greska
		for (int i = 0; i < 9; i++) {
			if (!Character.isDigit(str.charAt(i)))
				return false;
		}
		// ako se nije nigdje "upecao" znaci da je validan
		return true;
	}

	// metoda koja prima string i vraca niz brojeva
	public static int[] vratiNiz(String str) {
		int niz[] = new int[9]; // mjesto gdje ce mo smjestiti nas broj
		for (int i = 0; i < 9; i++) { // petlja koja vrto 9 puta, da popunimo
										// cjeli niz

			// iz string u karakter iz karaktera u int
			niz[i] = Character.getNumericValue((str.charAt(i)));
		}
		return niz; // vraca niz
	}
}
