package Zadaci_18_03_2018_rekurzija;

import java.util.Scanner;

public class ZadatakBr2_reverse_char {
	/*
	 * (Print the characters in a string reversely) Write a recursive method
	 * that displays a string reversely on the console using the following
	 * header:
	 * 
	 * public static voidreverseDisplay(String value)
	 * 
	 * For example, reverseDisplay("abcd")displays dcba. Write a test program
	 * that prompts the user to enter a string and displays its reversal.
	 */
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite string: ");
		String value = unos.nextLine();
		unos.close();

		System.out.print("Reverse: ");
		reverseDisplay(value);

	}

	public static void reverseDisplay(String value) {

		// kada dodjemo do toga da je ostalo samo jedno slovo u unjetom stringu,
		// to znaci da trebamo postaviti bazni slucaj
		if (value.length() == 1)
			// ispisujemo jedini karakter koji je preostao
			System.out.println(value);

		else {
			// pri svakoj iteraciji ispisujemo zadnji element u nizu
			System.out.print(value.charAt(value.length() - 1));

			// pripremamo uneseni string za novu iteraciju, izbacivanjem zadnjeg
			// elementa
			value = value.substring(0, value.length() - 1);

			// rekuzivna metoda se opet poziva sa stringom kojem je izbcen
			// zadnji karakter
			reverseDisplay(value);
		}
	}
}
