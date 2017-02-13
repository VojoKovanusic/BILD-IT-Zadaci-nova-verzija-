package zadaci_13_02_2017;

import java.util.Scanner;

public class ZadatakBr4 {
	// 4. Napisati program koji prima 10 cijelih brojeva te ih ispisuje u
	// obrnutom redosljedu.

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite deset brojeva:");
		try { // ostatak programa se nalazi u try/catch bloku, u slucaju da
			// korisnik unese pogresan karakter

		//deklarisemo i instanciramo niz koji ce sadzavati 10 elemenata
			int[] niz = new int[10];
			int redniBoj=0;
			
			//petlja je konstruisana da prvu unesenu vrjednost 
			//ubacuje na mjesto zadnjeg elementa niza i tako redom do kraja
			for (int index = 9; index >= 0; index--) {
				redniBoj++;
				System.out.println(redniBoj+")unesite broj:");
				// uzimamo iz konzole broj 
				niz[index] = unos.nextInt();
				
			}
			System.out.println("Obrnut redosljed unesenih brojeva:");
			//ispis kroz foreach petlju
			for (int elemenat : niz) {
				System.out.print(elemenat + " ");
				
			}

			
		} catch (Exception e) {
			System.out.println("Morate unjeti numericke vrjednosti!");
			ZadatakBr4.main(args);


		}
	}

}
