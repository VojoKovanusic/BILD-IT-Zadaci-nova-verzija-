package zadaci_13_03_2017;

import java.io.File;
import java.util.Scanner;

public class ZadatakBr3_Popularna_imena {
	/*
	 * (Baby name popularity ranking) The popularity ranking of baby names from
	 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynamesand
	 * stored in files named babynameranking2001.txt, babynameranking2002.txt, .
	 * . . , babynameranking2010.txt. Each file contains one thousand lines.
	 * Each line contains a ranking, a boy’s name, number for the boy’s name, a
	 * girl’s name, and number for the girl’s name. For example, the first two
	 * lines in the file babynameranking2010.txtare as follows: So, the boy’s
	 * name Jacob and girl’s name Isabella are ranked #1 and the boy’s name
	 * Ethan and girl’s name Sophia are ranked #2. 21,875 boys are named Jacob
	 * and 22,731 girls are named Isabella. Write a program that prompts the
	 * user to enter the year, gender, and followed by a name, and displays the
	 * ranking of the name for the year. Here is a sample run:
	 */
	public static void main(String[] args) {
		// pozivamo metodu koja nam ispisuj ima, redni broj...
		ispisiIme();
	}

	public static void ispisiIme() {
		try {
			Scanner unos = new Scanner(System.in);
			System.out
					.println("Unesite godinu za koju zelite da vam provjerimo ime u razdoblju od 2001 do 2010:");
			int godina = unos.nextInt();
			while (godina > 2010 || godina < 2001) {
				System.out
						.println("Unesite godinu za koju zelite da vam provjerimo ime u razdoblju od 2001 do 2010:");
				godina = unos.nextInt();
			}

			System.out.println("Unesite godinu:");
			String izbor = "babynamesranking" + godina + ".txt";

			System.out
					.println("Unesite ime za koje zelite da izvrsimo provjeru:");

			String ime = unos.next();

			System.out
					.println("Unesite pol koji zelite provjeriti za muskarce M, a za zene W:");
			String pol = unos.next();

			while ((pol.equals("m")) || (pol.equals("w"))) {
				System.out
						.println("Ponovo unesite pol koji zelite provjeriti, za muskarce M, a za zene W: ");
				pol = unos.next();
			}
			File file = new File(izbor);
			// ako fajl postoji:
			if (file.exists()) {
				Scanner skener = new Scanner(file);
				// sa uslovom pratimo da li ime postoji u fajlu
				boolean uslov = false;
				// iscitavanje dok ne dodje do kraja
				while (skener.hasNext()) {
					// sadrzaj svakog izcitanog reda dobija varijabla "red"
					String red = skener.nextLine();

					// svaki red stavljamo u niz
					String niz[] = red.split(" ");

					// u nizu na indexu 1 je musko ime ...ako se poklapa sa
					// trzenim vrsimo ispis, stim da uslov u tom slucaju mjenja
					// vrjednost u true
					if (ime.equals(niz[1]) && pol.equalsIgnoreCase("m")) {
						System.out.println("Musko ime " + niz[1]
								+ " je na mjestu broj " + niz[0] + " sa "
								+ niz[2] + " imena u " + godina);
						uslov = true;
						// u nizu na indexu 3 je zensko ime ...ako se poklapa sa
						// trzenim vrsimo ispis,stim da uslov u tom slucaju
						// mjenja vrjednost u true
					} else if (ime.equals(niz[3]) && pol.equalsIgnoreCase("w")) {
						System.out.println("Zensko Ime " + niz[3]
								+ " je na mjestu broj " + niz[0] + " sa "
								+ niz[2] + " imena u " + godina + " godini.");
						uslov = true;
					}

				}
				// ako nije niti jedan od uslova ispunjen, znaci da nema imena u
				// tekst fajlu
				if (!uslov)
					System.out.println("Nema unesenog imena na spisku!");

				skener.close();
			} else
				System.out.println("Nema unesenog fajla");
			unos.close();
		} catch (Exception e) {// hvatanje gresaka svih vrsta :)
			e.getMessage();
			System.out.println("Prekid programa, niste unjeli validne podatke");
		}
	}
}
