package zadaci_13_02_2017;

public class ZadatakBr2 {
	/*
	 * 2. Napisati program koji simulira nasumièno izvlaèenje karte iz špila od
	 * 52 karte. Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5,
	 * 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta (Srce, Pik,
	 * Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke.
	 * 
	 */public static void main(String[] args) {

		// niz koji sadrzi sve potencijalne karte
		String katre[] = { "A", "2", "3", "4", "5", "6", "7", "8", " 9", "10",
				"J", "Q", "K" };
		
		// niz koji sadrzi sve potencijalne boje
		String boja[] = { "Srca", "Pika", "Djeteline", "Kocke" };

		// random biranje indeksa za karte od 0 do 12
		int index = (int) ((Math.random() * 13));
		
		// random biranje indeksa za karte od 0 do 3
		int i = (int) (Math.random() * 4);

		// ispis
		System.out.println("Karta koju ste izvukli je " + katre[index]
				+ " u znaku " + boja[i] + ".");

	}

}
