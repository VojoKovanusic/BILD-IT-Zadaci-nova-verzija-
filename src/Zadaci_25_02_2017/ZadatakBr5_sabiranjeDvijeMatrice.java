package Zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5_sabiranjeDvijeMatrice {

	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			// deklarisemo i instanciramo dva 2d niza, u koji ce mo smjestati
			// vrjednosti za sabiranje
			double matrix1[][] = new double[3][3];
			double matrix2[][] = new double[3][3];

			System.out.println("Enter matrix1:");

			// ubacujemo vrjednosti u prvi 2d niz
			for (int row = 0; row < matrix1.length; row++) {
				for (int column = 0; column < matrix1[row].length; column++) {

					matrix1[row][column] = unos.nextDouble();

				}
				System.out.println();

			}
			System.out.println("Enter matrix2:");
			// ubacujemo vrjednosti u drugi 2d niz
			for (int row = 0; row < matrix2.length; row++) {
				for (int column = 0; column < matrix2[row].length; column++) {

					matrix2[row][column] = unos.nextDouble();

				}
				System.out.println();

			}
			unos.close();
			// instanciramo 2d niz tako sto poozivamo metodu, kojoj
			// prosledjujemo argumente u vidu 2d nizova koje sabiramo
			double sumMatrix[][] = addMatrix(matrix1, matrix2);
			ispisiMatrice(matrix1, matrix2, sumMatrix);

		} catch (InputMismatchException e) {
			System.out.println("Invalid input,this is end of programs.");
		}
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double sum[][] = new double[3][3];
		for (int row = 0; row < sum.length; row++) {
			for (int column = 0; column < sum.length; column++) {

				// sabiramo elemente prosledjenih 2d nizova, ponaosob svaki
				// elemenat koji se nalazi na istom mjestu(redu i koloni) u nizu
				// a i nizu b
				sum[row][column] = a[row][column] + b[row][column];
			}
		}
		// metoda vraca sumu u vidu 2d niza
		return sum;
	}

	// metoda koja prima tri parametra, u vidu 2 d niza i ispisuje ih u trazenom
	// obliku
	public static void ispisiMatrice(double[][] matrix1, double[][] matrix2,
			double[][] matrixSum) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%7.2f", matrix1[i][j]);

				if (i == 1 && j == 2) {
					System.out.printf(" +");
				} else if (j == 2) {
					System.out.printf("  ");
				}
			}

			for (int j = 0; j < 3; j++) {
				System.out.printf("%7.2f", matrix2[i][j]);

				if (i == 1 && j == 2) {
					System.out.print(" =");
				} else if (j == 2) {
					System.out.printf("  ");
				}
			}

			for (int j = 0; j < 3; j++) {
				System.out.printf("%7.2f", matrixSum[i][j]);

			}
			System.out.println();

		}

	}

}
