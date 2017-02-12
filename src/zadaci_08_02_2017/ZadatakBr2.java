package zadaci_08_02_2017;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

public class ZadatakBr2 {
	/*
	 * 2. Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela
	 * pretpostavka, znam) Napisati program koji pita korisnika da unese string
	 * te mu ispište broj samoglasnika i suglasnika u datom stringu.
	 * 
	 */public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out
				.println("Unesite string, za koji zelite provjeriti broj samoglasnika i suglasnika:");
		String str = unos.nextLine();
		String strVelikaSlova = str.toUpperCase(); // uneseni string
													// konvertovati u velika
													// slova
		unos.close();
		int brojacSamolasnika = 0, brojacSuglasnika = 0; // brojaci

		for (int i = 0; i < strVelikaSlova.length(); i++) { // petljom proci
															// kroz uneseni
															// string
			char ch = strVelikaSlova.charAt(i); // dajemo vrednst karakteru ch,
												// posebno svakog karakter u
												// stringu
			if (Character.isLetter(ch)) { // ako karakter ch je slovo ide na
											// brojanje
				if (ch == ('A') | ch == ('E') | ch == 'I' | ch == 'O'
						| ch == 'U') { // ako je samoglasnik brojac povecava
										// vrednost za jedan
					brojacSamolasnika++;
				} else
					brojacSuglasnika++; // u suprotnom suglasnik poveceva
										// vrjednost za jedan
			}
		}

		// ispis
		System.out.println("U unesenom stringu \"" + str + "\" ima:\n"
				+ brojacSamolasnika + " samoglasnika \n" + brojacSuglasnika
				+ " suglasnika");
	}
}
