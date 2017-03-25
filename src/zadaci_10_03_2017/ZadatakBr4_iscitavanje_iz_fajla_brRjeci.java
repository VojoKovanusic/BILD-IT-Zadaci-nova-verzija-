package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ZadatakBr4_iscitavanje_iz_fajla_brRjeci {
	static Scanner unos = new Scanner(System.in);
	static int brojRjeci;
	static int brojKaraktera;
	static int brojLinija = 0;

	public static void main(String[] args) {
		System.out
				.println("Unesite fajl za koji zelite da ispisemo broj linija, slova i karaktera u njemu:");
		String file = unos.nextLine();
		ispsiKarakteristikeFajla(file);
	}

	private static void ispsiKarakteristikeFajla(String imeFajla) {
		Path path = Paths.get(imeFajla);
		
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line;
			while ((line = reader.readLine()) != null) {
				brojLinija++;

				String[] niz = line.split(" ");
				for (int i = 0; i < niz.length; i++) {
					char c[] = niz[i].toCharArray();
					brojKaraktera += c.length;
				}

				brojRjeci += niz.length;

			}
			if (brojKaraktera == 0) {
				System.out.println("Fajl je prazan");
			} else {
				System.out.println("U fajlu :" + imeFajla
						+ "\nBroj karaktera je:" + brojKaraktera
						+ "\nBroj rjeci je:" + brojRjeci + "\nBrojLinija je:"
						+ brojLinija);
			}

		} catch (IOException e) {

			System.out.println("Program nije pronasa uneseni fajl");
		}
	}
}
