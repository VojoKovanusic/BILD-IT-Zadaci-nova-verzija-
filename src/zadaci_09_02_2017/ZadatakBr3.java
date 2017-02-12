package zadaci_09_02_2017;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ZadatakBr3 {
	// 3. Napišite program koji æe brojati broj karaktera, rijeèi i linija
	// teksta u nekom fileu. Rijeèi trebaju biti odvojene jednim spaceom. Ime
	// file proslijediti kao argument u vaš program.
	public static void main(String[] args) {
		// deklarisemo varijablu, dajemo joj vrjednost prvog elemenat iz main
		// metode
		String imeFajla = args[0];

		Path path = Paths.get(args[0]);// deklarisemo objekat Path, tj putanju

		BufferedReader reader;
		try {
			reader = Files.newBufferedReader(path);
			// sadrzaj u
			// fajlu
			String line;
			int brojacRedova = 0;
			int brojacKaraktera = 0;
			int brojacRjeci = 0;

			// prolazimo pomocu petlje kroz sadrzaj fajla, sve dok ne dodjemo do
			// kraja, tj dok ne izcita null
			while ((line = reader.readLine()) != null) {
				// brojimo redove i pri svakom prolasku kroz petlju dodajemo 1
				brojacRedova++;
				// brojimo karaktere, tako sto uzimamo duzinu svake rjeci i
				// sabiramo
				// ih
				brojacKaraktera += line.length();
				// sadrzaj fajla(svaku rjec posebno) ubacijuemo u niz
				String niz[] = line.split(" ");
				// samim tim duzina niza, predstavlja broj rjeci u fajlu
				brojacRjeci += niz.length;

				// ispis sadrzaja fajla , radi kontrole
				System.out.println(line);

			}

			reader.close();
			// ispis rezultata
			System.out.println("Ukupan broj redova u tekstu: " + brojacRedova);
			System.out.println("Ukupan broj rjeci u tekstu: " + brojacRjeci);
			System.out.println("Ukupan broj karaktera u tekstu: "
					+ brojacKaraktera);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("pokrenite ponovo program, niste unjeli validne podatke!");
		}
	}

}
