package Zadaci_07_03_2017;

import java.text.DecimalFormat;

public class Triangle extends GeometricObject {
	private double side1, side2, side3;

	// defalt konstr.
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	// parametarski kons.
	public Triangle(double side1, double side2, double side3) {

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// ...klasicne get i set metode, pomocu kojih pristupamo atributima i
	// mjenjamo ih
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	// za racunanje aree
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	// rcunanje obima
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.###");
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3="
				+ side3 + "], area=" + df.format(getArea());
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
System.out.println("Trougao: Ofarbaj sve tri strane");		
	}
}
