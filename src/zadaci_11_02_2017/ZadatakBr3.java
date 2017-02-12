package zadaci_11_02_2017;

import java.util.Scanner;

public class ZadatakBr3 {
	/*
	 Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u
	 * rastuæem redosljedu: public static void displaySortedNumbers(double num1,
	 * double num2, double num3). Napisati program koji pita korisnika da unese
	 * tri broja te ispiše ta tri broja u rastuæem redosljedu.
	 */public static void main(String[] args) {
		 
		 //klasa skener omogucuje unos iz konzole
		 Scanner unos = new Scanner(System.in);
System.out.println("Unesite tri broja da ih ispišemo u rastuæem redosljedu.\n"
		+ "Unesite prvi broj:");

// try catch blok za validaciju unosa
try {
	
       //unos iz konzole, tri broja
		double num1 = unos.nextDouble();
		System.out.println("Unesite drugi broj:");
		double num2 = unos.nextDouble();
		System.out.println("Unesite drugi broj:");
		double num3 = unos.nextDouble();
		
	
		//pozivamo metodu, prosledjujemo argumente, unjete od strane korisnika
		displaySortedNumbers(num1, num2, num3);
} catch (Exception e) {
	System.out.println("Greska pri unosu iz konzole, unesite numaricke vrjednosti!");
	ZadatakBr3.main(args);//pozivamo main i vraca se na pocetak zadatka
}
	}

	// mtoda koja prima tri argumenta, za sortiranje brojeva
	public static void displaySortedNumbers(double x, double y, double z) {
		// vrsimo provjeru da li je prvi broj veci od drugog
		if (x > y) {
			// ako jeste vrsimo im zamjnu mjesta
			double temp = x; // pamtimo vrjednost x-a
			x = y; // x-u dajemo sada vrjednost koje ima y
			y = temp; // y dajemo zapamcenu vrjednost sa pocetka operacije
		}

		// vrsimo provjeru da li je drugi broj veci od treceg, ako jeste vrsimo
		// zamjenu
		if (y > z) {
			double temp = y;
			y = z;
			z = temp;
		}

		// ako je doslo do pomjranja, tj da je treci unjeti br(z), zamjenio
		// mjesto sa y,
		// moramo uraditi "reviziju" prvog slucaja
		if (x > y) {
			double temp = x;
			x = y;
			y = temp;
		}
		System.out.println("Rastuci redosled unesenih brojeva:\n"
		+x + " < " + y + " < " + z);
	
	}
}
