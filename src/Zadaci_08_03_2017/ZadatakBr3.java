package Zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr3 {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> niz = napraviMatrix();
		sum(niz);

	}

	// metoda koja omoguceje korisniku da unese int podatke u listu
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

	// met. racuna sumu lelemnata niza koji mu prosledimo kao argument
	public static void sum(ArrayList<Integer> list) {
		int suma = 0;

		for (int index = 0; index < list.size(); index++) {
			suma += list.get(index);

		}
		System.out.println("Suma unesenih elemenata je: " + suma);

	}
}
