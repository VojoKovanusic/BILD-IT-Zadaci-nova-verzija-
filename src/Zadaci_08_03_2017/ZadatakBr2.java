package Zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2 {
	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> niz = napraviMatrix();
		sort(niz);

	}

	// omogucavamo korisniku da unese 5 int elemenata u listu
	public static ArrayList<Integer> napraviMatrix() {
		ArrayList<Integer> array = new ArrayList<>();

		try {

			for (int index = 0; index < 5; index++) {
				System.out.println("Unesite u listu elemenat index br"
						+ (index + 1));
				array.add(unos.nextInt());
			}
		} catch (InputMismatchException e) {
			System.out
					.println("Mozete unjeti samo cjelle brojeve, prekid programa.");
			System.exit(0);
		}
		return array;

	}

	// met. pomocu koje sortiramo
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
		System.out.println("Nakon sortiranja , vas unos izgleda ovako:");
		for (Integer integer : list) {
			System.out.print(integer + " ");

		}
	}

}
