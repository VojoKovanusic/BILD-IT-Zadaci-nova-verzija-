package Zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr4_removeDuplicate {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {
		// instanciranje liste pozivanjem metode
		ArrayList<Integer> niz = napraviMatrix();
		// ispis i izbacivanje elemenata sa istim vrednostima
		removeDuplicate(niz);

	}

	public static ArrayList<Integer> napraviMatrix() {

		ArrayList<Integer> array = new ArrayList<>();
		try {

			for (int index = 0; index < 10; index++) {
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

	// metoda pomocu koje izbacujemo elemenate koji se dva puta pojavljuju u
	// listi
	public static void removeDuplicate(ArrayList<Integer> list) {

		for (int index = 0; index < list.size(); index++) {
			for (int control = 0; control < list.size(); control++) {
				if (index != control && list.get(index) == list.get(control)) {
					list.remove(index);
				}

			}

		}
		System.out.println("Bez dupliakta lista izgleda ovako: ");

		for (Integer element : list) {
			System.out.print(element + " ");

		}
	}
}