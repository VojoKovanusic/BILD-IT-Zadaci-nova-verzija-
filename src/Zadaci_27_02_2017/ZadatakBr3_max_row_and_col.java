package Zadaci_27_02_2017;

public class ZadatakBr3_max_row_and_col {

	public static void main(String[] args) {

		// instanciramo 2dniz , odredjujemo mu velicinu(4X4)
		int niz1[][] = new int[4][4];

		for (int i = 0; i < niz1.length; i++) {
			for (int j = 0; j < niz1[i].length; j++) {
				// smjestamo slucajnim putem 0 ili 1 u svaki elelmenat niza
				niz1[i][j] = (int) (Math.random() * 2);
				// ispisujemo odmah
				System.out.print(niz1[i][j] + " ");

			}
			System.out.println();
		}
		// deklarisemo pomocne varijable koje ce mo koristit u daljem toku
		// zadatka
		int brojac = 0;
		int max = 0;
		int temp = 0;

		for (int row = 0; row < niz1.length; row++) {
			// resetujemo brojac prije svakog ulaska u novi red
			brojac = 0;
			for (int column = 0; column < niz1.length; column++) {
				// ako se pojavi jedinica u koloni povecavamo brojac za jedan
				if (niz1[row][column] == 1) {
					brojac++;
				}
				// ako je brojac izbrojao vise nego predhodni
				if (brojac > max) {
					// odnda pamtimo taj red
					temp = row;
					// mjenjamo vrjednost maxu, na dosadasnju najvecu vrjednost
					max = brojac;
				}
			}
		}
		System.out.println("Najvise jedinica se nalazi u redu br " + temp);

		// resetujem max
		max = 0;
		// kao u prehdom slucaju, samo sto sada ispitujemo po kolonama
		for (int column = 0; column < niz1.length; column++) {
			// resetujemo brojac prije svakog ulaska u novu kolonu
			brojac = 0;
			for (int row = 0; row < niz1.length; row++) {
				if (niz1[row][column] == 1) {
					brojac++;
				}

				if (brojac > max) {
					temp = column;
					max = brojac;
				}
			}
		}
		System.out.println("Najvise jedinica se nalazi u koloni br " + temp);

	}

}
