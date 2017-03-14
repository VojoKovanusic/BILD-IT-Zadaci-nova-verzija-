package zadaci_13_03_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ZadatakBr5_SortArrayList {
	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {
		System.out
				.println("Unesite vrjdnost do kojeg broja da bude nasumicno isisana lista:");
		int velicina = unos.nextInt();
		while (velicina < 1) {
			System.out.println("Unesite velicinu vecu od 0:");
			velicina = unos.nextInt();
		}
		ArrayList<Number> lista = napraviNasumicanNiz(velicina);
		System.out.println(lista.toString());
		sortiraj(lista);
	}

	private static void sortiraj(ArrayList<Number> lista) {
		ArrayList<Integer> novaLista = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++) {
			novaLista.add((Integer) lista.get(i));

		}
		Collections.sort(novaLista);

		System.out.println(novaLista.toString());

	}

	private static ArrayList<Number> napraviNasumicanNiz(int velicina) {
		ArrayList<Number> lista = new ArrayList<>();

		Random random = new Random();

		for (int index = 0; index < velicina; index++) {

			lista.add(random.nextInt(velicina));
		}
		return lista;
	}
}
