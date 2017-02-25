package Zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr1_ {

	/*
	 * 1. Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te
	 * ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao
	 * ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.
	 */

	public static void main(String[] args) {
		try {
			System.out
					.println("Program koji prima ASCII kod (cijeli broj izmeðu 0 i 127),te ispisuje koji je to karakter.\n"
							+ "Unesite broj:");
			Scanner unos = new Scanner(System.in);
			// u koliko korisnik unese vrjedost koja nije u zadatim granicama ,
			// upada u petlju
			int broj = unos.nextInt();
			while (broj <= 0 || broj >= 127) {
				System.out
						.println("Trebate unjeti cijeli broj izmeðu 0 i 127:");
				broj = unos.nextInt();
			}
			unos.close();
			if (broj == 32)
				System.out
						.println("Za ASCII kod  32 , karakter je space, pa se i ne vidi ipis."
								+ ispisiKarakter(broj));
			else
				System.out.println("Za ASCII kod : " + broj + " , karakter je: "
						+ ispisiKarakter(broj) + "");
		} catch (InputMismatchException e) {// hvatanje unosa koji nije validan
			System.out
					.println("Unos nije bio validan, upravo je doslo do prekida programa!");
		}
	}

	// metoda koja prima int , te ga kastuje u char i vraca ga
	public static char ispisiKarakter(int i) {
		char c = (char) i;
		return c;
	}
}
