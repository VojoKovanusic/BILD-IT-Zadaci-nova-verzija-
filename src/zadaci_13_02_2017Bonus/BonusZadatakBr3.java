package zadaci_13_02_2017Bonus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BonusZadatakBr3 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double brSvjGod = 0;
		try {
			System.out.print("Unesite broj svjetlosnih godina: ");
			brSvjGod = unos.nextDouble();
			distanca(brSvjGod);
		} catch (Exception e) {
			System.out.println("Pogresan unos. ");
		}
		unos.close();
	}
//metoda koja prima svjetlosnu godinu i racuna ostale potrebne vrjednosti
	public static void distanca(double svjetlosniG) {
		DecimalFormat format = new DecimalFormat("##.##");
		long sec = 365 * 24 * 60 * 60;
		long ly = 299792458 * sec;
		long totalKilometers = (long) ((ly * svjetlosniG) / 1000);
		double astro_jedinica = (totalKilometers) / 149600000 * svjetlosniG;
		double parsec = 1 / 3.26 * svjetlosniG;
		double helios = totalKilometers / 252792.537;

		System.out.println(svjetlosniG + " svjetlosnih godina je: \n - "
				+ totalKilometers + " kilometara\n - " + astro_jedinica
				+ " astronomskih jedinica\n - " + parsec
				+ " parseka\n Helios 2 bi presao za: " + format.format(helios)
				+ " h.");
	}
}
