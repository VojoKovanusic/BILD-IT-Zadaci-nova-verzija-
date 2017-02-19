package Zadaci_18_02_2017;

import java.text.SimpleDateFormat;

public class ZadatakBr3_Milisekunde {

	public static void main(String[] args) {
		/*
		 * 3. Ako pozovemo metodu System.currentTimeMillis() dobijemo broj
		 * milisekundi od 1. januara 1970 do trenutka pozivanja metode. Napisati
		 * program koji ispisuje trenutaèni datum i vrijeme u formatu
		 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
		 */
		//dobijamo trenutno vrjeme u milisekundama
		long milisecunde = System.currentTimeMillis();

		// sekunda ima 1000 milisekundi, potom odbijamo minute sa % 60
		int sekunde = (int) (milisecunde / 1000) % 60;
		// minut  ima 1000 milisekundi, potom odbijamo i minute sa % 60
		int minute = (int) ((milisecunde / (1000 * 60)) % 60);
		int sati = 1 + (int) ((milisecunde / (1000 * 60 * 60)) % 24);

		SimpleDateFormat kalendar = new SimpleDateFormat("dd. MMM, yyyy");

		System.out.println("Trenutni datum i vrijeme: "
				+ kalendar.format(milisecunde) + " " + sati + ":" + minute
				+ ":" + sekunde);

	}
}
