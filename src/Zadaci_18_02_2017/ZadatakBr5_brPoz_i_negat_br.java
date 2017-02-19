package Zadaci_18_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5_brPoz_i_negat_br {
	/*
	 * 5. Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje
	 * koliko je pozitivnih brojeva korisnik unijeo, koliko negativnih te
	 * izraèunava ukupnu sumu i prosjek svih unesenih brojeva. (Korisnik prekida
	 * unos tako što unese nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0
	 * program treba da ispiše da je broj pozitivnih brojeva 3, negativnih
	 * brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
	 */

	public static void main(String[] args) {
		System.out.println("Unesite niz cjelih brojeva, niz prekida nula:");
		Scanner unos = new Scanner(System.in);
		try {
			double suma = 0;
			int brojunosa = 0;
			int brPozitivnih = 0;


			int br = unos.nextInt();
			if (brojunosa == 0 && br == 0) {
				System.out
						.println("Nula prekida unos, stoga ne moze biti prva unesena vrednost");
				ZadatakBr5_brPoz_i_negat_br.main(args);
			}
			do {
				brojunosa++;

				if (br >= 0) {
					brPozitivnih++;
				}

				suma += br;
				br = unos.nextInt();
			} while (br != 0);
			unos.close();
			System.out.println("Suma unesenih brojeva iznosi: " + suma + ""
					+ "\nProsjek: " + (suma / brojunosa)
					+ "\nBroj pozitivnih brojeva koje ste unjeli: "
					+ brPozitivnih
					+ "\nBroj negativnih brojeva koje ste unjeli: "
					+ (brojunosa - brPozitivnih));
		} catch (InputMismatchException e) {
			System.out
					.println("unos nije bio validan,izlogovani ste!");
			
			
		}
	}

}
