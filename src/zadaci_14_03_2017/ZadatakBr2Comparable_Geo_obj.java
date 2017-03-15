package zadaci_14_03_2017;

import Zadaci_07_03_2017.Circle;
import Zadaci_07_03_2017.GeometricObject;
import Zadaci_07_03_2017.Triangle;

public class ZadatakBr2Comparable_Geo_obj {

	public static void main(String[] args) {
		// instanciram dva objekta klase Triangle
		Triangle tr1 = new Triangle(42, 62, 73);
		Triangle tr2 = new Triangle(43, 62, 73);
		//poredjenje objekata iste klase
		System.out.println("The greater is " +GeometricObject.max(tr1, tr2));
		
		// instanciram dva objekta klase Triangle
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(234525);
		System.out.println("The greater is " +GeometricObject.max(c1, c2));
		
		
		//poredjenje objekata razlicitih klasa
		System.out.println("The greater is " + GeometricObject.max(c2, tr2));
	}

}
