package Zadaci21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2_reverseNumber {
	/*
	 * 2. Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj
	 * koji joj je proslijeðen kao argument: public static void reverse(int
	 * number). Na primjer, reverse(3456) treba da vrati 6543. Napisati program
	 * koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan
	 * naopako.
	 */public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		try {
			System.out
					.println("Unesite neki cjeli broj, a program ce ga ispisati naopako:");
			System.out.println();

			int broj = unos.nextInt();
			System.out.println("\nNaopako izgleda ovako:");
			reverse(broj);

		} catch (InputMismatchException e) {
			System.out.println("Prekid programa, pograsan unos!");
		}
		unos.close();
	}

	public static void reverse(int number) {
		// u slucaju da je broj negativan
		if (number < 0) {
			// pretvaramo ga u pozitivan(moglo je i preko abs..)
			number *= -1;
			// kastujemo ga u string,radi lakseg baratanja
			String str = Integer.toString(number);
			// ispisemo prvo minus
			System.out.print("-");
			// ispis unazad
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));

			}
//ako je veci od 0 tj pozitivan
		} else {

			String s = Integer.toString(number);
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}

		}
	}
}
