package zadaci_10_02_2017;

import java.util.Scanner;

public class ZadatakBr3 {
	/*
	 * 3. Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi
	 * elementi na istim pozicijama jednaki. Napisati metodu koja vraæa true
	 * ukoliko su nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi
	 * header:
	 * 
	 * public static boolean equals(int[ ] niz1, int[ ] niz2)
	 * 
	 * Napisati testni program koji pita korisnika da unese dva niza cijelih
	 * brojeva te provjerava da li su striktno identièni.
	 */
	public static void main(String[] args) {
		// objekat tipa Scanner kako bih omoguæili korisniku unos iz konzole
		Scanner unos = new Scanner(System.in);

		System.out
				.println("Unesite dva niza kako bih provjerili da li su indenticni!");

		System.out.println("Za pocetak unesite koju ce duzinu imati nizovi:");

		// try catch blok omogucava da uhvatimo gresku u slucaju da korisnike ne
		// unese numericku vrednost iz konzole, te da samo vrati program na
		// pocetak
		try {
			int duzinaNiza = unos.nextInt();
			while (duzinaNiza <= 0) {
				System.out
						.println("Duzina niza mora biti veca od 0, da bih mogli upisati vrjednosti u njega\n"
								+ "pokusajte ponovo unjeti duzinu niza:");

				duzinaNiza = unos.nextInt();
			}
			int niz1[] = new int[duzinaNiza];
			int niz2[] = new int[duzinaNiza];// pravimo dva objekat, tj dva
												// prazan
												// 1d niza ,
			// duzine 5 elemenata

			for (int i = 0; i < duzinaNiza; i++) { // petlja koja omogucava da
				// korisnik"napuni"niz sa cjelobrojnim
				// vrjednostima
				System.out.println("Unesite cjelobrojnu vrjednost br. "
						+ (i + 1) + ":");
				niz1[i] = unos.nextInt();
			}
			System.out.println("Unesite vrednosti za drugi niz: ");
			for (int i = 0; i < duzinaNiza; i++) { // petlja koja omogucava da
				// korisnik"napuni"niz sa cjelobrojnim
				// vrjednostima
				System.out.println("Unesite cjelobrojnu vrjednost br. "
						+ (i + 1) + ":");
				niz2[i] = unos.nextInt();

			}

			// pozivamo metodu i prosledjujemo joj argumente, i ispisujemo
			// rezultat
			System.out.println("Da li su uneseni nizovi indenticni?\nOdgovor :"
					+ equals(niz1, niz2));
			
			
		} catch (Exception e) {// u slucaju da uhvati gresku
			System.out
					.println("Korisnièe,niste unjeli trazenu vrednosti, pokusajte ponovo!\n");
			ZadatakBr3.main(args); // pozivamo main
									// metodu tj vracamo se na pocetak
		}
	}

	public static boolean equals(int[] niz1, int[] niz2) {

		for (int i = 0; i < niz2.length; i++) {
			if ((niz1[i] != niz2[i])) { // ako neki od elemnata niza nisu isti
				return false; // vraca false
			}

		}
		return true; // u koliko je metoda uspjela proci sve provjere, znaci da
						// su nizovi indenticni,
						// pa vracamo true
	}
}
