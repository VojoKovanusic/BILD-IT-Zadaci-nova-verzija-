package Zadaci_18_03_2018_rekurzija;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5_najveci_element_niza {

	/**
	 * 18.13 (Find the largest number in an array) Write a recursive method that
	 * returns the largest integer in an array. Write a test program that
	 * prompts the user to enter a list of eight integers and displays the
	 * largest element.
	 */

	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			System.out
					.println("Unesite 8 cjelobrojnih vrjednosti tipa integer.");
			int niz[] = new int[8];
			for (int i = 0; i < 8; i++) {
				System.out.println((i + 1) + ")Unesite broj:");
				niz[i] = unos.nextInt();
			}
			System.out.println("Najveci uneseni elemenat u nizu je: "
					+ max(niz, niz.length - 1));
			unos.close();
		} catch (InputMismatchException w) {
			System.out.println("Unos nije validan, kraj programa!");
		}
	}

	public static int max(int[] a, int index) {
		if (index > 0) {
			System.out.println(Math.max(a[index], max(a, index - 1))
					+ "\na[index] " + a[index] + "\na[index-1] " + a[index - 1]
					+ "\n___________");
			return Math.max(a[index], max(a, index - 1));
		} else {
			return a[0];
		}
	}
}
