package zadaci_13_02_2017;

import java.util.Scanner;

public class ZadatakBr5 {
	// 5. Napisati metodu koja broji slova u stringu. Metoda treba koristiti
	// sljedeæi header: public static int countLetters(String s). Napisati
	// program koji pita korisnika da unese neki string te mu vrati koliko taj
	// string ima slova.

	public static void main(String[] args) {
		//deklarisemo, instanciramo objekat klase string , kako bi omogucili....
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite  string, da provjerimo koliko ima slova u njemu:");
		String s1 = unos.nextLine();

		System.out.println("Broj slova u unesenom stringu iznosi:"
				+ countLetters(s1));

	}

	//metoda sa jednim parametrom, koja vraca broj slova unjetog stringa
	public static int countLetters(String s1) {
//uneseni string stavljamo u niz karaktera
		char ch[] = s1.toCharArray();
		int brojacSlova = 0;
//prolatimo kroz niz
		for (int index = 0; index < s1.length(); index++) {
			
			// u koliko je uneseni karakter slovo,brojac inkrementujemo
			if (Character.isLetter(ch[index])) {
				brojacSlova++;
			}
		}
		return brojacSlova;
	}
}
