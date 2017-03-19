package Zadaci_17_03_2018_rekurzija;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2_GCD {
	/*
	 * 18.3 (Compute greatest common divisor using recursion) The gcd(m, n)can
	 * also be defined recursively as follows: If m % nis 0,gcd(m, n) is n.
	 * Otherwise,gcd(m, n)is gcd(n, m % n). Write a recursive method to find the
	 * GCD. Write a test program that prompts the user to enter two integers and
	 * displays their GCD
	 */

	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			System.out.println("Unesite prvi broj:");
			int br1 = unos.nextInt();
			System.out.println("Unesite drugi broj:");
			int br2 = unos.nextInt();
			System.out
					.println("Najveci zajednicki djelilac unesenih brojeva je "
							+ gdc(Math.max(br1, br2), Math.min(br1, br2)));
			unos.close();
		} catch (InputMismatchException e) {
			System.out.println("Unos nije valida prekid programa");
			System.exit(0);
		}
	}

	private static int gdc(int max, int min) {
		if (max % min == 0)
			return min;
		return gdc(max, max % min);

	}

}
