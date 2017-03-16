package Zadaci_15_03_2017;

import Zadaci_07_03_2017.Circle;
import Zadaci_07_03_2017.GeometricObject;

public class ZadatakBr1_Circle {
	/*
	 * (EnableCirclecomparable) Rewrite the Circleclass in Listing 13.2 to
	 * extend GeometricObjectand implement the Comparableinterface. Override the
	 * equalsmethod in the Objectclass. Two Circleobjects are equal if their
	 * radii are the same. Draw the UML diagram that involves
	 * Circle,GeometricObject, andComparable.
	 */
	public static void main(String[] args) {
		 
		Circle c = new Circle(23);
		Circle c2 = new Circle(23);
		
		if (c.equals(c2)) {
			System.out.println("Obadva kruga imaju isti radijus, koji iznosi "
					+ c.getRadius());
		} else
			System.out.println("Veci je " + GeometricObject.max(c, c2));
	}

}
