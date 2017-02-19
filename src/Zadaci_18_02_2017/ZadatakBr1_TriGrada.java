package Zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZadatakBr1_TriGrada {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out
				.println("Unesite tri grada, a program ce ih sortirati po abecednom redu:");
		// unesene podatke ce mo smjestiti u listu
		ArrayList<String> lista = new ArrayList<>();

		// petlja koja vrti 3 puta
		for (int i = 1; i <= 3; i++) {
			System.out.println("Unesite grad br. " + i + ":");
			String grad = unos.nextLine();
			while (!validacija(grad)) {
				System.out
						.println("Niste unjeli validan grad, pokusajte ponovo!");
				grad = unos.nextLine();
			}
			lista.add(grad);
		}
		unos.close();

		// sortiranje liste je izvrseno pomocu kolekcija
		Collections.sort(lista);
		System.out.println("\nNakon sortiranja:");
		// ispis
		for (String string : lista) {
			System.out.println(string);

		}
	}
//validacia, da li su uneseni karakteri slovam i da li ej prvo slovo veliko
	public static boolean validacija(String grad) {
		grad = grad.replaceAll(" ", "");
		for (int i = 0; i < grad.length(); i++) {
			if (!Character.isUpperCase(grad.charAt(0))) {
				System.out.println("Imena gradova morate upisati slovima, a pocetn omora biti velikio!");
				return false;
			}
			if (!Character.isAlphabetic(grad.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
