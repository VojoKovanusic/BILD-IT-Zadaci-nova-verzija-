package Zadaci_02_03_2017;

import java.text.DecimalFormat;

public class QuadraticEquation {
	private double a, b, c;

	//konstruktor sa tri parametra
	public QuadraticEquation(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}
//klasicn get i set metode, atributa klase
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
//metoda vraca vrjednost diskriminante
	public double getDiscriminant() {
		return Math.pow(b, 2) - (4 * a * c);
	}
//metoda vraca korjen prve jednacine
	public double getRoot1() {
		return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
	}
	//metoda vraca korjen druge jednacine
	public double getRoot2() {
		return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
	}

	//ispis ide zavisno od diskriminante
	public String toString() {
		
		//objekat uz pomoc kojega zaokruzuemo na trazene decimale
		DecimalFormat df = new DecimalFormat("#.######");
		DecimalFormat df2 = new DecimalFormat("#.#####");
		
		if (getDiscriminant() > 0) {
			return "The equation has two roots " + df.format(getRoot1()) + " and "
					+ df2.format(getRoot2());
		}
		if (getDiscriminant() == 0) {
			return "The equation has one root " + getRoot1();
		} else
			return "The equation has no real roots";
	}
}
