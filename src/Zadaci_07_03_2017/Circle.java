package Zadaci_07_03_2017;

import java.text.DecimalFormat;

public class Circle extends GeometricObject{

	double radius = 1;

	// konstruktori bez parametara
	public Circle() {
	}
	//kon sa int param.
public Circle(int r){
	radius=r;
}
//konstr sa double par.
public 	Circle(double newRadius) {
		radius = newRadius;
	}

	void setRadius(double newRadius) {
		radius = newRadius;
	}

	public String toString() {
		DecimalFormat df=new DecimalFormat("#.###");
		return "Circle with radius: " + radius+" area="+df.format(getArea());

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
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
	System.out.println("Krug: Ofarbaj cjeli krug");
		
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * radius * Math.PI;
	}
	}
