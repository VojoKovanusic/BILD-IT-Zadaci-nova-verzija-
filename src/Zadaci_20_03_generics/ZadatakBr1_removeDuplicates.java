package Zadaci_20_03_generics;

import java.util.ArrayList;

public class ZadatakBr1_removeDuplicates<E> {
	/*
	 * 19.3 (Distinct elements inArrayList) Write the following method that
	 * returns a new ArrayList. The new list contains the non-duplicate elements
	 * from the original list. public static<E> ArrayList<E>
	 * removeDuplicates(ArrayList<E> list)
	 */
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Auto");
		lista.add("Traktor");
		lista.add("Kamion");
		lista.add("Auto");
		lista.add("Brod");
		lista.add("Brod");
		lista.add("Traktor");
		lista.add("Kamion");
		lista.add("Camac");
		System.out.println("Orginalna lista:" + lista.toString());
		// pozivanje genericke metode kojoj prosledjujemo listu Stringova
		lista = removeDuplicates(lista);
		System.out.println("Bez duplikata: " + lista.toString());

		ArrayList<Integer> integer = new ArrayList<>();
		integer.add(34);
		integer.add(26);
		integer.add(34);
		integer.add(18);
		integer.add(34);
		integer.add(34);
		integer.add(23);
		integer.add(34);
		integer.add(26);
		System.out.println("Orginalna lista stringova:" + integer.toString());
		// pozivanje iste genericke metode kojoj prosledjujemo ovoga puta listu
		// integera

		integer = removeDuplicates(integer);
		System.out.println("Bez dublih brojeva:" + integer.toString());

	}

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		// lista u koju ce mo smjestati elemente koji se ne ponavljaju
		ArrayList<E> bezDuplih = new ArrayList<>();

		// unesena lista kroz koju prolazimo
		for (int index = 0; index < list.size(); index++) {

			// ako nova lista ne sadzi konkretni element na prosljedjenom
			// index-u
			if (!bezDuplih.contains(list.get(index))) {
				// dodajemo je u novu listu
				bezDuplih.add(list.get(index));
			}

		}

		return bezDuplih;
	}
}
