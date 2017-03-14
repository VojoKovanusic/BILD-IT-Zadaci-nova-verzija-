package zadaci_13_03_2017;

import java.net.URL;
import java.util.Scanner;

public class ZadatakBr1_Proces_large_dataset {
	/*
	 * (Process large dataset) A university posts its employees’ salaries at
	 * http:// cs.armstrong.edu/liang/data/Salary.txt. Each line in the file
	 * consists of a faculty member’s first name, last name, rank, and salary
	 * (see Programming Exercise 12.24). Write a program to display the total
	 * salary for assistant professors, associate professors, full professors,
	 * and all faculty, respectively, and display the average salary for
	 * assistant professors, associate professors, full professors, and all
	 * faculty, respectively.
	 */
	public static void main(String[] args) {
		String lokacija = "http://cs.armstrong.edu/liang/data/Salary.txt";

		double full = 0, assistant = 0, associate = 0;
		int brojacFull = 0, brojacAssistant = 0, brojacAssociate = 0;

		try {
			URL url = new URL(lokacija);

			Scanner unos = new Scanner(url.openStream());

			// petlja radi dok ne unese sve linije iz fajla
			while (unos.hasNextLine()) {
				// varijabli line daje mo vrjednost scjelog stringa u liniji
				String line = unos.nextLine();
				// niz u koji smjestamo varijablu linija, stim da svaka rjec
				// predstavlja poseban elelmenat niza
				String niz[] = line.split(" ");

				// na indexu 2 nalaze se zvanja gdje i vrsimo selekciju
				// pri svakoj iteraciji "upadamo"u jednu od selekcija i
				// pridodajemo vrjednost odgovarajucoj sumi
				if (niz[2].equals("associate")) {
					// prdodajemo sumi , vrjednost indexa na trecem mjestu ,
					// stim da ga kastujemo u double
					associate += Double.parseDouble(niz[3]);
					brojacAssociate++;

				}
				if (niz[2].equals("full")) {
					full += Double.parseDouble(niz[3]);
					brojacFull++;

				}
				if (niz[2].equals("assistant")) {
					assistant += Double.parseDouble(niz[3]);
					brojacAssistant++;
				}

			}
			unos.close();
			System.out.println("Ukupne plate za redovne profesore: " + full
					+ "\nUkupne plate  za asistente: " + assistant
					+ "\nUkupne plate za pomocnike: " + associate
					+ "\n\nProsjek za redovnog profesora="
					+ (full / brojacFull) + "\nProsjek za asistenta="
					+ (assistant / brojacAssistant) + "\nProsjek za pomoænika="
					+ (associate / brojacAssociate));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}
