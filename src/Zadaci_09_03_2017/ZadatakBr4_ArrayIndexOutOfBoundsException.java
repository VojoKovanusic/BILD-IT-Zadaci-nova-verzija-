package Zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr4_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		System.out.println("\t\t****Nasumicno generisanje 100 brojeva****\n");
		// instanciramo jedan niz u koji ce mo smjestati elemente
		int niz[] = new int[100];
		Scanner unos = new Scanner(System.in);
		System.out
				.println("Da bih ispisali neki od njih, unesite index(poziciju) u granicama izmedju 0 i 99(ukljucujuci njih):");

		try {// pocetak bloka za hvatanje greske
			int pozicija = unos.nextInt();
			unos.close();
			for (int index = 0; index < niz.length; index++) {
				niz[index] = (int) (Math.random() * 100);
			}
			// ispis nasumicno izabranog broja u slucaju da ne dodje do greske
			System.out.print(niz[pozicija]
					+ " je nasumicno izabrani broj, na indexu " + pozicija);

			/*
			 * imamo dva catch bloka, prvi hvata nepravilan unos iz konzole
			 * "(InputMismatchException ex)",
			 */
		} catch (InputMismatchException ex) {
			System.out
					.println("Unos iz konzole nije validan, unos mora biti integer !");

			// drugim blokom hvatamo gresku u slucaju da korisnik unese index
			// van granica niza
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Pogresan unos iz konzole broja!");
			System.out.println("index " + e.getMessage()
					+ " je van granica niza koji ima 100 elemenata.");
		}
		// ispis u slucau da ne dodje do greske
	}

}