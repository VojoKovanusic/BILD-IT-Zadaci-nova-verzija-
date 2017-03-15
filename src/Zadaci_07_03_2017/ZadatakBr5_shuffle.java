package Zadaci_07_03_2017;

import java.util.ArrayList;

public class ZadatakBr5_shuffle {

	public static void main(String[] args) {
		// instaciramo objekat tipa ArrayLista
		ArrayList<Integer> list = new ArrayList<>();
		// dodajemo elemente
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);

		ArrayList<Integer> kvizPitanja = randomQuestion(10,list);
		System.out.println("Nasumicna pitanja: ");
		for (int i = 0; i < kvizPitanja.size(); i++) {
			System.out.print(kvizPitanja.get(i)+" ");
		}
		
	}

	// metoda koja mjesa elemente koji se nalaze unutar liste
	public static void shuffle(ArrayList<Integer> list) {

		int size = list.size();

		for (int i = 0; i < size; i++) {

			int index = (int) (Math.random() * size);
			System.out.print("; index= " + index);
			int temp = list.get(index);
			System.out.print("; temp=" + temp);
			list.remove(index);
			list.add(temp);

		}

	}

	public static ArrayList<Integer> randomQuestion(int size,
			ArrayList<Integer> pitanja) {
		ArrayList<Integer> randomQ = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			int index = (int) (Math.random() * size);
			int temp = pitanja.get(index);
			// skidam na mjestu gdje se nalazi
			pitanja.remove(index);
			// dodajem na kraj liste
			pitanja.add(temp);

		}

		return pitanja;

	}

}
