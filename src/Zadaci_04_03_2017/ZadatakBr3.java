package Zadaci_04_03_2017;

import java.math.BigInteger;

public class ZadatakBr3 {

	public static void main(String[] args) {

		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		number = number.add(BigInteger.ONE);
//ispis 5 puta broja, ako je broj prost
		for (int i = 0; i < 5;) {
			if (isPrimeBigInteger(number)) {
				System.out.println(number);
				i++;
			}
			number = number.add(BigInteger.ONE);
		}

	}
//metoda koja vraca true ako je uneseni broj prost
	public static boolean isPrimeBigInteger(BigInteger number) {
		BigInteger divisor;
		for (divisor = new BigInteger("2"); divisor
				.compareTo(number.divide(new BigInteger("2"))) <= 0; divisor = divisor.add(BigInteger.ONE)) {
			if (number.remainder(divisor).equals(BigInteger.ZERO)) {
				return false;
			}
		}
		return true;
	}
}