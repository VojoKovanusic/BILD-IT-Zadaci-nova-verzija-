package Zadaci_16_03_2017;

public class Rational extends Number implements Comparable<Rational> {

	// Atribut sa  brojnikom i nazivnikom
	private long[] r = new long[2];

	//defalt kons.
	public Rational() {
		this(0, 1);
	}

	//Konst. sa spcificnim brojnikom i nazivnikom
	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		r[1] = Math.abs(denominator) / gcd;
	}

	//pronalazimo najmanji zajednicki djelilac
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;

		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}

		return gcd;
	}
 
	public long getNumerator() {
		return r[0];
	}

 
	public long getDenominator() {
		return r[1];
	}

	//dodavanje rational broja, this rational */
	public Rational dodavanje(Rational drugiR) {
		long n = r[0] * drugiR.getDenominator() + r[1]
				* drugiR.getNumerator();
		long d = r[1] * drugiR.getDenominator();
		return new Rational(n, d);
	}

	
	public Rational oduzimanje(Rational drugiR) {
		long n = r[0] * drugiR.getDenominator() - r[1]
				* drugiR.getNumerator();
		long d = r[1] * drugiR.getDenominator();
		return new Rational(n, d);
	}

	
	public Rational mnozenje(Rational drugiR) {
		long n = r[0] * drugiR.getNumerator();
		long d = r[1] * drugiR.getDenominator();
		return new Rational(n, d);
	}


	public Rational djeljenje(Rational drugiR) {
		long n = r[0] * drugiR.getDenominator();
		long d = r[1] * drugiR.getNumerator();
		return new Rational(n, d);
	}

	@Override
	public String toString() {
		if (r[1] == 1)
			return r[0] + "";
		else
			return r[0] + "/" + r[1];
	}

	@Override
	
	public boolean equals(Object obj) {
		if ((this.oduzimanje((Rational) (obj))).getNumerator() == 0)
			return true;
		else
			return false;
	}

	@Override

	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	
	public double doubleValue() {
		return r[0] * 1.0 / r[1];
	}

	@Override

	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	// Implementiranje compareTo metode  
	public int compareTo(Rational o) {
		if (this.oduzimanje(o).getNumerator() > 0)
			return 1;
		else if (this.oduzimanje(o).getNumerator() < 0)
			return -1;
		else
			return 0;
	}
	
}