package Zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr4_sabiranje_kolona {

	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			// odredjujemo da ce 2d niz imati 3 reda i 4 kolone
			double doubleArray[][] = new double[3][4];

			System.out.println("Enter a 3-by-4 matrix row by row:");
			// sa dvije ugnjezdene petlje dajmo vrjednos koje zelimo svakom
			// elementu niza
			for (int row = 0; row < doubleArray.length; row++) {
				for (int column = 0; column < doubleArray[row].length; column++) {

					doubleArray[row][column] = unos.nextDouble();

				}

			}
			unos.close();
			// pozivamo metodu i ispisujemo za svaki index po na osob
			for (int index = 0; index < 4; index++) {
				System.out.println("sum of the elements at column " + index
						+ " is " + sumColumn(doubleArray, index));
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input,this is end of programs.");
		}
	}

	// metoda koja prima dva argumenta, 2d niz sa kojim operisemo i broj indexa
	// kolone koju sabiramo
	public static double sumColumn(double[][] m, int columnIndex) {
		// 1dniz u koji ce mo smejstati sume po kolionama
		double sum[] = new double[4];
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				// sabiramo sve elemente u datoj koloni
				sum[column] += m[row][column];
			}
		}
		// vracamo vrjednost sume, na idexu kojeg prosledimo kao argument metodi
		return sum[columnIndex];
	}

}
