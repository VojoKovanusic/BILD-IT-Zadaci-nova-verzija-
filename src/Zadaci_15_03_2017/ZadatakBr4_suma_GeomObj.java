package Zadaci_15_03_2017;

import java.text.DecimalFormat;

import Zadaci_07_03_2017.Circle;
import Zadaci_07_03_2017.GeometricObject;

public class ZadatakBr4_suma_GeomObj {

	public static void main(String[] args) {
		GeometricObject geometrijskiObjekti[] = new GeometricObject[4];
		geometrijskiObjekti[0] = new Rectangle(2, 3);
		geometrijskiObjekti[1] = new Rectangle(1, 4);
		geometrijskiObjekti[2] = new Circle(3);
		geometrijskiObjekti[3] = new Circle(2);

		System.out.println("Zbir povrsina sledeca 4 objekta :");
		for (GeometricObject geometricObject : geometrijskiObjekti) {
			System.out.println((geometricObject));

		}

		DecimalFormat df = new DecimalFormat("#.###");
		 
		System.out.println("\nIznosi:" + df.format(GeometricObject.sumArea(geometrijskiObjekti)));
	}

}
