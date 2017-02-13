package zadaci_13_02_2017;

import java.util.Scanner;

public class ZadatakBr3 {
	// 3. Napisati program koji pita korisnika da unese 2 stringa te ispisuje
	// najveæi zajednièki prefix za ta dva stringa, ukoliko isti postoji. Na
	// primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai"
	// i "Dobrodošli u Vankuver" program treba da ispiše: Najveæi zajednièki
	// prefix za dva stringa je "Dobrodošli u".

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("unesite prvi string:");


		// uzimamo iz konzole podatke od korisnika
		String s1 =unos.nextLine();
		System.out.println("unesite drugi string:");
		
		String s2 =unos.nextLine();
		
		//unesene Stringove stavljamo u nizove koje u sebi sadrze char vrjednosti
			char[] char1 = s1.toCharArray();
			char[] char2 = s2.toCharArray();
			
			//petlja ide koliko ima karaktera kraci string, prolazimo kroz nizove  i ispisujemo sve dok ne naidjemo 
			//na prvi karakter koji nije isti
			
			for (int i = 0; i < kraciString(s1, s2); i++) {
				if (char1[i] != char2[i]) {
					if(i==0)System.out.println("Uneseni stringovi nemaju isi prvi karakter");
					break;
				}
				if (char1[i] == char1[i]) {
					System.out.print(char1[i]);

				}

			}
	}
//vraca duzinu kraceg stringa
	public static int kraciString(String s1, String s2) {
		if (s1.length() > s2.length())
			return s2.length();
		return s1.length();
	}
}
