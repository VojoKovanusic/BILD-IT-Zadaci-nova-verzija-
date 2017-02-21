package Mini2_Craps_CreditCards;

public class Craps {

	public static void main(String[] args) {
		// boolean vrjednost pomocu koje kontrolisemo prekid programa
		boolean krajIgre = false;

		// dakle petlja radi dok je kraj igre nastiman na false
		while (!krajIgre) {

			// nasumicno izvlacimo dva broja od 1 do 6, koji glume kocke
			int dice1 = (int) (1 + Math.random() * 6);
			int dice2 = (int) (1 + Math.random() * 6);
			int rezultat = dice1 + dice2;

			// ako daju zbir 2 , 3 ili 12, poraz
			if (rezultat == 2 || rezultat == 3 || rezultat == 12) {
				System.out.println("Kocka je bacena,dobili ste: " + dice1
						+ " + " + dice2 + " = " + rezultat
						+ " !\ncarps, IZGUBILI STE!\n");
				// prekidamo igru
				krajIgre = true;

				// ako daju zbir 7 ili 11 poraz
			} else if (rezultat == 7 || rezultat == 11) {
				System.out.println("Kocka je bacena,dobili ste: " + dice1
						+ " + " + dice2 + " = " + rezultat
						+ " !\nnatural, POBJEDILI STE.\n");
				// prekidamo igru
				krajIgre = true;
			}
			// ako se nsu ispunila predhodne dvije selekcije, ulazimo:
			else {
				System.out.println("Kocka je bacena, dobili ste brojeve: "
						+ dice1 + " + " + dice2 + " = " + rezultat
						+ " !\nNastavljamo dalje,dok ne dobijete broj: "
						+ rezultat + ".\n");
				// sada rezultat postaje cilj
				int cilj = rezultat;

				// opet petlju kontrolise ista boolean vrjednost, koju smo
				// smjestili u naredne dvije selekcije, dok nas treca(else)
				// neprestano
				// gura u petlju

				while (!krajIgre) {

					// ponovo bacamo kocke
					dice1 = (int) (1 + Math.random() * 6);
					dice2 = (int) (1 + Math.random() * 6);
					// dobijamo novi rezulat
					rezultat = dice1 + dice2;

					// provjeravamo
					if (rezultat == 7) {
						System.out.println("Dobili ste brojeve: " + dice1
								+ " + " + dice2 + " = " + rezultat
								+ ".\nIZGUBILI STE!\n");
						// u slucaju da upadnemo, izlazimo iz obe petlje
						krajIgre = true;

					} else if (rezultat == cilj) {
						System.out.println("Dobili ste brojeve: " + dice1
								+ " + " + dice2 + " = " + rezultat
								+ ".\nPOBJEDILI STE!\n");
						// u slucaju da upadnemo, izlazimo iz obe petlje
						krajIgre = true;

					}

					else {
						System.out.println("Dobili ste brojeve: " + dice1
								+ " + " + dice2 + " = " + (dice1 + dice2)
								+ "\nbacaju se kocke ponovo.\n");

					}
				}
			}

		}
	}
}
