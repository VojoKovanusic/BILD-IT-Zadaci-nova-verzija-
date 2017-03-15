package zadaci_14_03_2017;

import Zadaci_07_03_2017.Circle;
import Zadaci_07_03_2017.GeometricObject;

class ComparableCircle extends Circle { // GeometricObject Implements compareTo

	ComparableCircle() {
	}

	ComparableCircle(int radius) {
		super(radius);
	}
public static void main(String[] args) {
	ComparableCircle c1=new ComparableCircle(23);
	ComparableCircle c2=new ComparableCircle(213);
	System.out.println(""+GeometricObject.max(c1, c2));
	
}
}