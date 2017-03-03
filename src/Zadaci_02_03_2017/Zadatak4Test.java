package Zadaci_02_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4Test {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		try {

			System.out.print("Unesite vrjednosti za a, b, c, d, e i f: ");
			double a = unos.nextDouble();
			double b = unos.nextDouble();
			double c = unos.nextDouble();
			double d = unos.nextDouble();
			double e = unos.nextDouble();
			double f = unos.nextDouble();
			// instanciranje objekta klase LinearEquation i prosledjivanje
			// argumenata
			LinearEquation le = new LinearEquation(a, b, c, d, e, f);
			// ispis metode to string
			System.out.println(le);
unos.close();
		}

		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos, prekid programa. ");

		}
	}
}
