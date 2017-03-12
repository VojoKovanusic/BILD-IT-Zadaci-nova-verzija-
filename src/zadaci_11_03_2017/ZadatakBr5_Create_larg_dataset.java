package zadaci_11_03_2017;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;

public class ZadatakBr5_Create_larg_dataset {

	public static void main(String[] args) {

		upisiPodatkeUfajl();
	}

	private static void upisiPodatkeUfajl() {
		String fileName = " Salary.txt.";
		File fajl = new File(fileName);
		// ako fajl ne postoji
		if (!fajl.exists()) {
			// pravim putanju
			Path path = Paths.get(fileName);
			{

				try {
					// pravim fajl
					Files.createFile(path);
					System.out.println("Upravo je napravljen fajl Salary.txt.");

					// smjestamo u niz tri vrte predavaca
					String rang[] = { "assistant", "associate", "full" };

					// sav ispis ce biti spremljen u ovu varijablu
					String noviTekst = "";

					/*
					 * idemo kroz for petlju 1000 puta i ispisujemo redom imena
					 * i prezmena sa rednim brojevima i pozivamo metodu< za
					 * nasumcan ispis plate u trazenim granicama
					 */
					for (int i = 1; i <= 1000; i++) {

						noviTekst += "Ime" + i + " Prezime" + i + plate(rang)
								+ "\n";

					}

					// sav ispis je spremljen u fajl uz pomoc PrintWriter-a
					PrintWriter pw = new PrintWriter(new FileOutputStream(fajl));
					pw.append(noviTekst);
					pw.close();

				} catch (Exception e) {
					e.getMessage();

				}

			}

		}

	}

	// metoda vraca nasumicno i predavaca i njegovu platu zavisno od njegovog
	// "zvanja"
	private static String plate(String[] rang) {
		int index = (int) (Math.random() * 3);
		// da ispissemo u zeljenom obliko koristim:
		DecimalFormat df = new DecimalFormat("#.##");

		if (index == 0) {
			double x = 50000 + (Math.random() * 30000);
			return " " + rang[0] + " " + df.format(x) + " KM";
		}
		if (index == 1) {
			double x = 60000 + (Math.random() * 50000);
			return " " + rang[1] + " " + df.format(x) + " KM";

		} else {
			double x = 75000 + (Math.random() * 55000);
			return " " + rang[2] + " " + df.format(x) + " KM";
		}

	}

}
