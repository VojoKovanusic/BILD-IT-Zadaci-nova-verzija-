package zadaci_14_03_2017;

import Zadaci_07_03_2017.GeometricObject;

public class Square extends GeometricObject {
	double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public void howToColor() {
		System.out.println("Square: Color all four sides");

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
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * side;
	}

	@Override
	public boolean equals(GeometricObject o) {
		if (compareTo(o) == 0)
			return true;
		return false;
	}
}
