package Zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZAdatakBr5 {

	static Scanner unos = new Scanner(System.in);

	/*
	 * 11.14 (Combine two lists) Write a method tha t returns the union of two
	 * array lists of integers using the following header: public static
	 * ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer>
	 * list2)
	 */
	public static void main(String[] args) {
		// isis trazenih podataka, pozivanjem metoda i prosledjivanjem
		// argumenata
		System.out.println("Napravite listu1");
		ArrayList<Integer> niz1 = napraviMatrix();
		System.out.println("Napravite listu2");
		ArrayList<Integer> niz2 = napraviMatrix();
		union(niz1, niz2);

	}

	// metoda pomocu koje omogucavamo da korisnik unese podatke u listu
	public static ArrayList<Integer> napraviMatrix() {

		ArrayList<Integer> array = new ArrayList<>();
		try {

			for (int index = 0; index < 5; index++) {
				System.out.println("Unesite u listu elemenat index br "
						+ (index + 1) + ": ");
				array.add(unos.nextInt());
			}
		} catch (InputMismatchException e) {
			System.out
					.println("Mozete unjeti samo cjelle brojeve, prekid programa.");
			System.exit(0);
		}
		return array;

	}

	// spajanje dvije prosledjene liste u jednu
	public static void union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> union = new ArrayList<>();
		for (int index = 0; index < list1.size(); index++) {
			union.add(list1.get(index));
		}
		for (int index = 0; index < list2.size(); index++) {
			union.add(list2.get(index));
		}

		System.out.println("Nakon spajanja lista izgleda ovako: ");

		for (Integer element : union) {
			System.out.print(element + " ");

		}
	}
}
