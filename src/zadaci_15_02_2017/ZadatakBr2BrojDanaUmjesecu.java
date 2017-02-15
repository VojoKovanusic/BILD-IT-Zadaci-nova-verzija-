package zadaci_15_02_2017;

import java.time.YearMonth;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2BrojDanaUmjesecu {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji pita korisnika da unese mjesec i godinu te
		 * mu ispiše broj dana u datom mjesecu. Na primjer, ukoliko korisnik
		 * unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je
		 * Februar 2012 imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a
		 * kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan.
		 */

		Scanner unos = new Scanner(System.in);
System.out.println("\t\t****PROVJERA BROJA DANA U MJESECU****\n");

		try { // traj kec blok, da uhvatimo nepravilan unos iz konzole
			
			System.out.println("Unesite mejsec, numericki (1-12):");

			int mjesec = unos.nextInt();
			while (mjesec < 1 || mjesec > 12) {
				System.out.println("Greska! Unesite ponovo mjesec(1-12)!");
				mjesec = unos.nextInt();
			}

			System.out.println("Unesite godinu:");
			int godina = unos.nextInt();
			while (godina < 1) {
				System.out.println("Greska! Unesite ponovo godinu, vecu od 0");
				godina = unos.nextInt();
			}

			// pozivanje metode, prosledjivanje argumenata
			ispisiBrojDana(mjesec, godina);
			unos.close();
			// Hvatanje greske
		} catch (InputMismatchException e) {
			System.out
					.println("Greska pri unosu iz konzole. Program prima samo cjelobrojne brojeve!!\n");
			ZadatakBr2BrojDanaUmjesecu.main(args);

		}
	}

	public static void ispisiBrojDana(int mjesec, int godina) {

		// prazan mjesen na indeksu br 0, da bi se poklopili mjeseci
		// numericki...
		String mjeseci[] = { "", "Januar", "Februar", "Mart", "April", "Maj",
				"Jun", "Jul", "Avgust", "Septembar", "Oktobar", "Novembar",
				"Decembar" };
	

		// objkat klase YearMonth
		YearMonth dani = YearMonth.of(godina, mjesec);

		// inicializujemo promjenljivu i dajemo joj vrjednost pozivajuci metodu
		// iz klase YearMonth, da dobijemo br dana u mjesecu
		int brDana = dani.lengthOfMonth();
		
		//uslovi za pravilan ispis
		if (brDana == 31) {
			System.out.println(mjeseci[mjesec] + " " + godina + " je imao "
					+ brDana + " dan. ");
		} else
			System.out.println(mjeseci[mjesec] + " " + godina + " je imao "
					+ brDana + " dana. ");
	}

	}

