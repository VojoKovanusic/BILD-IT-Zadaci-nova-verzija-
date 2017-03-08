package Zadaci_07_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakB1_TringleTest {

	public static void main(String[] args) {

		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter three sides of the triangle.");
			// uzimanje vrjednosti od strane korisnika
		try {	double[] side = new double[3];
			for (int i = 0; i < 3; i++) {

				System.out.println("enter side" + (i + 1) + ":");
				side[i] = input.nextDouble();
				while (side[i] <= 0) {
					System.out
							.println("enter side" + i + ",greater than zero:");
					side[i] = input.nextDouble();
				}
			}
			System.out.println("Enter color:");
			String color = input.next();
			System.out.println("Is the triangle filled (true / false)?  ");
			boolean isFiled = input.nextBoolean();

			// instancirao objekat, i postavio vrjednosti atributa pomocu
			// konstruktora koji parametra tri argumenta
			Triangle triangle = new Triangle(side[0], side[1], side[2]);
			triangle.setColor(color);
			triangle.setFilled(isFiled);

			// ispis podataka
			 System.out.println(triangle.toString());
			System.out.println("Area = " + triangle.getArea());
			System.out.println("Perimeter = " + triangle.getPerimeter());
			System.out.println("Color = " + triangle.getColor());
			System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
					+ "filled");
		} catch (InputMismatchException e) {
			System.out.println("Nepravilan unos!");
		}
		
		input.close();
	}

}
