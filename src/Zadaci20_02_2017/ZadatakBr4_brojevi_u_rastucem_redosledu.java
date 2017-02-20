package Zadaci20_02_2017;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr4_brojevi_u_rastucem_redosledu {
	/*
	 * 4. Napisati program koji pita korisnika da unese 3 cijela broja te mu
	 * ispiše ta ista tri broja u rastuæem redosljedu. Bonus: Napisati metodu
	 * koja prima tri cijela broja kao argumente te vraæa brojeve u rastuæem
	 * redosljedu.
	 */public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			System.out
					.println("Unesite tri cjela broja, da ih sortiramo u rastucem rasporedu.\n"
							+ "Unesite prvi broj:");

			int br1 = unos.nextInt();

			System.out.println("Unesite drugi broj:");
			int br2 = unos.nextInt();

			System.out.println("Unesite treci broj:");
			int br3 = unos.nextInt();

			//prosledimo argumente metodi i ispisemo
			System.out.println("\nSortirani brojevi u rastucem rasporedu izgledaju ovako:");
			System.out.println(max(br1, br2, br3));
			unos.close();
		} catch (InputMismatchException e) {
			System.out
					.println("Pogresan unos, program prima samo cjele brojeve.");
		}
	}

	public static String max(int br1, int br2, int br3) {
//stavimo unesene br u niz
		int niz[] = { br1, br2, br3 };
		//sortiramo ih
		Arrays.sort(niz);
//vratimo brojeve
		return niz[0] + "<" + niz[1] + "<" + niz[2];
	}

}
