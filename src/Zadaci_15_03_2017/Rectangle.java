package Zadaci_15_03_2017;

import Zadaci_07_03_2017.GeometricObject;

public class Rectangle extends GeometricObject {
	private double sirina;
	private double duzina;
	public Rectangle(double s,double d) {
		sirina = s;
		duzina=d;
	}

	public double getSirina() {
		return sirina;
	}
	public double getDuzina() {
		return duzina;
	}

	public double getArea() {
		return sirina*duzina;
	}

	@Override
	public int compareTo(GeometricObject o) {
		if (getArea() > o.getArea())
			return 1;
		if (getArea() < o.getArea())
			return -1;
		return 0;
	}

	@Override
	public boolean equals(GeometricObject o) {
		if (compareTo(o) == 0)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Pravougaonik  povrsine " + getArea();
	}

	@Override
	public void howToColor() {
		System.out.println("Okreci kako god "+toString());

	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(sirina+duzina);
	}

}
