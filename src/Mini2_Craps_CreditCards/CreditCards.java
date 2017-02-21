package Mini2_Craps_CreditCards;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreditCards {

	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			System.out.println("Upisite broj kreditne kartice:");

			// ako je uslov ispunjen, ispisi:
			if (isValid(unos.nextLong())) {
				System.out.println("Unesena kreditna kartica je validna!");
			}
			// u suprotnom ispisi:
			else {
				System.out.println("Unesena kreditna kartica nije validna!");
			}
			unos.close();

		} catch (InputMismatchException e) {// hvatamo potencijalnu gresku pri
											// unosu iz konzole od strane
											// korisnika
			System.out.println("Unos nije validan, prekid programa");
		}

	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {

		// sum dajemo vrjednost zbira metoda koje vracaju zbirove na parnim i
		// neparnim mjestima unesenog broja...

		int sum = sumOfOddPlace(number) + sumOfDoubleEvenPlace(number);

		// prvo provjeravamo velicinu, uneseni br mora biti izmedju 13 i 16
		// cifara
		if (getSize(number) >= 13 || getSize(number) <= 16) {

			// pocetni brojevi kred.kar.moraju biti sa 4,5,6 ili 37
			if (prefixMatched(number, 4) || prefixMatched(number, 5)
					|| prefixMatched(number, 6) || prefixMatched(number, 37)) {

				// ako je sve predhodno ispunjeno provjerava da li je zadnji
				// uslov ispunjen, tj da li je suma bez ostatka kada se podjeli
				// sa 10
				if (sum % 10 == 0) {
					// ako jeste vraca true
					return true;

				}
			}

		}
		// u suprotnom k.k. nije validna
		return false;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;

		int index = 2;

		// petlja vrti dok ne predjemo kroz sve elemente unesenog broja
		while (number != 0) {
			// dobijamo zadnju cifru , koju prosledjujemo metodi
			long digit = number % 10;

			// ako je cifra na neparnom indeksu
			if (index % 2 != 0) {
				// sumi pri svakoj iteraciji dodajemo vrjednost metode koja
				// vraca vrjednost zavisno
				// od prosledjenog argumenta
				sum += getDigit((int) digit);

			}
			index++;
			// smanjujemo uneseni broj za zadnju cifru, iduci do nule
			number /= 10;
		}

		return sum;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		int x, y;

		// u koliko je uneseni broj pomnozen sa dva manji od 10, mnozimo ga sa
		// dva i vracamo vrjednost
		if (number * 2 < 10) {
			return number * 2;
		}
		// u koliko je uneseni broj pomnozen sa dva tacno 10, vracamo 1
		if (number * 2 == 10) {
			return 1;

			// u suprotnom, tj ako je proizvod preko 10, razdvajamo ga na
			// jednoscifrene
			// brojeve i vracamo njihov zbir
		} else
			number *= 2;
		x = number % 10;
		y = number / 10;
		return x + y;
	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		int index = 0;

		while (number != 0) {
			long digit = number % 10;

			// sabiramo sve brojeve koji se nalaze na parnim mjestima u
			// unesenom argumentu
			if (index % 2 == 0) {
				sum += digit;
			}
			number /= 10;
			index++;
		}

		return sum;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		// radi lakse obrade podatak, pretvaram sve u stringove
		String br = Long.toString(number);
		String prefix = Integer.toString(d);

		// poredim prvi(ili prva dva)elelmenta da li se podudaraju, ako ne vraca
		// gresku
		for (int i = 0; i < prefix.length(); i++) {
			if (prefix.charAt(i) != br.charAt(i)) {
				return false;
			}

		}

		return true;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {

		// vracamo duzinu unesenog broja, uz pomoc metode length, stim da ga
		// predhodno kastujemo
		return Long.toString(d).length();
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		if (prefixMatched(number, k))
			return k;

		return number;
	}
}
