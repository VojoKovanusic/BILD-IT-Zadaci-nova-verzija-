package Zadaci_18_03_2018_rekurzija;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr4_sum_digits {
	/*
	 * Sum the digits in an integer using recursion) Write a recursive method
	 * that computes the sum of the digits in an integer. Use the following
	 * method header: public static intsumDigits(longn) For example,
	 * sumDigits(234)returns 2 +3+4=9. Write a test program that prompts the
	 * user to enter an integer and displays its sum.
	 */
	public static void main(String[] args) {
		try {

			Scanner unos = new Scanner(System.in);

			System.out
					.println("Unesite broj, da izracunamo sumu pojedinacnih cifara:");

			long br = unos.nextLong();

			System.out.println("Suma cifara iznosi: " + sumDigits(br));

			unos.close();

		} catch (InputMismatchException e) {
			System.out.println("Unos nije valida prekid programa");
			System.exit(0);
		}
	}

	public static int sumDigits(long n) {
		if (n == 0)
			return 0;
		// pri svakoj iteraciji uzimamo zadnju cifu(n%10) i sabiramo ih...a pri tome i
		// pozivamo metodu bez nje(n/10)
		return (int) (n % 10 + sumDigits(n / 10));

	}
}
