package Zadaci_24_02_2017;

import java.nio.ByteBuffer;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 * 3. U javi, short vrijednost se sprema u samo 16 bita. Napisati program
 * koji pita korisnika da unese short broj te mu ispiše svih 16 bita za dati
 * cijeli broj. Na primjer, ukoliko korisnik unese broj 5 - program mu
 * ispisuje 0000000000000101
 */
public class ZadatakBr3_short_to_byte {
	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			System.out
					.println("Korisnièe  unesite short broj, da Vam ispišemo svih 16 bita za dati cijeli broj:");
			// uzimamo vrjednost od korisnike
			short sh = unos.nextShort();
			unos.close();
			String nule = "";
			
			// konvertovanje u binarni oblik
			String bin = Integer.toBinaryString(sh);

			for (int i = bin.length(); i < 16; i++) {
				// dodavanje neophodnih nula
				nule += "0";

			}
			System.out
					.println("Binarna ispis unjetog broja je " + (nule + bin));

		} catch (InputMismatchException e) {// hvatanje greske prilikom unosa
			System.out.println("Vas unos nije bio validan, prekid programa!");

		}
	}
}