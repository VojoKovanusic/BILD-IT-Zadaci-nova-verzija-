package Zadaci20_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2_max_min_zajednicki_sadrzalac {
	/*
	 * 2. Napisati program koji pita korisnika da unese dva cijela, pozitivna
	 * broja te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
	 */public static void main(String[] args) {
		 try{
		Scanner unos = new Scanner(System.in);
		System.out
				.println("Unesite dva cjela pozitina broja , da nadjemo najmanji i najveci zajednicki djelilac.\n"
						+ "Unesite prvi broj");

		int br1 = unos.nextInt();
		while (br1 < 1) {
			System.out.println("Unesite ponovo prvo br veci od 0!");
			br1 = unos.nextInt();
		}

		System.out.println("Unesite drugi broj");
		int br2 = unos.nextInt();
		while (br1 < 1) {
			System.out.println("Unesite ponovo prvo br veci od 0!");
			br1 = unos.nextInt();
		}

		while (br2 < 1) {
			System.out.println("Unesite ponovo prvo br veci od 0!");
			br2 = unos.nextInt();
		}
		unos.close();
		if (br2 < br1) {
			int temp = br2;
			br2 = br1;
			br1 = temp;
		}

		int najmanji_Z_D = 0;
		int najveci_Z_D = 0;

		int brojac = 0;
		for (int i = 2; i <= br2; i++) {

			if (br2 % i == 0 && br1 % i == 0 && brojac == 0) {
				brojac++;
				najmanji_Z_D = i;
			}
			
			if (br2 % i == 0 && br1 % i == 0) {
				najveci_Z_D = i;
			}

		}
		if (najveci_Z_D == 0) {
			System.out.println("Uneseni brojevi su uzajamno prosti.");
		} else
			System.out.println("Najveci zajednicki djelilac je: " + najveci_Z_D
					+ "\nNajmanji zajednicki djelilac je: " + najmanji_Z_D);
		 }catch(InputMismatchException e){
			 System.out.println("Prkid programa, pogresan unos!");
		 }}

}
