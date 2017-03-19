package Zadaci_17_03_2018_rekurzija;

import java.util.Scanner;

public class ZadatakBr1_FibonacijevBroj {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {
		System.out
				.println("Unesite index na kojem zelite da izracunamo Fibonacijev niz:");
		try {
			int index = unos.nextInt();
			System.out.println("Na indexu " + index + " vrjednost je: "
					+ fibonacijevNiz(index));
		} catch (Exception e) {
			System.out.println("Unos nije validan!");
			System.exit(0);
		}
	}

	private static long fibonacijevNiz(int index) {
		long fo = 0, f1 = 1, fibBr = 0;

		if (index == 0)
			return fo;
		if (index == 1)
			return f1;

		for (int i = 1; i < index; i++) {
			fibBr = fo + f1;
			fo = f1;
			f1 = fibBr;
		}
			return fibBr;
		

	}

}
