package Zadaci_07_03_2017;

public class Circle {

	double radius = 1;

	// konstruktori
	Circle() {
	}

	Circle(double newRadius) {
		radius = newRadius;
	}

	// get i set metode..tj za dohvacanje i podesavanje atributa klase Circle
	double getArea() {
		return radius * radius * Math.PI;
	}

	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	void setRadius(double newRadius) {
		radius = newRadius;
	}

	public String toString() {
		return "Circle with radius: " + radius;

	}
}