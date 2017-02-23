package Zadaci_23_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5_piramida {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji pita korisnika da unese cijeli broj te
		 * ispisuje piramidu svih brojeva do tog broja. (Na primjer, ukoliko
		 * korisnik unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2
		 * 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
		 */
		try{
		System.out
				.println("Unese cijeli broj da program ispise piramidu svih brojeva do tog broja:");
		Scanner unos = new Scanner(System.in);
		int brojRedova = unos.nextInt();
		//u slucaju da je trazeni br redova manja od 2 upada u while petlju
		while (brojRedova < 2) {
			System.out
					.println("Da bi ispisali piramidu, morate unjeti broj veci od 1!"
							+ "\nPokusajte ponovo:");
			brojRedova = unos.nextInt();
		}
		
		// za redove
		for (int x = 1; x <= brojRedova; x++) { 

			// za razmake
			for (int r = x; r <= brojRedova; r++) {
				System.out.printf("%4s", " ");
			}
			// za kolone
			for (int y = 1; y <= 2; y++) {

				if (y == 1) { // ako je "j" jednako 1,onda ispisujemo brojeve u
								// opadajucem redosjledu

					for (int k = x; k >= y; k--) {
						System.out.printf("%4d", k);
					}
				} 
				else { // u suprotnom ispisujemo brojeve u rastucem redosledu
					for (int z = y; z <= x; z++)
						System.out.printf("%4d", z);
				}
			}
			System.out.println();

		}
		unos.close();
	}catch(InputMismatchException e ){
		System.out.println("Unos nije validan, kraj programa!");
	}}
}