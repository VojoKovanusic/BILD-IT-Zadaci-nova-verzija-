package Zadaci_02_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr3_test_Quadratic {

	public static void main(String[] args) {
		/*
		 * Enter a, b, c: 1.0 3 1 The equation has two roots -0.381966 and
		 * -2.61803 Enter a, b, c: 1 2.0 1 The equation has one root -1 Enter a,
		 * b, c: 1 2 3 The equation has no real roots
		 */

		Scanner unos = new Scanner(System.in);
		try {
			System.out.println("Enter a, b, c: ");
			double a = unos.nextDouble();
			double b = unos.nextDouble();
			double c = unos.nextDouble();
			//instanciran objekat klase QuadraticEquation, prosledjena mu tri argumenta
			QuadraticEquation  qe = new QuadraticEquation(a, b, c);
			System.out.println(qe);
			unos.close();
		} catch (InputMismatchException e) {
			System.out.println("Unos nije validan, prekid programa.");
		}
	}

}