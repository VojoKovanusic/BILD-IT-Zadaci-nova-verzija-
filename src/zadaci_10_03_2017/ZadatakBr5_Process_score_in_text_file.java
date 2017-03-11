package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ZadatakBr5_Process_score_in_text_file {

	static Scanner unos = new Scanner(System.in);

	static int suma = 0;

	public static void main(String[] args) {
		ispisiSumu();
	}

	private static void ispisiSumu() {
		System.out
				.println("Unesite fajl za koji zelite da ispisemo broj linija, slova i karaktera u njemu:");
		String file = unos.nextLine();
		Path path = Paths.get(file);
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line;
			while ((line = reader.readLine()) != null) {
				// line.replaceAll("[!-0-9]", " ");

				String[] niz = line.split(" ");
				for (int i = 0; i < niz.length; i++) {
					//ako je broj
					if (isNumber(niz[i])) {
						Integer x = Integer.parseInt(niz[i]);
						System.out.println(x);
						suma += x;

					}

				}
			}
		} catch (IOException e) {

			System.out.println("Program nije pronasa uneseni fajl");
		}
	}
//provjeravam da li je unjeti string broj
	public static boolean isNumber(String s) {
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (!Character.isDigit(c[i])) {
				return false;
			}
		}
		return true;
	}
}
