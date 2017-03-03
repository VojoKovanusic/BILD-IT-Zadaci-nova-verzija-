package Zadaci_02_03_2017;

public class LinearEquation {

	private double a, b, c, d, e, f;

	public LinearEquation() {
	}

	// A konstruktor koji prima argumente za a, b, c, d, e, i f.

	public LinearEquation(double a, double b, double c, double d, double e,
			double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	// Klasicne get i set metode
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	public boolean isSolvable() {
		return ((getA() * getD() - getB() * getC()) != 0);
	}

	// vraca rjesene jednacine po trazenoj formuli
	public double getX() {
		return (((getE() * getD()) - (getB() * getF())) / (((getA() * getD()) - (getB() * getC()))));
	}

	// vraca rjesene jednacine po trazenojformuliformuli
	public double getY() {
		return (((getA() * getF()) - (getE() * getC())) / (((getA() * getD()) - (getB() * getC()))));
	}

	@Override
	public String toString() {
		if ((a * d - b * c) != 0) {
			return "X is: " + getX() + "\nY is: " + getY();
		} else
			return "The equation has no solution.";

	}
}