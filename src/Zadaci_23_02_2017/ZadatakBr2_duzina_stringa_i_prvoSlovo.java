package Zadaci_23_02_2017;

import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

public class ZadatakBr2_duzina_stringa_i_prvoSlovo {
	/*
	 * 2. Napisati program koji pita korisnika da unese neki string te mu
	 * ispisuje dužinu tog stringa kao i prvo slovo stringa.
	 */public static void main(String[] args) {
		try {
			System.out
					.println("Unesite string za koji zelite da ispisemo njegovu duzinu i prvi karakter:");
			Scanner unos = new Scanner(System.in);
			String str = unos.nextLine();

			// provjeravamo da li u unesenom stringu ima slovo, ako nema upada u
			// petlju
			while (!imaLiSlovo(str)) {
				System.out
						.println("U unesenom stringu nema slova, unesite neki string koji sadrzi barem jedno  slovom");
				str = unos.next();
			}

			System.out.println("Duzina unesenog string je: " + str.length()
					+ "." + "\nPrvo slovo u unsenom stringu je \""
					+ prvoSlovo(str) + "\".");
			unos.close();
		} catch (Exception e) {
			System.out.println("unos nije validan!");
		}
	}

	// metoda koja vraca prvo slovo u unesenom stringu kojeg mu prosledimo
	public static char prvoSlovo(String str) {
		char c = ' ';
		for (int i = 0; i < str.length(); i++) {
			// kada petlja naidje na karakter koji je slovo,
			// "c" postaje to slovo
			if (Character.isLetter(str.charAt(i))) {
				c = str.charAt(i);
				break;
			}

		}
		return c;
	}

	// u koliko prosledimo string koji nema slovo vraca false, i obrnuto
	public static boolean imaLiSlovo(String str) {
		for (int i = 0; i < str.length(); i++) {
			// cim naidje na prvo slovo u stringu vraca true i prestaje sa radom
			if (Character.isLetter(str.charAt(i))) {
				return true;
			}

		}
		return false;
	}

}
