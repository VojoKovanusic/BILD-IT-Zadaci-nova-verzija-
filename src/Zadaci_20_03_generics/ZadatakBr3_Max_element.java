package Zadaci_20_03_generics;

public class ZadatakBr3_Max_element {
	/*
	 * 19.5 (Maximum element in an array) Implement the following method that
	 * returns the maximum element in an array. public static<E
	 * extendsComparable<E>> E max(E[] list)
	 */
	public static void main(String[] args) {

		Double[] niz = new Double[5];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = Math.random() * 10;
			System.out.println(niz[i]);
		}
		System.out.println("Najveci random broj je: " + max(niz));

		String[] gradovi = new String[3];
		gradovi[0] = "Banja Luka";
		gradovi[1] = "Zenica";
		gradovi[2] = "Teslic";
		System.out.println("Poslednji grad po abecednom redu je: "
				+ max(gradovi));
	}

	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for (int i = 0; i < list.length; i++) {

			if (max.compareTo(list[i]) < 0) {

				max = list[i];
			}

		}

		return max;

	}
}
