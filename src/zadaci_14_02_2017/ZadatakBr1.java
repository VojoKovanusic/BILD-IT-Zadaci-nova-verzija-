package zadaci_14_02_2017;

import java.util.Scanner;

/*1. Napisati program koji uèitava iznos investicije,
 *  godišnju interesnu stopu i broj godina te vraæa buduæu vrijednost investicije
 *   koristeæi se sljedeæom formulom: 
 *   buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 *   Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 
 *   kao broj godina program vam vraæa 1032.98 kao buducu vrijednost investicije.
 */public class ZadatakBr1 {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		try {
			System.out.println("Unesite vrjednost investicije:");
			double iznosInvesiticije = unos.nextDouble();

			while (iznosInvesiticije <= 0) {
				System.out
						.println("Investicija mora biti veca od 0!!\npokusajte opet:");
				iznosInvesiticije = unos.nextDouble();
			}

			System.out.println("Unesite godisnju interesnu stopu:");
			double gis = unos.nextDouble();

			while (gis <= 0) {
				System.out
						.println("Stopa mora biti veca od 0!!\npokusajte opet sa i. stopom::");
				gis = unos.nextDouble();
			}
			System.out
					.println("Unesite broj godina , nakon koje zelite izracunati vrjednost vase investicije:");
			int god = unos.nextInt();

			while (god <= 0) {
				System.out
						.println("Godine ne mogu biti manje od 1, pokusajte ponovo sa godinama:");
				god = unos.nextInt();
			}
			unos.close();
			
			//mjesecnu stopu dobijamo, kada godisnju podjelimo sa 12 (mjeseci)
			double mjesecnaInteresnaStopa = gis / 12;
			
         //formuula za racunanje buduce investicije
			double buducaVrednostInvesticije = iznosInvesiticije
					* Math.pow((1 + mjesecnaInteresnaStopa / 100), (god * 12));
			System.out.printf(

			"Poslje %d god. vas investicija ima vrjednost od: %5.2f", god,
					buducaVrednostInvesticije);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Greska pri unosu, pokusajte opet od pocetka\n"
					+ "");
			ZadatakBr1.main(args);
		}
	}
}
