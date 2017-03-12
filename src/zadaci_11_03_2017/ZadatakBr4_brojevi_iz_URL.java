package zadaci_11_03_2017;

import java.net.URL;
import java.util.Scanner;

public class ZadatakBr4_brojevi_iz_URL {
	public static void main(String[] args) {
		ispisiProsjek();

	}

	private static void ispisiProsjek() {
		String lokacija = "http://cs.armstrong.edu/liang/data/Scores.txt";
		int suma = 0, brojac = 0;

		try {
			URL url = new URL(lokacija);
			Scanner ispisUrl = new Scanner(url.openStream());

			while (ispisUrl.hasNextLine()) {

				int line = ispisUrl.nextInt();
				suma += line;
				brojac++;
			}
			ispisUrl.close();
			System.out.println("Suma brojeva u tekstualnom fajlu je "+ suma+"\n"
					+ "Prosjek je "+(suma/brojac));

		}

		catch (Exception e) {

			e.getMessage();
		}

	}

}
