package Zadaci_02_03_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ZadatakBr5 {
	public static void main(String[] args) {

		// Omogucite korisniku da unese vrjednosti cetiri krajnje tacke
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double[][] points = getPoints();

		// Get a, b, c, d, e and f
		double[] p = getArguments(points);

		// napravljen LinearEquation objekt
		LinearEquation intersectingPoint = new LinearEquation(p[0], p[1], p[2],
				p[3], p[4], p[5]);

		// Ispi rezultata
		if (intersectingPoint.isSolvable()) {
			DecimalFormat df = new DecimalFormat("#.######");
			System.out.println("The intersecting point is at ("
					+ df.format(intersectingPoint.getX()) + ", "
					+ df.format(intersectingPoint.getY()) + ")");
		} else
			System.out.println("The two lines are parallel");
	}

	/** getPoints vraca 4 x 2 matrix sa korisnikovim krajnjim tackama */
	public static double[][] getPoints() {
		Scanner unos = new Scanner(System.in);

		// napravljena 4 x 2 matrica
		double[][] points = new double[4][2];

		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = unos.nextDouble();
			}
		}
		unos.close();

		return points;
	}

	/** metoda koja vraca linear equation argumente a, b, c, d, e, i f */
	public static double[] getArguments(double[][] points) {
		double[] p = new double[6];
		p[0] = points[0][1] - points[1][1];
		p[1] = -1 * (points[0][0] - points[1][0]);
		p[2] = points[2][1] - points[3][1];
		p[3] = -1 * (points[2][0] - points[3][0]);
		p[4] = (points[0][1] - points[1][1]) * points[0][0]
				- (points[0][0] - points[1][0]) * points[0][1];
		p[5] = (points[2][1] - points[3][1]) * points[2][0]
				- (points[2][0] - points[3][0]) * points[2][1];
		return p;
	}
}