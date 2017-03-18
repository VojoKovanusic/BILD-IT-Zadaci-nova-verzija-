package Zadaci_16_03_2017;

import java.math.BigInteger;

public class ZadatakBr2_BigInteger {
	public static void main(String[] args) {
		 
		RationalBigInt r1 = new RationalBigInt(new BigInteger("400000"), 
			new BigInteger("200000"));
		RationalBigInt r2 = new RationalBigInt(new BigInteger("200000"), 
			new BigInteger("300000"));

		
		System.out.println("Ispis rezultata:\n"+r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}
}