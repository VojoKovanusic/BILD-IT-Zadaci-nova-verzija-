package Zadaci_16_03_2017;

import java.math.BigInteger;
import java.util.Scanner;

public class ZadatakBr5 {

	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			System.out.print("Upisite decimalni broj: ");
			// uneseni broj splitujemo i stavlajmo ga u niz, prvi clan niza je
			// integer, a drugi decimalni
			String[] broj_u_nizu = unos.nextLine().split("\\.");
			unos.close();

			RationalBigInt integer = new RationalBigInt(new BigInteger(
					broj_u_nizu[0]), BigInteger.ONE);

			int numberOfDecimalSpaces = broj_u_nizu[1].length();
			RationalBigInt decimalniDio = new RationalBigInt(new BigInteger(
					broj_u_nizu[1]), BigInteger.TEN.pow(numberOfDecimalSpaces));

			RationalBigInt number = integer.add(decimalniDio);

			System.out.println("Razlomak izgleda ovako: " + number.toString());
		} catch (Exception e) {
			System.out.println("Unos nije bio validan, prekid programa");
		}
	}

}
