package zadaci_14_03_2017;

import Zadaci_07_03_2017.Circle;
import Zadaci_07_03_2017.GeometricObject;
import Zadaci_07_03_2017.Triangle;

public class ZadatakBr4_Colorable {

	public static void main(String[] args) {
		// niz koji sadrzi tri objekta, tipa GeometricObject
		GeometricObject object[] = new GeometricObject[3];
		
		object[0] = new Square(4);
		object[1] = new Triangle(1, 2, 3);
		object[2] = new Circle(3);
		for (int index = 0; index < object.length; index++) {
			object[index].howToColor();
			
		}
	}

}
