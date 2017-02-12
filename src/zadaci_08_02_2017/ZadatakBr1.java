package zadaci_08_02_2017;

import java.util.ArrayList;

public class ZadatakBr1 {
	public static void main(String[] args) {
		/*
		 * 1. Napisati sljedeæu metodu koja vraæa najveæu vrijednosti u
		 * ArrayListu Integera. Metoda vraæa null ukoliko je lista null iil
		 * ukoliko lista sadrži 0 elemenata. public static Integer
		 * max(ArrayList<Integer> list)
		 */

		ArrayList<Integer> lista = new ArrayList<>();
		// test
		lista.add(23);
		lista.add(45);
		lista.add(445);
		lista.add(145);

		System.out.println(max(lista));// poziva metodu, prosledjuje joj listu
	}
//metoda
	public static Integer max(ArrayList<Integer> list) { 
		int maxElement = list.get(0);

		if (list.size() == 0 || list.equals(null)) // ako je lista prazna vraca
													// null
			return null;
		// ako lista nije prazna
		for (Integer number : list) { // prolazi kroz sve elemente liste
			if (number > maxElement) { // ako je neki broj veci od maxElement
				maxElement = number; // maxElement dobija vrjednost tog broja

			}

		}

		return maxElement; // vraca najveci elemenat u listi
	}
}
