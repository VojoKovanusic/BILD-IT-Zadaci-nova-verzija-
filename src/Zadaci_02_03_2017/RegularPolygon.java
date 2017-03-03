package Zadaci_02_03_2017;

public class RegularPolygon {
	
	private int n;   //br strana 
	private double side;  //duzina stranice
	private double x;   //polozaj centra poligona p0 x i y osi
	private double y;

	
	//konstruktor bez arugumenata sa defalt vrjednostima
	public RegularPolygon() {
		n = 3;
		side = 1;
		y = 0;
		x = 0;
	}
//kon sa dva argumenta dok su ostala dva defalt
	public RegularPolygon(int numberOfSide, double lengthOfSide) {
		this();
		n = numberOfSide;
		side = lengthOfSide;
		
	}
//kon sa cetiri parametra
	public RegularPolygon(int numberOfSide, double lengthOfSide,
			double x_coordinates, double y_coordinates) {
		n = numberOfSide;
		side = lengthOfSide;
		y = y_coordinates;
		x = x_coordinates;
	}

	//klasicne get i set metode atributa.
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	/**
	 * Returns the perimeter of the polygon.
	 * @return
	 */
	public double getPerimeter() {
		return n * side;
	}

	/**
	 * Returns the area of the polygon.
	 * @return
	 */

	public double getArea() {
		double area=(getN()*Math.pow(getSide(), 2))/4*Math.tan(Math.PI/n);
		return area;
		}
	
}


















