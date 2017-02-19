package Zadaci_18_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

/*4. Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu)
 *  te ispiše korisniku koliko je to u godinama i danima. 
 *  Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.
 */public class ZadatakBr4_min_u_dane_i_sate {

	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			System.out
					.println("Unesite vrjeme u minutama, da izracunamo koliko je to dana i godina:");
			long ukupno_minuta = unos.nextLong();
			while (ukupno_minuta <= 0) {
				System.out
						.println("Vrjeme ne moze biti nula i manje od nje, pokusajte opet:");
				ukupno_minuta = unos.nextLong();
			}
			unos.close();
			
			//dobijemo ukupno sati
			
			long sati = ukupno_minuta / 60;
			
			//ukupno dana dobijemo kada ukupno sati podjelimo sa 24
			long ukupnoDana = sati / 24;
			//trenutno dana dobijemo kada odbijemo godine uz pomoc modula365
			long dana=ukupnoDana%365;
			//godine dobijemo kada ukupno dana podjelimo sa 365
			long godina = ukupnoDana / 365;
			

			System.out.println(ukupno_minuta + " minuta je " + dana
					+ " dan(a) i " + godina + " god.");
		} catch (InputMismatchException e) {// hvatamo nepravilan unos
			System.out
					.println("Program prma samo cjelobrojen vrjednosti, tipa long!\nPokusajte opet.\n");
			ZadatakBr4_min_u_dane_i_sate.main(args);
		}
	}

}
