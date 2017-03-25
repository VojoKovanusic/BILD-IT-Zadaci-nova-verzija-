package Zadaci_20_03_generics;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*19.7 (Generic binary search) Implement the following method using binary search.
 public static<E extendsComparable<E>>
 intbinarySearch(E[] list, E key)
 */
public class ZadatakBr5_Binary_search {

	public static void main(String[] args) {
		try {
			System.out.println("Unesite broj elenata");
			Scanner unos = new Scanner(System.in);
			int brElemenata = unos.nextInt();
			while (brElemenata < 1 || brElemenata > 25) {
				System.out.println("Unesite brElemenata izmedju 1 i 25");
				brElemenata = unos.nextInt();
			}
			Integer[] niz = nasumicniNiz(brElemenata);
			Arrays.sort(niz);
			System.out.println(Arrays.toString(niz));
			System.out.println("Unesite koji broj trazite: ");
			Integer broj = unos.nextInt();
			System.out.println(binarySearch(niz, broj));
			unos.close();

		} catch (InputMismatchException e) {
			e.getMessage();
		}
	}

	public static Integer[] nasumicniNiz(int brElemenata) {
		Integer[] niz = new Integer[brElemenata];
		for (int index = 0; index < niz.length; index++) {
			niz[index] = (int) (Math.random() * 100);
		}
		return niz;

	}

	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		// postavljamo prvi elemenat kao pocetak, i zadnji kao kraj
		int pocetak = 0;
		int kraj = list.length - 1;
		// pretraga
		while (kraj >= pocetak) {
			// srednji element
			int sredina = (kraj + pocetak) / 2;
			// ako je srednji element manji od trazenog postavi novi pocetak
			if (list[sredina].compareTo(key) < 0)
				pocetak = sredina + 1;
			// ako je srednji element jednak trazenom vraca index srednjeg
			// elementa
			else if (list[sredina].compareTo(key) == 0)
				return sredina;
			else
				// ako je srednji veci od trazenog postavi novu vrjednost za kraj
				kraj = sredina - 1;
		}
		// ako ne nadje trazeni elemenat
		return -1;
	}
}
