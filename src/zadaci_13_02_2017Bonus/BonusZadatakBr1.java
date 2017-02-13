package zadaci_13_02_2017Bonus;

import java.util.ArrayList;
import java.util.Scanner;

public class BonusZadatakBr1 {
	/*
	 * Napisati jednostavni konzolni kalkulator. Kalkulator treba da podržava
	 * sljedeæe operacije:
	 * 
	 * Sabiranje Oduzimanje Množenje Djeljenje Korjenovanje (opcionalno)
	 * Kvadriranje (opcionalno) Modulo (opcionalno)
	 * 
	 * Znate kako kalkulatori rade - nema se tu šta objašnjavati.
	 */

	public static void main(String[] args) {

		meni();
		Scanner unos = new Scanner(System.in);
		try {// try catch blok da uhvatimo nepravila unos iz konzole
			int opcija = unos.nextInt();
			// ako nije izabran dobar unos upada u petlju
			while (opcija >= 8 || opcija < 1) {
				System.out.println("Niste izabrali opciju od 1 do 8, pokusajte ponovo.");
				meni();
				opcija = unos.nextInt();
			}

			// kretanje kroz meni
			switch (opcija) {
			case 1:
				System.out
						.println("Unesite brojeve koje zelite sabrati, 0 prekida unos:");
				double sum = 0;
				while (true) {
					double br = unos.nextDouble();
					sum += br;
					if (br == 0)
						break;
				}

				System.out.println("Zbir unesenih brojeva je:" + sum);
				BonusZadatakBr1.main(args); // na kraju operacije vraca s ena
											// pocetak, tj poziva main metodu

			case 2:
				System.out.println("Unesite dva broja koja zelite oduzeti:");

				double br = unos.nextDouble();
				double br1 = unos.nextDouble();
				// da bi sprjecili greske kod negativnih unosa moramo staviti u
				// abs
				double razlika = Math.abs(br) - Math.abs(br1);
				System.out.println("Razlika unesenih brojeva je:" + razlika);
				break;
			case 3:
				System.out
						.println("Unesite brojeve koje zelite pomnoziti, 0 prekida unos:");
				sum = 1;
				br = unos.nextDouble();
				while (br != 0) {
					sum *= br;
					br = unos.nextDouble();

				}

				System.out.println("Proizvod unesenih brojeva je:" + sum);
				break;
			case 4:
				System.out.println("Unesite dva broja koja zelite podjeliti:");

				br1 = unos.nextDouble();
				double br2 = unos.nextDouble();
				while(br2==0){
					System.out.println("Pobogu, djeljenje sa nulom nije moguce, unesite broj razlicit od nule.");
				br2 = unos.nextDouble();}
				
				System.out.println((br1 / br2));
				break;

			case 5:
				System.out.println("Unesite broj koje zelite korjenovati:");
				double broj = unos.nextDouble();
				if(broj<0){
					System.out.println("Korjen negativnog broja je imaginaran, unesite veci br od nule:");
					broj = unos.nextDouble();
				}
				double korjen = Math.sqrt(broj);

				System.out.println("Korjen unesenog broja je:" + korjen);

				break;
			case 6:
				System.out.println("Unesite broj koje zelite kvadrirati:");

				broj = Math.pow(unos.nextDouble(), 2);

				System.out.println("Kvadrat unesenog broja je:" + broj);

				break;
			case 7:
				System.out
						.println("Unesite dva broja da nadjemo ostatak(modulo)djeljenja :");

				broj = unos.nextDouble();
				System.out.println("Unesite drugi broj:");
				br = unos.nextDouble();
				while(br==0){
					System.out.println("Djeljenje sa nulom nije moguce,nema ni ostatka!\nUnesite broj razlicit od nule.");
				br = unos.nextDouble();}

				double modulo = ((broj % br));

				System.out.println("Modulo unesenih brojeva je:" + modulo);

				break;

			}
		} catch (Exception e) {
			System.out
					.println("Unesite numericku vrjednost, ovo je kalkulator nije pisaca masina!!!");
			BonusZadatakBr1.main(args);

		}

	}

	// metoda koji nudi ispis menija
	public static void meni() {
		System.out.println("Konzolni kalkulator podržava sljedeæe operacije(izaberite neku):"
				+ "\n1:Sabiranje\n2:Oduzimanje\n3:Množenje\n4:Djeljenje"
				+ "\n5:Korjenovanje" + "\n6:Kvadriranje\n7:Modulo");
	}

}
