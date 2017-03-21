package Zadaci_18_03_2018_rekurzija;

import java.util.Scanner;

public class ZadatakBr3_pojavljivanjeKaraktera {
	/*
	 * (Occurrences of a specified character in a string) Write a recursive
	 * method that finds the number of occurrences of a specified letter in a
	 * string using the following method header: public static intcount(String
	 * str, chara) For example, count("Welcome", 'e')returns 2. Write a test
	 * program that prompts the user to enter a string and a character, and
	 * displays the number of occurrences for the character in the string.
	 */

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String str = unos.nextLine();
		// izbacujemo sve praznine iz unjetog stringa
		str = str.replace(" ", "");
		// provjera
		while (!isLeter(str)) {
			System.out
					.println("Program provjerava samo slova, pokusajte ponovo");
			str = unos.nextLine();
		}
		System.out.print("Unesite slovo koj zelite provjeriti: ");
		String ch = unos.next();

		char a = ch.charAt(0);
		// provjera za karakter
		while (ch.length() != 1 || !Character.isLetter(a)) {
			System.out.println("Unesite jedno slovo.");
			ch = unos.next();
			a = ch.charAt(0);

		}

		unos.close();

		System.out.print("Slovo \"" + a + "\" se ponavlja " + count(str, a)
				+ " puta u Stringu \"" + str + "\"");
	}

	public static int count(String str, char a) {

		if (str.length() == 1)
			return str.charAt(0) == a ? 1 : 0;

		return (str.charAt(0) == a ? 1 : 0)
		// smanjujemo string pri svakoj iteraciji za jedan
				+ count(str.substring(1, str.length()), a);
	}

	// provjeravamo pomocu regexa da li se radi o slovimaf
	public static boolean isLeter(String name) {
		return name.matches("[a-zA-Z]+");
	}
}
