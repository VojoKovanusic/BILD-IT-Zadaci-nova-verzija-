package Zadaci28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1_sort_2d_niz {

	public static void main(String[] args) {

		try {

			double[][] matrica = new double[3][3];

			Scanner unos = new Scanner(System.in);
			System.out.println("Enter a 3-by-3 matrix row by row: ");

			for (int row = 0; row < matrica.length; row++)
				for (int column = 0; column < matrica[row].length; column++)
					matrica[row][column] = unos.nextDouble();

			double[][] sortiranaMatrica = sortirajRedove(matrica);
			isisiMatricu(sortiranaMatrica);

			unos.close();
		} catch (InputMismatchException e) {// hvatanje greske
			System.out.println("Uos nije bilo validan, program je prkinut.");
		}
	}

	// metoda koja vrsi ispis 2d matrice koju joj prosledimo
	public static void isisiMatricu(double[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%2.3f ", m[i][j]);
			}
			System.out.println("");
		}
	}

	// metoda prima kao argumenat nesortirani 2d niz,a
	// vraca sortirani 2d niz
	public static double[][] sortirajRedove(double[][] m) {

		double[][] sortNiz = new double[m.length][m[0].length];

		for (int row = 0; row < m.length; row++)
			for (int column = 0; column < m[0].length; column++)
				sortNiz[row][column] = m[row][column];

		// ugnjezdena petlja, gdje vrsimo sortiranje po redovima
		for (int i = 0; i < sortNiz.length; i++) {

			for (int j = 0; j < sortNiz[0].length - 1; j++) {

				double currentMin = sortNiz[i][j];
				int minIndex = j;
				for (int column = j + 1; column < sortNiz[0].length; column++) {

					if (currentMin > sortNiz[i][column]) {
						currentMin = sortNiz[i][column];
						minIndex = column;
					}
				}

				if (minIndex != j) {
					sortNiz[i][minIndex] = sortNiz[i][j];
					sortNiz[i][j] = currentMin;
				}
			}
		}

		return sortNiz;
	}

}