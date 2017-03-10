package Zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2_11_17 {
	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.print("Unesite cijeli broj: ");
			int m = unos.nextInt();
			racunanjeSavrsenogKvadrata(m);
		} catch (InputMismatchException e) {
			System.out.println("Invalidan unos");
			unos.nextLine();
		}
	}

	// Method izracunava i ispisuje savrsen kvadrat
	public static void racunanjeSavrsenogKvadrata(int m) {

		ArrayList<Integer> list = faktori(m);
		ArrayList<Integer> list2 = distinctOdds(list);
		int n = 1;
		for (int i = 0; i < list2.size(); i++)
			n *= list2.get(i);

		System.out
				.println("Najmanji broj n za n * m da bi bio savrsen kvadrat je "
						+ n);
		System.out.println(m + " * " + n + " = " + (m * n));
	}

	// Method unosi sve faktore n broja u listu i vraca nam tu listu

	public static ArrayList<Integer> faktori(int n) {

		int faktor = 2;
		ArrayList<Integer> list = new ArrayList<>();

		while (n != 1) {

			if (n % faktor == 0) {
				list.add(faktor);
				n /= faktor;
			} else {
				faktor++;
			}
		}
		return list;
	}

	// Method izdvaja brojeve koji se ponavljaju neparan broj puta u
	// proslijedjenoj listi, unosi ih u novu listu i vraca

	public static ArrayList<Integer> distinctOdds(ArrayList<Integer> list) {

		list.add(0);
		ArrayList<Integer> list2 = new ArrayList<>();
		int counter = 1;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) == list.get(i + 1)) {
				counter++;
			} else {
				if (counter % 2 != 0) {
					list2.add(list.get(i));
					counter = 1;
				} else {
					counter = 1;
				}
			}
		}
		return list2;
	}

}