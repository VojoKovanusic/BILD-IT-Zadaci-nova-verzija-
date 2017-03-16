package Zadaci_15_03_2017;

import Zadaci_07_03_2017.GeometricObject;

public class Octagon extends GeometricObject implements Cloneable {
	private double side;

	public Octagon(double s) {
		side = s;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
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
	public void howToColor() {
		System.out.println("Oktagon ne treba farbati");

	}

	@Override
	// area=(2 +4/22)*side*side
	public double getArea() {
		// TODO Auto-generated method stub
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override
	public boolean equals(GeometricObject o) {
		if (compareTo(o) == 0)
			return true;
		return false;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 8 * side;
	}

	public Octagon clone() {
		try {
			return (Octagon) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("Kloniranje nije uspjelo");
			throw new RuntimeException();
		}
	}

	@Override
	public String toString() {
		return "Oktagon cije su stranice duzine " + side + " ima povrsinu="
				+ getArea() + " a obim mu je " + getPerimeter();
	}

}
