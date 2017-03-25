package zadaci_14_03_2017;

import java.awt.Rectangle;

import Zadaci_07_03_2017.Circle;
import Zadaci_07_03_2017.GeometricObject;
import Zadaci_07_03_2017.Triangle;

public class ZadatakBr2Comparable_Geo_obj {

	public static void main(String[] args) {
		// instanciram dva objekta klase Triangle
		GeometricObject tr1 = new Triangle(42, 62, 73);
		GeometricObject tr2 = new Triangle(43, 62, 73);
		// poredjenje objekata iste klase
		GeometricObject.max(tr1, tr2);

		// instanciram dva objekta klase Triangle
		GeometricObject c1 = new Circle(134);
		GeometricObject c2 = new Circle(23);
		GeometricObject.max(c1, c2);

		// poredjenje objekata razlicitih klasa
		GeometricObject.max(c2, tr2);
		
	}

}
