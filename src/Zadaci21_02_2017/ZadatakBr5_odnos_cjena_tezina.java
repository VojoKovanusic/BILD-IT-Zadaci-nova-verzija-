package Zadaci21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5_odnos_cjena_tezina {
	/*
	 * 5. Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita
	 * pakovanja. Želimo napisati program koji uporeðuje cijene ta dva
	 * pakovanja. Program pita korisnika da unese težinu i cijenu oba pakovanja
	 * te ispisuje koje pakovanje ima bolju cijenu.
	 */public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			System.out.println("Unesite tezinu prvog pakovanja u gr.:");
			double pakovanjeBr1 = unos.nextDouble();
			while (pakovanjeBr1 <= 0) {
				System.out
						.println("Ne moze tezina pakovanja biti manja od 0, unesite ponovo pkovanje broj 1:");
				pakovanjeBr1 = unos.nextDouble();
			}
			System.out.println("Unesite tezinu drugog pakovanja u gr.:");
			double pakovanjeBr2 = unos.nextDouble();
			while (pakovanjeBr2 <= 0) {
				System.out
						.println("Ne moze tezina pakovanja biti manja od 0, unesite ponovo pakovanje br 2:");
				pakovanjeBr2 = unos.nextDouble();
			}
			System.out.println("Unesite cjenu prvog pakovanja:");
			double cjenaBr1 = unos.nextDouble();
			while (cjenaBr1 <= 0) {
				System.out
						.println("Ne moze cjena biti manja od 0, unesite ponovo cjenu za prvo pakovanje:");
				cjenaBr1 = unos.nextDouble();
			}

			System.out.println("Unesite cjenu drugog pakovanja:");
			double cjenaBr2 = unos.nextDouble();
			while (cjenaBr2 <= 0) {
				System.out
						.println("Ne moze cjena biti manja od 0, unesite ponovo cjenu za drugo pakovanje:");
				cjenaBr2 = unos.nextDouble();
			}
			unos.close();

			if ((boljaCjena(pakovanjeBr1, pakovanjeBr2, cjenaBr1, cjenaBr2)) == pakovanjeBr1) {
				System.out.println("Prvo pakovanje od "
			+ pakovanjeBr1
						+ " gr. ima bolju cjenu po gramu proizvoda.");
			} else if ((boljaCjena(pakovanjeBr1, pakovanjeBr2, cjenaBr1,
					cjenaBr2)) == 0) {
				System.out
						.println("Pakovanja imamju indenticnu cjenu po gramu proizvoda.");
			} else
				System.out.println("Drugo pakovnje od " + pakovanjeBr2
						+ " gr. ima bolju cjenu po gramu proizvoda.");
		} catch (InputMismatchException e) {
			System.out.println("Niste unjeli validne podatke, kraj programa!");
		}

	}

	public static double boljaCjena(double pakBr1, double pakBr2,
			double cjeBr1, double cjenBr2) {
		double odnos1 = pakBr1 / cjeBr1;
		double odnos2 = pakBr2 / cjenBr2;
		if (odnos1 > odnos2) {
			return pakBr1;
		}
		if (odnos1 < odnos2) {
			return pakBr2;
		} else
			return 0;
	}

}
