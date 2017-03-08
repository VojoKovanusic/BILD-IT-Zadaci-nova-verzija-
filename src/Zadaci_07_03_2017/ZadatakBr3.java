package Zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr3 {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			// omogucavamo kor. da unese podatke u lisu, s nulom zavrsava
			System.out
					.print("Upisite list cjelih brojeva, sa nulom prekdamo unos: ");
			int number = unos.nextInt();
			while (number != 0) {
				list.add(number);
				number = unos.nextInt();
			}
			unos.close();
			System.out.println("Najveci elelmenat unjetih br. je:" + max(list));
		} catch (InputMismatchException e) {
			System.out.println("Nepravilan unos!");
		}

	}

	// Metod vraca najveci clan ArryList<Integer>

	public static Integer max(ArrayList<Integer> list) {

		if (list == null)
			return null;

		if (list.size() == 0)
			return null;

		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++)
			if (list.get(i) > max)
				max = list.get(i);

		return max;
	}

}