package Zadaci_09_03_2017;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Area_convex_polygon {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.println("Unesite broj vrhova");
			int brVrhova = unos.nextInt();

			// liste u koje ce mo smjestati podatke
			ArrayList<Double> x = new ArrayList<>();
			ArrayList<Double> y = new ArrayList<>();
			// uzimane podatak od korisnika
			System.out.println("Unesite " + (brVrhova * 2) + "koordinata:");
			for (int index = 0; index < brVrhova; index++) {
				x.add(unos.nextDouble());
				y.add(unos.nextDouble());
			}
			double sum = 0;
			// racunaje po formuli
			for (int i = 0; i < x.size(); i++) {
				if (i == x.size() - 1) {
					sum += (x.get(i) * y.get(0) - y.get(i) * x.get(0));
				} else {
					sum += (x.get(i) * y.get(i + 1) - y.get(i) * x.get(i + 1));
				}
			}
			// glavna formula, dgje sumu iz predhodnih naredbi stavljamo u
			// apsolutnu vrjednost i djlimo sa 2
			double area = Math.abs(sum / 2);
			
			// za ispis u zeljenom brpju decimala
			DecimalFormat dec = new DecimalFormat("#.###");
			System.out.println("Povrsina iznosi: " + dec.format(area));

		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos");
			unos.nextLine();
		}
	}
}
