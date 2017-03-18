package Zadaci_16_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr4_Complex {
	static Scanner unos = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			 
			System.out.print("Unesite prvi complex broj: ");
			Complex complexBroj1 = getComplex();
			System.out.print("Unesite drugi complex broj: ");
			Complex complexBroj2 = getComplex();

			
			System.out.print(complexBroj1 + " + " + complexBroj2 + " = ");
			print(complexBroj1.saberi(complexBroj2));

			System.out.print(complexBroj1 + " - " + complexBroj2 + " = ");
			print(complexBroj1.oduzimi(complexBroj2));

			System.out.print(complexBroj1 + " * " + complexBroj2 + " = ");
			print(complexBroj1.pomnozi(complexBroj2));

			System.out.print(complexBroj1 + " / " + complexBroj2 + " = ");
			print(complexBroj1.podjeli(complexBroj2));

			System.out.println("|" + complexBroj1 + "| = "
					+ complexBroj1.abs());
		} catch (InputMismatchException e) {
			System.out.println("Unos nije validan, prekid programa.");
			System.exit(0);
		}
	}

	//ispis 
	public static void print(Complex n) {
		if (n.getImaginarni() == 0)
			System.out.println(n.getStvarni());
		else
			System.out.println(n.getStvarni() + " + " + n.getImaginarni()
					+ "i");
	}

	//vraca korisnikov unos kao com. br
	public static Complex getComplex() {
	 
		
		double[] c = new double[2];
		for (int i = 0; i < c.length; i++)
			c[i] = unos.nextDouble();
		
		return new Complex(c[0], c[1]);
	}
}

class Complex implements Cloneable {
	private double a;
	private double b;


	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
 
	public double getStvarni() {
		return a;
	}

 
	public double getImaginarni() {
		return b;
	}

	//sabiranj  complex broja i "this" complex broja 
	public Complex saberi(Complex drComplex) {
		return new Complex(a + drComplex.a, b + drComplex.b);
	}

	//oduzimanje  complex broja i "this" complex broja 
	public Complex oduzimi(Complex drComplex) {
		return new Complex(a - drComplex.a, b - drComplex.b);
	}

	//mnozenje complex broja i "this" complex broja 
	public Complex pomnozi(Complex drComplex) {
		return new Complex(a * drComplex.a - b * drComplex.b, b
				* drComplex.a + a * drComplex.b);
	}

	//djeljenje complex broja i "this" complex broja 
	public Complex podjeli(Complex drComplex) {
		return new Complex(
				(a * drComplex.a + b * drComplex.b)
						/ (Math.pow(drComplex.a, 2) + Math.pow(
								drComplex.b, 2)), (b * drComplex.a - a
						* drComplex.b)
						/ (Math.pow(drComplex.a, 2) + Math.pow(
								drComplex.b, 2)));
	}

	//vraca apsolutnu vrjednost this com. br
	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	@Override
	public Complex clone() throws CloneNotSupportedException {
		return (Complex) super.clone();
	}

	@Override
	
	public String toString() {
		return b == 0 ? a + "" : "(" + a + " + " + b + "i)";
	}

}
