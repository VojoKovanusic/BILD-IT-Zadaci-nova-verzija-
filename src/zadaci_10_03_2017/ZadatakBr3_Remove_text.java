package zadaci_10_03_2017;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ZadatakBr3_Remove_text implements Serializable {
	static Scanner unos = new Scanner(System.in);
	// upis i ispis iz fajla je uradjeno pomocu serilizacije
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException {

		napraviFajl();
		izbrisiTekst("fajl.txt");
	}

	// metoda uz pomoc koje pravimo fajl i odmah je zapisan tekst, radi probe
	public static void napraviFajl() {

		String fileName = "fajl.txt";
		File fajl = new File(fileName);

		if (!fajl.exists()) {
			Path path = Paths.get(fileName);
			{
				try {
					Files.createFile(path);
					System.out.println("Upravo je napravljen fajl!");

					ObjectOutputStream os = new ObjectOutputStream(
							new FileOutputStream(fileName));
					// tekst koji je zapisan u fajl
					String str = "Write a program that removes all the occurrences of a specified string from a text file.\n"
							+ "For example, invoking\n"
							+ "java Exercise12_11 John filename";
					os.writeObject(str);
					os.close();

				} catch (Exception e) {
					e.printStackTrace(System.out);

				}

			}
		}
	}

	// metoda koj prosledjuejmo ime fajla, kao i rjec koju zelimo obrisati
	public static void izbrisiTekst(String imeFajla) throws IOException {
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					imeFajla));
			// izcitavamo objekat str iz fajla
			String str = (String) is.readObject();
			
			System.out.println("Tekst u fajlu je:\n" + str);
			
			System.out.println("\nNapisite dio koji zelite obrisati:");
			String obrisi = unos.nextLine();
			
			// ako objekat str sadrzi u sebi unesenu rjec ili tekst brise ga
			if (str.contains(obrisi)) {

				str = str.replace(obrisi, "");
				System.out.println("nakon brisanja\"" + obrisi+"\" iz teksta"
						+ "on izgleda ovako:\n" + str);

			}
			// u suprotnom nas obavjestava
			else {
				System.out
						.println("\""+obrisi+"\" se ne nalazi u tekstu\n"
								+ str);
			}
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream(imeFajla));
			// snimamo sve promjene koje smo ancinili na objektu str
			os.writeObject(str);
			is.close();
			os.close();

		} catch (ClassNotFoundException e) {// hvata gresku u slucaju da ne naje
											// objekat str u fajlu
			e.getMessage();
		}
	}

}