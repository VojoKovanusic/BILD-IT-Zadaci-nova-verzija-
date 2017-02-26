package Zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2_Random_num_chooser {

	public static void main(String[] args) {

		try {
			Scanner unos = new Scanner(System.in);

			System.out
					.println("\t*****SLUCAJNI BROJEVI U GRANICI OD 1 DO 54*****\n"
							+ "\nUnesite koliko brojeva zelite izuzeti(1-53):");
			int brojIzuzetaka = unos.nextInt();

			while (brojIzuzetaka < 1) {
				System.out.println("Izaberite broj veci od 0, u rangu (1-53)");
				brojIzuzetaka = unos.nextInt();
			}
			while (brojIzuzetaka > 53) {
				System.out
						.println("Pa ne mozete izuzeti vise brojeva, neo sto program moze slucajno generisati,\n"
								+ "izaberite obvaj put broj manji od 54");
				brojIzuzetaka = unos.nextInt();
			}
			int[] listaIzuzetaka = new int[brojIzuzetaka];

			System.out
					.print("Upisite "
							+ brojIzuzetaka
							+ " brojva koje zelite izuzeti prilikom random izbora(1-54): ");
			for (int i = 0; i < listaIzuzetaka.length; i++)
				listaIzuzetaka[i] = unos.nextInt();

			System.out.println("Slucajno generisani broj je : "
					+ getRandom(listaIzuzetaka));

		} catch (InputMismatchException e) {
			System.out.println("pogresan unos, kaj programa.");
		}
	}

	public static int getRandom(int... numbers) {
		// nasumican broj u granicama od 1 do 54
		int random = (int) (Math.random() * 54 + 1);
		//petlja ide do duzine niza kojeg smo prosledili u metodu
		for (int i = 0; i < numbers.length; i++) {
			//ako je slucajni broj izabran u metodi jednak nekom elemntu prosledjenog niza
			if (random == numbers[i]) {
				//ponovo biramo slucajni broj
				random = (int) (Math.random() * 54 + 1);
				//i dekrementujemo vrjednost i za jedan
				i = -1;
			}
		}
		return random;
	}
}