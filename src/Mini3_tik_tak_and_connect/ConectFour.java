package Mini3_tik_tak_and_connect;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConectFour {

	public static void main(String[] args) {
		try {// sav meni se nalazi u traj kec bloku u slucaju pogresnog unosa

			Scanner unos = new Scanner(System.in);
			int[][] vrjednosti = new int[6][7];
			int brDiska = 0;
			String boja;
			int disk;

			do {

				brDiska++;
				if (brDiska % 2 == 0) {
					boja = "crveni";
					disk = 1;
				} else {
					boja = "zuti";
					disk = 2;
				}

				System.out.print("Spusti " + boja + " disk na kolonu (0–6):");
				int kolona = unos.nextInt();
				while (kolona > 6 || kolona < 0) {
					System.out
							.println("Ova igrica ima od 0 do 6 kolona, pokusajte ponovo:");
					kolona = unos.nextInt();
				}
				for (int index = vrjednosti.length - 1; index >= 0; index--) {
					if (vrjednosti[index][kolona] == 0) {
						vrjednosti[index][kolona] = disk;
						break;
					}

					if (index == 0)
						System.out
								.println("Kolona je napunjena, pokusaj sa nekom drugom!");
				}
				ispisirenutnoStanje(vrjednosti);

			} while (provjeriStanje(vrjednosti) == false && brDiska != 6 * 7);

			if (provjeriStanje(vrjednosti)) {
				System.out.println("Igrac sa " + boja
						+ "m diskovima je pobjedio!");

			} else {
				System.out
						.println("Partija je zavrsila bez pobjednika, nerjeseno!");
			}
			unos.close();
		} catch (InputMismatchException e) {
			System.out
					.println("Pogresan unos, ovaj program prima samo cjele brojeve u granici od 0 do 6."
							+ "\nKraj programa!");
		}
	}

	// metoda kja prima 2d niz i ispisuje trenutno stanje u njemu
	public static void ispisirenutnoStanje(int[][] values) {

		for (int i = 0; i < values.length; i++) {
			System.out.print("|");
			for (int j = 0; j < values[i].length; j++) {
				char c;
				if (values[i][j] == 1) {
					c = 'R';
				} else if (values[i][j] == 2) {
					c = 'Y';
				} else {
					c = ' ';
				}

				System.out.print(c + "|");
			}
			System.out.println();
		}

		for (int i = 0; i <= values.length * 2; i++) {
			System.out.print("-");
		}

		System.out.println();

	}

	// metoda koja u sustini u sebi ima tri metode, kojima prosledjujemo 2d niz
	// sa podatcima , te on na osnovu toga vrsi validaciju, te vraca tru ili
	// fols..zavisno da li su cetiri u nizu zetona iste boje
	public static boolean provjeriStanje(int[][] values) {

		return provjeriPoVertikali(values) || provjeriPoHorizontali(values)
				|| provjeravanjePoDijagonali(values);

	}

	public static boolean provjeriPoVertikali(int[][] values) {
		// Metoda koja ispituj vertikalu, da li imaju cetiri znaka iste boje

		for (int i = 0; i < values[0].length; i++) {
			int start = values[0][i];
			int count = 1;
			for (int j = 1; j < values.length; j++) {
				if (start == values[j][i] && start != 0) {
					count++;
				} else {
					start = values[j][i];
					count = 1;
				}

				if (count == 4) {
					return true;
				}
			}
		}

		return false;

	}

	public static boolean provjeriPoHorizontali(int[][] values) {

		// Metoda koja ispituje redove, da li je doslo do slucaja da su se
		// cetiri zetona iste boje nasli jedan pored drugog

		for (int i = 1; i < values.length; i++) {
			int start = values[i][0];
			int count = 1;
			for (int j = 1; j < values[i].length; j++) {
				if (start == values[i][j] && start != 0) {
					count++;
				} else {
					start = values[i][j];
					count = 1;
				}

				if (count == 4) {
					return true;
				}
			}
		}

		return false;

	}

	public static boolean provjeravanjePoDijagonali(int[][] values) {

		// Provjeravanje diagonala, da li je doslo do slucaja da imaju cetiri
		// zetona iste boje, te vraca true

		for (int i = 0; i < values.length; i++) {
			int start = values[i][0];
			int count = 1;
			for (int j = i + 1, k = 1; j < values.length
					&& k < values[0].length; j++, k++) {
				if (start == values[j][k] && start != 0) {
					count++;
				} else {
					start = values[j][k];
					count = 1;
				}
				if (count == 4) {
					return true;
				}
			}
		}

		// Prolazi kroz kolone

		for (int i = 0; i < values[0].length; i++) {
			int start = values[0][i];
			int brojac = 1;
			for (int j = i + 1, k = 1; j < values[0].length
					&& k < values.length; j++, k++) {
				if (start == values[k][j] && start != 0) {
					brojac++;
				} else {
					start = values[k][j];
					brojac = 1;
				}

				if (brojac == 4) {
					return true;
				}
			}
		}

		// Od gornjeg desnog ka donjoj lejvoj strani
		// prolazi kroz kolone

		for (int i = 0; i < values[0].length; i++) {
			int start = values[0][i];
			int count = 1;
			for (int j = 1, k = i - 1; j < values.length && k >= 0; j++, k--) {
				if (start == values[j][k] && start != 0) {
					count++;
				} else {
					start = values[j][k];
					count = 1;
				}
				if (count == 4) {
					return true;
				}
			}
		}

		// prolazi kroz redove

		for (int i = 0; i < values.length; i++) {
			int start = values[i][values[i].length - 1];
			int count = 1;
			for (int j = i + 1, k = values[0].length - 2; j < values.length
					&& k >= 0; j++, k--) {
				if (start == values[j][k] && start != 0) {
					count++;
				} else {
					start = values[j][k];
					count = 1;
				}
				if (count == 4) {
					return true;
				}
			}
		}

		return false;

	}
}