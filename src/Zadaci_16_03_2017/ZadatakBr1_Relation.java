package Zadaci_16_03_2017;

public class ZadatakBr1_Relation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * (Demonstrate the benefits of encapsulation) Rewrite the Rational
		 * class in * Listing 13.13 using a new internal representation for the
		 * numerator and * denominator. Create an array of two integers as
		 * follows: * * private long[] r = new long[2]; * * Use r[0] to
		 * represent the numerator and r[1] to represent the denominator. * The
		 * signatures of the methods in the Rational class are not changed, so a
		 * * client application that uses the previous Rational class can
		 * continue to use * this new Rational class without being recompiled. *
		 */

		Rational r1= new Rational(4, 2);
		Rational r2 = new Rational(2, 3);

		System.out.println(r1 + " + " + r2 + " = " + r1.dodavanje(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.oduzimanje

		(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.mnozenje(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.djeljenje(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}
}