package Zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr1_11_9LargestRowAndColum {
	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			System.out
					.println("Unesite dimenziju matrice, u granicama od 2 do 15");
			int size = unos.nextInt();
			while (size < 2 || size > 15) {
				System.out
						.println("Unesite dimenziju matrice, u granicama od 2 do 15");
				size = unos.nextInt();
			}
			// instanciramo 2d niz tako sto pozivamo metodu koja ima retur 2d
			// niz
			int niz[][] = napraviMatrix(size);
			ispisiMatrix(niz);
			// list u koje ce mo smjestiti trazene podatke
			ArrayList<Integer> row = new ArrayList<>();
			ArrayList<Integer> column = new ArrayList<>();

			getMaxRow(niz, row);
			getMaxColumn(niz, column);
			if (row.size() == 1)
				System.out.println("Red sa max brojem keceva je :" + row);
			else
				System.out.println("Redovi sa max brojem keceva su :" + row);
			if (column.size() == 1)
				System.out.println("Kolona sa max brojem keceva je:" + column);
			else
				System.out.println("Kolone sa max brojem keceva su:" + column);
			unos.close();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

	// met. vraca 2d niz sa nasumicno upisanim 0 ili 1
	public static int[][] napraviMatrix(int size) {
		int niz[][] = new int[size][size];

		for (int row = 0; row < niz.length; row++) {
			for (int column = 0; column < niz.length; column++) {
				niz[row][column] = (int) (Math.random() * 2);

			}
		}
		return niz;
	}

	// ispisuje prosledjeni niz
	public static void ispisiMatrix(int niz[][]) {

		for (int row = 0; row < niz.length; row++) {
			for (int column = 0; column < niz.length; column++) {

				System.out.print(niz[row][column] + " ");
			}
			System.out.println();
		}
	}

	// vraca redove u kojima se najvise puta pojavljuje kec
	public static void getMaxRow(int[][] matrica, ArrayList<Integer> row) {

		int max = 0;
		for (int i = 0; i < matrica.length; i++) {
			int brojacKeceva = 0;
			for (int j = 0; j < matrica[i].length; j++) {

				if (matrica[i][j] == 1) {
					brojacKeceva++;
				}
			}
			if (max < brojacKeceva) {
				max = brojacKeceva;
				row.clear();
				row.add(i);
			} else if (max == brojacKeceva) {
				row.add(i);
			}
		}

	}

	// vraca kolone u kojima se najvise puta pojavljuje kec
	public static void getMaxColumn(int[][] matrica, ArrayList<Integer> column) {

		int highest = 0;
		for (int j = 0; j < matrica[0].length; j++) {
			int occurrence = 0;
			for (int i = 0; i < matrica.length; i++) {

				if (matrica[i][j] == 1) {
					occurrence++;
				}
			}
			if (highest < occurrence) {
				highest = occurrence;
				column.clear();
				column.add(j);
			} else if (highest == occurrence) {
				column.add(j);
			}
		}
	}
}
