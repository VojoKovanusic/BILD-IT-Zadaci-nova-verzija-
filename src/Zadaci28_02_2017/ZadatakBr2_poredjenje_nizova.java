package Zadaci28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2_poredjenje_nizova {

	public static void main(String[] args) {
		System.out.println("Unesite 3 * 3 niz integera: ");
		try {
			Scanner unos = new Scanner(System.in);
			// unesene vrjednosti bice smjestene u 2d niz
			int niz1[][] = new int[3][3];

			System.out.println("Upisite listu1 :");
			for (int i = 0; i < niz1.length; i++) {
				for (int j = 0; j < niz1[i].length; j++) {
					niz1[i][j] = unos.nextInt();

				}

			}
			System.out.println("Upisite listu2 :");
			int niz2[][] = new int[3][3];

			for (int i = 0; i < niz2.length; i++) {
				for (int j = 0; j < niz2[i].length; j++) {
					niz2[i][j] = unos.nextInt();

				}
				System.out.println();
			}
			unos.close();
			if (equals(niz1, niz2)) {
				System.out.println("Uneseni nizovi su indenticni.");
			} else
				System.out.println("Nisu isti");

		} catch (InputMismatchException e) {
			System.out.println("Greska pri unosu, kraj programa;");
		}
	}

	// metoda koja povjera svaki elelmenat u m1 sa elementom koji se nalazi na
	// istoj poziciji u m2, cim nadje prvi elelmenat vraca false, u slucaju da
	// ga ne nadje liste su iste
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int row = 0; row < m2.length; row++) {
			for (int column = 0; column < m2[row].length; column++) {
				if (m2[row][column] != m1[row][column])
					return false;

			}
		}
		return true;
	}
}