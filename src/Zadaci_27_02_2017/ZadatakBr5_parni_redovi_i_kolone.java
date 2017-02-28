package Zadaci_27_02_2017;


public class ZadatakBr5_parni_redovi_i_kolone {

	public static void main(String[] args) {
		// instanciramo 2d niz u koji ce mo smjestati nasumicno nule i jedinice
		int niz1[][] = new int[6][6];
		System.out.println("\t*** Matrica 6 x 6 ***\n");
		for (int row = 0; row < niz1.length; row++) {
			for (int column = 0; column < niz1[row].length; column++) {
				// dodjeljujemo elementima matrice nasumicno vrjednost 1 ili0
				niz1[row][column] = (int) (Math.random() * 2);
				// ispisuejmo ih odmah
				System.out.print(niz1[row][column] + " ");
			}
			System.out.println();
		}

		int brojac = 0;
		System.out.print("\nRedovi sa parnim brojem jedinica su: ");
		for (int row = 0; row < niz1.length; row++) {

			for (int column = 0; column < niz1.length; column++)
				// kada je emenat==1, povecavamo brojac
				if (niz1[row][column] == 1)
					brojac++;
			// ako je brojac djeliv sa 2, paran je ...ispisujemo koji je red u
			// pitanju..a u slucaju da su sve nule nece ispisati red
			if (brojac % 2 == 0 && brojac!=0 )
				System.out.print(row + " ");
			brojac = 0;

		}

		// kao u prehdom slucaju, samo sto sada ispitujemo po kolonama
		System.out.print("\nKolone sa parnim brojem jedinica su: ");
		for (int column = 0; column < niz1.length; column++) {

			for (int row = 0; row < niz1.length; row++)
				if (niz1[row][column] == 1)
					brojac++;

			if (brojac % 2 == 0&& brojac!=0)
				System.out.print(column + " ");
			brojac = 0;

		}

	}

}
