package Zadaci_02_03_2017;

public class ZadatkaBr2RegularPolygon {

	public static void main(String[] args) {
	

RegularPolygon poligon1 = new RegularPolygon();
RegularPolygon poligon2 = new RegularPolygon(6, 4);
RegularPolygon poligon3 = new RegularPolygon(10, 4, 5.6, 7.8);

System.out.println("Perimeter for regular poligon1 is: " + poligon1.getPerimeter() 
+ " and area is: " + poligon1.getArea());
System.out.println("Perimeter for regular poligon2 is: " + poligon2.getPerimeter()
+ " and area is: " + poligon2.getArea());
System.out.println("Perimeter for regular poligon3 is: " + poligon3.getPerimeter() 
+ " and area is: " + poligon3.getArea());

	}

}
