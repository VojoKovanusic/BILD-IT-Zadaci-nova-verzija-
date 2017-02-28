package Zadaci_27_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2 {

	public static void main(String[] args) {
		try {// pocetak bloka koji hvata gresku prilikom unosa
			Scanner unos = new Scanner(System.in);

			// instanciramo 2d niz velicine 3x3 u koji ce korisnik smjestati
			// zeljene podatke
			double niz1[][] = new double[3][3];
			System.out.println("Unesite matricu 3x3, br 1:");
			for (int i = 0; i < niz1.length; i++) {
				for (int j = 0; j < niz1[i].length; j++) {
					niz1[i][j] = unos.nextDouble();

				}

			}
			System.out.println("Unesite matricu 3x3, br 2:");
			double niz2[][] = new double[3][3];

			for (int i = 0; i < niz2.length; i++) {
				for (int j = 0; j < niz2[i].length; j++) {
					niz2[i][j] = unos.nextDouble();

				}
				System.out.println();
			}
			unos.close();
			/*
			 * instanciramo 2d niz tako sto pozivamo metodu, prosledjujemo joj
			 * dva argumenta, koja nam vraca pomnozena(po datoj formuli) ta dva
			 * argumenta( 2d niza)
			 */
			double[][] matrix = multiplyMatrix(niz1, niz2);

			System.out.println("Rezultat:");
			// pozivamo metodu i prosledjujemo joj argumenta koje ona ispisuje
			ispisiMatrice(niz1, niz2, matrix);

		} catch (InputMismatchException e) {
			System.out.println("Greska pri unosu, kraj programa;");
		}
	}

	// metoda koja prima kao argumente 2d matrice, te ih racuna po formuli:
	// cij = ai1 * b1j + ai2 * b2j + ai3 * b3j
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		double[][] multipliedMatrix = new double[a.length][a[0].length];

		for (int i = 0; i < multipliedMatrix.length; i++) {
			for (int j = 0; j < multipliedMatrix.length; j++) {
				for (int k = 0; k < multipliedMatrix[0].length; k++) {
					multipliedMatrix[i][j] += a[i][k] * b[k][j];

				}

			}
		}

		return multipliedMatrix;
	}

	// metoda koja prima tri 2d niza, te ih ispisuje u trazenom obliku
	public static void ispisiMatrice(double[][] matrica1, double[][] matrica2,
			double[][] pomnozenaMatrica) {

		for (int i = 0; i < matrica1.length; i++) {
			for (int j = 0; j < matrica1[i].length; j++) {
				System.out.printf("%5.1f", matrica1[i][j]);

				if (i == 1 && j == 2) {
					System.out.printf("  *");
				} else if (j == 2) {
					System.out.printf("   ");
				}
			}

			for (int j = 0; j < matrica2[i].length; j++) {
				System.out.printf("%5.1f", matrica2[i][j]);

				if (i == 1 && j == 2) {
					System.out.print("  =");
				} else if (j == 2) {
					System.out.printf("   ");
				}
			}

			for (int j = 0; j < pomnozenaMatrica[i].length; j++) {
				System.out.printf("%5.1f", pomnozenaMatrica[i][j]);

			}
			System.out.println();

		}

	}

}
