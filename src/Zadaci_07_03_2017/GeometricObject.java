package Zadaci_07_03_2017;

import java.util.Date;

import zadaci_14_03_2017.Colorable;

//abstr. klasa G.Obj. ima tri atributa, implementira comparable i colorable interfejs
public abstract class GeometricObject implements Comparable<GeometricObject>,
		Colorable {
	private String color;
	private boolean filled;
	private Date dateCreated;

	// no args. con.
	public GeometricObject() {
	}

	// ...sa klasicnim get i set metodama, pomocu kojih pristupamo atributima i
	// mjenjamo ih
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled
				+ ", dateCreated=" + dateCreated + "]";
	}

	public abstract double getArea();

	public abstract boolean equals(GeometricObject o);

	public abstract double getPerimeter();

	public static void max(GeometricObject o1, GeometricObject o2) {
		if (o1.compareTo(o2)>0) {
			System.out.println("Prvi geometrijski oblik -->" + o1.toString()
					+ " je veci.");
		} else if (o1.compareTo(o2)<0) {
			System.out.println("Drugi geometrijski oblik -->" + o2.toString()
					+ " je veci");
		} else {
			System.out.println("Jednake povrsine su");
		}
	}	
	public int compareTo(GeometricObject o) {
		if (getArea() > o.getArea())
			return 1;
		if (getArea() < o.getArea())
			return -1;
		return 0;
	}

	public static double sumArea(GeometricObject[] a) {
		double sumArea = 0;
		for (int i = 0; i < a.length; i++) {
			sumArea += a[i].getArea();

		}
		return sumArea;
	}

}
