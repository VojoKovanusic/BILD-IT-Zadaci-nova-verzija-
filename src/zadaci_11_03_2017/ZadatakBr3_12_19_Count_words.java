package zadaci_11_03_2017;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/*
 * (Count words) Write a program that counts the number of words in
 * President Abraham Lincoln’s Gettysburg ad
 * dress from
 * http://cs.armstrong.edu/liang/data/ Lincoln.txt.
 */
public class ZadatakBr3_12_19_Count_words {

	public static void main(String[] args) throws IOException {

		ispisiBrojRjeci();
	}

	private static void ispisiBrojRjeci() throws IOException {

		System.out
				.println("Unesite URL za koji zelite da ispisemo broj slova u njemu:");
		Scanner unos = new Scanner(System.in);

		String urlString = unos.nextLine(); // "http://cs.armstrong.edu/liang/data/Lincoln.txt";
		int brojacRjeci = 0;
		unos.close();
		try {
			URL url = new URL(urlString);

			// izcitavanje podataka iz url linka
			Scanner citacIzURL = new Scanner(url.openStream());

			// izcitavanje dok ne dodje do kraja
			while (citacIzURL.hasNextLine()) {
				String line = citacIzURL.nextLine();

				// ubacivanje rjeci u niz
				String[] nizRjeci = line.split(" ");

				// broj rjeci u svakom redu se sabira
				brojacRjeci += nizRjeci.length;
			}

			citacIzURL.close();

			// Ispis
			System.out.println("Broj rjeci iznosi: " + brojacRjeci);
		} catch (Exception ex) {
			System.out.println("URL nije validan.");
		}

	}

}