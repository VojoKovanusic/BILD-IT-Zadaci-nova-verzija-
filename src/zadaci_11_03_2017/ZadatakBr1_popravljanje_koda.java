package zadaci_11_03_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZadatakBr1_popravljanje_koda {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			// ime izvornog fajla
			String imeFajla = args[0];

			File file = new File(imeFajla);

			Scanner unos = new Scanner(file);

			// varijabla u koju ce mo spremati sav tekst
			String noviTekst = "";

			// go through the file and add all lines to the string
			while (unos.hasNext()) {
				// pri svakoj iteraciji prelazi u novi red
				noviTekst += unos.nextLine() + "\n";

			}
			// popravi greske
			noviTekst = noviTekst.replaceAll("\\)\\s*\\{", ") {");
			noviTekst = noviTekst.replaceAll("\\s*\\{", " {");

			unos.close();

			// zapisati novoformirai tekst u izvorni fajl
			PrintWriter pw = new PrintWriter(new FileOutputStream(file));
			pw.append(noviTekst);
			pw.close();
			System.out.println("Kode je formatiran.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
