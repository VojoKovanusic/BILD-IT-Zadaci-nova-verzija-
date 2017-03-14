package zadaci_13_03_2017;

import java.io.File;
import java.util.Scanner;

public class Zdatak2_ccurrences_each_letter {

	public static void main(String[] args) {

		izbrojiSlova();
	}

	private static void izbrojiSlova() {
		try {
			System.out
					.println("Unesite fajl kojem zelite provjeriti broj slova, nevezano za njihovu velicinu:");
			Scanner input = new Scanner(System.in);
			// ime izvornog fajla
			String imeFajla = input.next();

			File file = new File(imeFajla);
			// u slucaju da faj ne postoji
			if (!file.exists()) {
				System.out.println("Fajl " + imeFajla
						+ "fajl uopste ne postoji");
			} else {
				// u suprotnom fajl ubacujemo kao ulazni podatak skeneru
				input = new Scanner(file);
				
				// varijabla u koju ce mo spremati sav tekst
				String savText = "";

				// prolazimo kroz cjeli fajl,pri svakoj iteraciji ispsiuje jednu
				// liniju teksta i nju
				// dodajemo u varijablu savText
				while (input.hasNext()) {
					// pri svakoj iteraciji prelazi u novi red
					savText += input.nextLine();

				}
				// snimljeni tekst prevodimo u velika slova
				savText = savText.toUpperCase();
				// stavljamo ga u niz karaktera
				char ch[] = savText.toCharArray();
				// pozivamo metodu, prosledjujemo joj niz kar.
				ispisiBrSlova(ch);
			}
			input.close();
		} catch (Exception e) {
			e.getMessage();
		}

	}

	// ispisuje broj slova
	private static void ispisiBrSlova(char[] ch) {
		int niz[] = new int[157];

		for (int i = 0; i < ch.length; i++) {
			// index u niz kojem inkrementujemo za jedan dobijamo kada karakter
			// kastujemo u integer
			int index = (int) ch[i];
			niz[index] += 1;
		}

		for (int i = 65; i < 90; i++) {
			// ispisujemo samo ona slova koja su se pojavila u zadatom nizu
			// barem jednom
			if (niz[i] > 0) {
				char c = (char) i;
				System.out.println("slovo \"" + c + "\" se pojavilo " + niz[i]
						+ " puta u fajlu ");

			}
		}

	}

}
