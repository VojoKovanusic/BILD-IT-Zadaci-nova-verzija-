package Zadaci28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5_Lokacija {

	public static void main(String[] args) {
		try {// sav main se nalazi u traj kec bloku, da uhvatimo potencijalnu
				// nepravilnost prlikom upisa :)
			Scanner unos = new Scanner(System.in);
			System.out
					.print("Unesite koji broj kolona i redova zelite da matrica ima.\n"
							+ "Unesite prvo red: ");
			int red = unos.nextInt();
			while (red < 1) {
				System.out.println("Unesite broj veci od 0:");
				red = unos.nextInt();
			}
			int kolona = unos.nextInt();
			while (kolona < 1) {
				System.out.println("Unesite broj veci od 0:");
				kolona = unos.nextInt();
			}
			double[][] matriks = new double[red][kolona];

			System.out.println("Enter the array:");
			for (int i = 0; i < matriks.length; i++) {
				for (int j = 0; j < matriks[i].length; j++) {
					matriks[i][j] = unos.nextDouble();
				}
			}
			// instanciramo objekat potivanjem metode koja vraca podatak tipa
			// Location
			Location location = Location.locateLargest(matriks);

			System.out.println("Najveci uneseni elemenat je "
					+ location.maxVrjednost + ", a nalazi se u redu br: "
					+ location.red + " i koloni br: " + location.kolona);
			unos.close();
		} catch (InputMismatchException e) {
			System.out.println("Grska pri unos, prekid programa.");
		}
	}

}

// klasa sa tri atributa redom, kolonom i max vrednoscu
class Location {

	public int red;
	public int kolona;
	public double maxVrjednost;

	// konstrukt koji nam treba u nastavku kao povratni tip
	public Location(int red, int kolona, double maxVrjednost) {
		this.red = red;
		this.kolona = kolona;
		this.maxVrjednost = maxVrjednost;
	}

	// Metoda koji pronalazi najveci broj u matrici i njegovu lokaciju, te
	// podatke vraca kao objekat tipa Location

	public static Location locateLargest(double[][] a) {

		int maxRed = 0;
		int maxKolona = 0;
		double max = a[maxRed][maxKolona];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					maxRed = i;
					maxKolona = j;
					max = a[i][j];
				}
			}
		}
		return new Location(maxRed, maxKolona, max);
	}
}