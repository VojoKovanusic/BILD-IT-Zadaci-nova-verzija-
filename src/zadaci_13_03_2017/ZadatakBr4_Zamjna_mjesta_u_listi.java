package zadaci_13_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class ZadatakBr4_Zamjna_mjesta_u_listi {
	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite velicinu liste:");
		int velicina = unos.nextInt();

		while (velicina < 2) {
			System.out.println("Unesite velicinu liste vecu od 2" + ":");
			velicina = unos.nextInt();
		}

		ArrayList<Number> list = new ArrayList<>();
		for (int i = 1; i <= velicina; i++)
			list.add(i);
		System.out.println("Izvorna lista:");
		System.out.println(list);
		System.out.println("Zamjnjena mjesta, nasumicno:");
		shuffle(list);
		System.out.println(list);
	}

	public static void shuffle(ArrayList<Number> list) {

		// jednostavnija zamjena
		// Collections.shuffle(list);

		// rucna zamjena
		for (int index = 0; index < list.size(); index++) {
			int randomIndex = (int) (Math.random() * list.size());
			Number temp = list.get(randomIndex);
			list.set(randomIndex, list.get(index));
			list.set(index, temp);
		}

	}
}