package zadaci_09_02_2017;

public class ZadatakBr1 {

	// 1. Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od
	// godine 101 do 2100, odvojene jednim spaceom. Takoðer ispisati i ukupan
	// broj prijstupnih godina u ovom vremenskom periodu.

	public static void main(String[] args) {
		int brojac = 0; //deklarisali brojac i dali mu vrednost 0
		
		//petlja ide po jednu godinu od 101 godine do 2100 
		for (int godina = 101; godina <= 2100; godina++) {
        // godie je prestupna ako je djeljiva sa cetiri i (nije djeljiva sa 100 ili jeste sa 400)
			if (((godina % 4 == 0) && (godina % 100 != 0)) || (godina % 400 == 0)) {
				System.out.print(godina + " "); //ispisujemo godine u jednom redu
				brojac++; //kada ispuni uslov prestupne godine, povecavamo brojac za 1
				if (brojac % 10 == 0) { // na svaku 10u godinu prelazimo u novi red
					System.out.println();
				}
			}

		}
		
		System.out.println("\nUkupan broj prestupnih godina u periodu od 101 do 2100 je "+brojac+".");
	}
}