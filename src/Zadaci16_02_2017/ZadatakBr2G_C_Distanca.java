package Zadaci16_02_2017;

import java.util.Scanner;

public class ZadatakBr2G_C_Distanca {
	/*
	 * 2. Great circle distance predstavlja udaljenost izme�u dvije ta�ke na
	 * povr�ine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku
	 * �irinu i du�inu dvije ta�ke. Great circle distance izme�u ove dvije ta�ke
	 * mo�e biti izra�unata koriste�i se sljede�om formulom: d = radius * arccos
	 * (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). Napisati program
	 * koij pita korisnika da unese geografsku �irinu i du�inu u stepenima dvije
	 * ta�ke na povr�ini zemlje te mu ispisuje great circle distance. Prosje�ni
	 * radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo
	 * promijeniti u radianse koriste�i se Math.toRadians metodom jer Java
	 * trigonometrijske metode koriste radianse. �irina i du�ina u ovoj formuli
	 * se odnose na zapad i sjever. Koristimo negativne vrijednosti da ozna�imo
	 * istok i jug.
	 */

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		try { // pocetak bloka, za hvatanje greski prilikom unosa iz konzole

			System.out
					.print("Unesite geografske srine i duzine tacaka u stepenima, za koje zelite da izracunamo Great circle distance!"
							+ "\n\nUnesite geografsku sirinu za prvu tacku:");
			// unosi podataka od strane korisnika iz konzole
			double x1 = unos.nextDouble();

			// u while petljama se nalaze granice vrjednosti koje vrse
			// validaciju unosa,
			// greska izaziva upadanje u nju
			while (x1 > 90 || x1 < -90) {
				System.out
						.println("Grografska sirina se nalazi u granicama od 0 do 90 stepeni(tj-90 do 90), pokuasjte ponovo");
				x1 = unos.nextDouble();
			}

			System.out.print("Unesite geografsku duzinu za prvu tacku:");
			double y1 = unos.nextDouble();

			while (y1 > 180 || y1 < -180) {
				System.out
						.println("Geografska duzina je u granicama od -180 do 180\npokusajte ponovo:");
				y1 = unos.nextDouble();
			}

			System.out.print("Unesite geografsku sirinu za drugu tacku:");
			double x2 = unos.nextDouble();
			while (x2 > 90 || x2 < -90) {
				System.out
						.println("Grografska sirina se nalazi u granicama od 0 do 90 stepeni(tj. od-90 do 90), pokuasjte ponovo");
				x2 = unos.nextDouble();
			}
			System.out.print("Unesite geografsku duzinu za drugu tacku:");
			double y2 = unos.nextDouble();
			while (y2 > 180 || y2 < -180) {
				System.out
						.println("Geografska duzina je u granicama od -180 do 180\npokusajte ponovo:");
				y2 = unos.nextDouble();
			}
			unos.close();
			// ispisivanje rezultata pozivanjem metode i prosledjivanje unesenih
			// argumenata
			System.out.println("\n\nGreat Circle distanca iznosi: "
					+ udaljenostTacaka(x1, y1, x2, y2) + " km");

		} catch (Exception e) {
			// hvatanje greske i vracanje na pocetak
			System.out.println("Unos nije validan!");
			ZadatakBr2G_C_Distanca.main(args);
		}
	}

	// metoda sa cetiri parametr, koja racuna udaljenost tacaka
	private static double udaljenostTacaka(double x1, double y1, double x2,
			double y2) {

		// pretvaranje stepeni u radijane
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);

		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);

		// formula za racunanje je odmah u return metode ubacena
		return 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1)
				* Math.cos(x2) * Math.cos(y1 - y2));

	}

}