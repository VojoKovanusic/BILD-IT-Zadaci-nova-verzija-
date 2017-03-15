package zadaci_11_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5 {
	/*
	 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula
	 * prekida unos) te ispisuje koliko je brojeva bilo iznad ili jednako
	 * prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod prosjeka.
	 * Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti
	 * 100.
	 */

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>(); // u ovau listu ce mo
														// smjestati
														// brojeve koje korisnik
														// unosi
		Scanner unos = new Scanner(System.in); // objekat klase skner omogucava
												// unos iz konzole
		double prosjek = 0;
		double suma = 0;

		System.out
				.println("Unesite neodreðeni broj cijelih brojeva (nula prekida unos), a maksimalno 100 brojeva: ");
		try {
			for (int index = 0; index < 100; index++) {// pelja koja vrti do
														// 100, ako se ne
														// prekine prije

				int broj = unos.nextInt(); // unos  strane korisnika
				while (broj == 0&& index==0) { // ako je prvi unos nula
					System.out.println("Ne mozemo racunati prosjek samo za nulu, unesite vise elemenata.");
					broj = unos.nextInt(); 
					break;
				}
				if (broj == 0) { // nulom prekidamo unos
					break;
				}

				lista.add(broj); // korisnikov unos ubacujemo u listu

				suma += lista.get(index); // sumiramo unesene
											// vrjednosti

			}

		

		// racunanje prosjeka
		prosjek = suma / (lista.size());

		// brojaci prosjeka
		int iznadProsjeka = 0;
		int ispodProsjeka = 0;

		for (int index = 0; index < lista.size(); index++) {

			// ako je elemenat listi veci od prosjeka
			if (lista.get(index) >= prosjek) {
				iznadProsjeka++; // povecavamo vrednost iznadProsjeka za jedan
			}
			if (lista.get(index) < prosjek) { // ako je elemenat u listi manji
												// od prosjeka

				ispodProsjeka++; // povecavamo za jedan variajblu
									// "ispodProsjeka"
			}

		}

		System.out.println("\nUkupno unesenih brojeva=" + lista.size()
				+ ".\nProsjek=" + prosjek
				+ ".\nIznad prosjeka ili jednako prosjeku=" + iznadProsjeka
				+ ".\nIspod prosjeka=" + ispodProsjeka + ".");
		
		} catch (InputMismatchException e) {
			System.out
			.println("Nepravilan unos, vraceni ste na pocetak programa!");
			ZadatakBr5.main(args); // pozivamo main metodu, tj vracamo se an
			// pocetak
		}
		
		
	}

}
