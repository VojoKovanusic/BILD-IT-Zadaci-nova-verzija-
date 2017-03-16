package Zadaci_15_03_2017;

import Zadaci_07_03_2017.GeometricObject;

public class ZadatakBr2_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(4, 3);
		if (r1.equals(r2)) {
			System.out.println("Pravouganici imaju istu povrsinu: "
					+ r1.getArea());
		} else
			System.out.println("Veci je " + GeometricObject.max(r1, r2));
	}

}
