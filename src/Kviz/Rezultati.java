package Kviz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Rezultati {

	public static void main(String[] args) {

		// redni broj radnika
		String radnik[] = { "simo", "marko", "nemanja", "dragi", "filip",
				"marko" };
		// niz u koji ce mo smjestati satnice
		int radnikSati[] = { 5, 7, 4, 1, 6, 4 };

		// ugnjezdena petlja u kojoj sortiramo radnike po broju sati
		for (int i = 0; i < radnikSati.length; i++) {

			for (int j = 0; j < radnikSati.length; j++) {
				// u koliko ranik na mjestu i ima vise sati od rad na mjestu j ,
				// mjenjamo im mjesta
				if (radnikSati[i] > radnikSati[j]) {

					int temp = radnikSati[i];
					radnikSati[i] = radnikSati[j];
					radnikSati[j] = temp;

					String Temp = radnik[i];
					radnik[i] = radnik[j];
					radnik[j] = Temp;
				}

			}

		}
		// ispis rezultata
		System.out.println("Takmicari sortirani po broju bodova:");
		for (int x = 0; x < radnikSati.length; x++) {
			if (radnikSati[x] == 0)
				break;
			else
				System.out.println("Radnik broj " + radnik[x] + ") ima "
						+ radnikSati[x] + "h.");

		}
	}
}