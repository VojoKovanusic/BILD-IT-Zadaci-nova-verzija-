package zadaci_13_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class ZadatakBr3_URL_nova_verzija {

	static Scanner unos = new Scanner(System.in);
	public static void main(String[] args) {
		try {

			// Uzmamo od korisnika neophodne podatke
			System.out.print("Unesite godinu u rangu od 2001 do  2009: ");
			String godina = unos.nextLine();
			int god = Integer.parseInt(godina);
			while (god < 2001 || god > 2009) {
				System.out.println("Unesite razdoblje od 2001 do 2009");
				godina = unos.next();
				god = Integer.parseInt(godina);
			}

			System.out.print("Unesite pol(W-za zensko, a M-za musko): ");
			String pol = unos.next();

			
			  while (!verifikacijaPola(pol)) {
			  
			  System.out.print("Unesite pol(W-za zensko, a M-za musko): "); pol
			  = unos.next();
			  
			  }
			
			System.out.print("Unesite ime: ");
			String ime = unos.next();
		
			// objekat ArrayList u koji ce mo spremati izcitane podatke iz datok
			// url-a
			ArrayList<String> list = new ArrayList<>();

			// izcitavanje teksta iz fajla

			java.net.URL url = new java.net.URL(
					"http://www.cs.armstrong.edu/liang/data/babynamesranking"
							+ godina + ".txt");

			// pomocu skenera i urla vrsimo izcitavanje podataka po linijama
			unos = new Scanner(url.openStream());

			while (unos.hasNext()) {
				for (int i = 0; i < 5; i++) {
					list.add(i, unos.next());
				}

				// ispis podatka zavisno od imena i godine
				if (list.get(getPol(pol)).equals(ime)) {
					System.out.println(ime + " je rangirano na " + list.get(0)
							+ " mjestu " + godina + " god.");
					System.exit(0);
				}
				list.clear();
			}
			System.out.println("Uneseno ime " + ime + " nije bilo polularno u "
					+ godina + " god.");
			
		} catch (Exception e) {
			System.out.println("Greska, prekid programa");
			System.exit(0);
		}
	}

	private static boolean verifikacijaPola(String pol) {
		if (pol == "W")
			return true;
		if (pol == "M")
			return true;

		return true;
	}

	// metoda koja nam vraca index u nizu za odabrni pol
	public static int getPol(String pol) {
		if (pol.equals("M"))
			return 1;
		else
			return 3;
	}
}
