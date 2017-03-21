package Zadaci_18_03_2018_rekurzija;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr1_reverse_number {
	/*
	 * (Print the digits in an integer reversely) Write a recursive method that
	 * displays anintvalue reversely on the console using the following header:
	 * public static voidreverseDisplay(intvalue) For example,
	 * reverseDisplay(12345)displays 54321. Write a test program that prompts
	 * the user to enter an integer and displays its reversal.
	 */
	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);

			System.out.print("Unesite integer: ");
			int value = unos.nextInt();
			unos.close();

			System.out.print("Reverse: ");
			reverseDisplay(value);
		} catch (InputMismatchException e) {
			System.out.println("Unos nije validan, prekid programa.");
		}
	}

	public static void reverseDisplay(int value) {

		if (value < 10)
			// ispisuje samo zadnju cifru od unesene(value)
			System.out.println(value);
		// posto je bazni slucaj, ne pozivamo vise metodu i prekidamo ispis

		else {
			// ispisujemo samo zadnju cifru pri svakoj iteraciji
			System.out.print(value % 10);
			// pozivamo metodu ponovo ali "izbijamo" zadnju cifru koju smo
			// predhodno ispisali
			reverseDisplay(value / 10);
		}
	}
}
