package Zadaci_27_02_2017;

public class ZadatakBr1_satnice_radnika {

	/*
	 * (Compute the weekly hours for each employee) Suppose the weekly hours for
	 * all employees are stored in a two-dimensional array. Each row records an
	 * employee’s seven-day work hours with seven columns. For example, the
	 * following array stores the work hours for eight employees. Write a
	 * program that displays employees and their total hours in decreasing order
	 * of the total hours.
	 */

	// instanciran 2d niz u koji ce bizi smjestene satnice zaposlenih
	// posto imamo 8 radnika, broj rovova je 8, a posto je dana 7 ...z col.

	public static int[][] napraviNiz() {

		// 2d niz u koji ce mo smjestati radnike i nihove satnice
		int array[][] = new int[8][7];
		for (int row = 0; row < array.length; row++) {

			for (int column = 0; column < array[row].length; column++) {
				// nasumican izbor sati od 1 do 8
				array[row][column] = (int) (Math.random() * 9);
			}
		}
		return array;
	}

	// metoda kola sluzi za ispisivanje 2dniza koji mu se prosledi
	public static void ispisi(int array[][]) {
		System.out.println("***Satnice uposlenih:***\n"
				+ "\t       po  ut  sr  ce  pe su  ned");
		for (int row = 0; row < array.length; row++) {
			System.out.print("Radnik broj " + row + ") ");
			for (int column = 0; column < array[row].length; column++) {
				System.out.print(array[row][column] + "   ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int niz[][] = napraviNiz();
		ispisi(niz);
		System.out.println();

		// redni broj radnika
		int radnik[] = { 0, 1, 2, 3, 4, 5, 6, 7 };
		// niz u koji ce mo smjestati satnice
		int radnikSati[] = new int[8];
		System.out.println("***UKUPNO SATI***");
System.out.println("\nRadnici sortirani po rednom broju:");
		for (int row = 0; row < niz.length; row++) {
			for (int column = 0; column < niz[row].length; column++) {
				// sabiramo svih sedam satnica za svakog radnika
				radnikSati[row] += niz[row][column];
			}
			System.out.println("Radnik broj " + radnik[row] + ") ima "
					+ radnikSati[row] + "h.");
		}
		System.out.println();
		// ugnjezdena petlja u kojoj sortiramo radnike po broju sati
		for (int i = 0; i < radnikSati.length; i++) {

			for (int j = 0; j < radnikSati.length; j++) {
				// u koliko ranik na mjestu i ima vise sati od rad na mjestu j ,
				// mjenjamo im mjesta
				if (radnikSati[i] > radnikSati[j]) {

					int temp = radnikSati[i];
					radnikSati[i] = radnikSati[j];
					radnikSati[j] = temp;

					int Temp = radnik[i];
					radnik[i] = radnik[j];
					radnik[j] = Temp;
				}

			}

		}
		// ispis rezultata
		System.out.println("Radnici sortirani po broju sati:");
		for (int x = 0; x < radnikSati.length; x++) {
			System.out.println("Radnik broj " + radnik[x] + ") ima " + radnikSati[x]
					+ "h.");

		}
	}
}