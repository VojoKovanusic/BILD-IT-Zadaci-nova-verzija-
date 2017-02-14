package zadaci_14_02_2017;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZAdatakBr5BrzinaAviona {
	/*
	 *  
	 */
	public static void main(String[] args) {
		try {
			Scanner unos = new Scanner(System.in);
			System.out
					.println("Da bi izracunali minimalnu duzinu piste potrebne da avion uzleti,"
							+ "\nunesite trazene podatke u numerickom obliku:");
			System.out.println("Unesite brznu kretanja aviona [m/s]:");
			double v = unos.nextDouble();
			while (v <= 0) {
				System.out
						.println("Brznu kretanja aviona mora biti veca od 0!!\npokusajte opet sa brzinom:");
				v = unos.nextDouble();
			}

			System.out.println("Unesite ubrzanje avionva [m/s^2]:");
			double a = unos.nextDouble();
			while (a <= 0) {
				System.out
						.println("Ubrzanje aviona mora biti veca od 0!!\npokusajte opet sa ubrzanjem:");
				a = unos.nextDouble();
			}

			unos.close();

			// formula za racunanje duzine
			double duzina = (v * v) / (2 * a);
			DecimalFormat df = new DecimalFormat("#.000");

			System.out
					.print("Minimalnu duzinu piste potrebne da avion koji se krece brzinom\n"
							+ v
							+ "[m/s] i ima ubrzanje od "
							+ a
							+ "[m/s^2] uzleti je:" + df.format(duzina) + " m.");

		} catch (InputMismatchException e) {
			System.out
					.println("\nProgram prima samo numericke vrjednosti,\nvraceni ste na pocetak programa:");
			ZAdatakBr5BrzinaAviona.main(args);
		}

	}

}
