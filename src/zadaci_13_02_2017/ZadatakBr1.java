package zadaci_13_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr1 {
	/*
	 * 1. Pretpostavimo da uplatimo $100 svaki mje
	 * sec na štedni raèun koji ima
	 * godišnju interesnu stopu od 5%. Mjeseèna interesna stopa je stoga 0.05 /
	 * 12 = 0.00417. Nakon prvog 100 * (1 +0.00417) = 100.417. Nakon drugog
	 * mjeseca, (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon treæeg (100 +
	 * 201.252) * (1 + 0.00417) = 302.507 i tako dalje. Napisati program koji
	 * pita korisnika da unese mjeseèni iznos štednje te broj mjeseci nakon
	 * kojeg bi želio znati stanje raèuna.
	 */public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		double svota = 0;
		System.out.println("Unesite broj mjeseci:");
		try { // ostatak programa se nalazi u try/catch bloku, u slucaju da
				// korisnik unese pogresan karakter

			// uzimamo iz konzole broj mjeseci
			int brMjeseci = unos.nextInt();

			// sa petljom spreèavamo negatian unos mjeseci i zahtjevamo ponovan
			// unos
			while (brMjeseci <= 0) {
				System.out
						.println("Br mjeseci ne moze biti negativan, pokusajte ponovo:");
				brMjeseci = unos.nextInt();
			}
			System.out.println("Unesite koliko stavljate na stednju:");
			// uzimamo iz konzole kolicinu novca
			double polog = unos.nextDouble();
			// sa petljom spreèavamo negatian unos novac i zahtjevamo ponovan
			// unos
			while (polog <= 0) {
				System.out
						.println(" Depozit mora biti veci od 0, pokusajte ponovo:");
				polog = unos.nextDouble();

			}
			final double stopa = 0.05;
			// racunamo mjesecnu stopu
			double mjesecnaStopa = (stopa / 12);

			// racunamo stanje za prvi mjesec
			double stanje = polog * (1 + mjesecnaStopa);

			// kroz petlju provlacimo formulu,
			for (int i = 2; i <= brMjeseci; i++) {
				stanje = (polog + stanje) * (1 + 0.00417);

			}
			// ispisujemo u zeljenom formatu
			System.out.printf("Trenutno stanje na racunu je : %.3f%n", stanje);
			
		} catch (InputMismatchException e) { // hvatamo gresku
			System.out.print("Morate unjeti numericke vrjednosti\n");
			ZadatakBr1.main(args); // pozivamo main metodu

		}

	}

}
