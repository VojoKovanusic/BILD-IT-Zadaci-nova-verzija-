package Zadaci_20_03_generics;

public class ZadatakBr4_max_element_in_2dArray {

	/*
	 * 9.6 (Maximum element in a two-dimensional array) Write a generic method
	 * that returns the maximum element in a two-dimensional array. public
	 * static<E extendsComparable<E>> E max(E[][] list)
	 */

	public static void main(String[] args) {
		System.out.println("Matrix double:");
		Double[][] niz = new Double[5][5];
		for (int row = 0; row < niz.length; row++) {
			for (int column = 0; column < niz.length; column++) {
				niz[row][column] = Math.rint(Math.random() * 10);
				System.out.print(niz[row][column] + " ");
			}
			System.out.println();

		}
		System.out.println("Najveci random broj je: " + max(niz)+"\n");
		System.out.println("Matrix integer:");
		Integer[][] niz1 = new Integer[5][5];
		for (int row = 0; row < niz1.length; row++) {
			for (int column = 0; column < niz1.length; column++) {
				niz1[row][column] =(int)(Math.random() * 10);
				System.out.print(niz1[row][column] + " ");
			}
			System.out.println();

		}
		System.out.println("Najveci random broj je: " + max(niz1));
	}

	public static <E extends Comparable<E>> E max(E[][] list) {
		E variabla = list[0][0];
		for (int row = 0; row < list.length; row++) {
			for (int column = 0; column < list.length; column++) {
				if (variabla.compareTo(list[row][column]) < 0) {
					variabla = list[row][column];
				}

			}
		}
		return variabla;
	}

}
