package Zadaci_07_03_2017;

import java.util.ArrayList;

public class ZadatakBr5_shuffle {

	public static void main(String[] args) {
//instaciramo objekat  tipa ArrayLista
		ArrayList<Integer> list = new ArrayList<>();
		//dodajemo elemente
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
//ispisujemo elemente pre mjesanja
		for (Integer i : list)
			System.out.print(i + " ");

		System.out.println();
//pozivamo metodu koja "mjesa", proseldjujemo joj unjetu list
		shuffle(list);
//ponovo ispisujemo
		for (Integer i : list)
			System.out.print(i + " ");
	}

	// metoda koja mjesa elemente koji se nalaze unutar liste
	public static void shuffle(ArrayList<Integer> list) {

		int size = list.size();

		for (int i = 0; i < size; i++) {
			int index = (int) (Math.random() * size);
			Integer temp = list.get(index);
			list.remove(index);
			list.add(temp);
		}
	}
}