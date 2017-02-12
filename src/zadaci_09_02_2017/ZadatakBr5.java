package zadaci_09_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5 {
	/*
	 * 5. Napisati metodu koja prima jedan argument te simulira bacanje novèiæa
	 * toliko puta. Nakon što se simulacija završi, program ispisuje koliko puta
	 * je novèiæ pokazao glavu a koliko puta pismo.
	 */
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out
				.println("Unesite broj, koliko puta zelite da porogram simulira bacanje novèiæa");
		// omogucujemo korisniku da unese iz konzole broj bacanja
		try{
		int brojBacanja = unos.nextInt();
		
		//validacija, da petlja vrti dok unos ne bude validan
		while (brojBacanja <= 0) {
			System.out
					.println("Broja broj bacanja mora biti veci od nule, unesite ponovo broj bacanja novcica: ");
			brojBacanja = unos.nextInt();
		}
		// pozivamo metodu i prsledjujemo joj korisnikov unos(argumenat)
		glavaPismo(brojBacanja);
		}catch(InputMismatchException e){
			System.out.println("Greska pri unosu, pokusajte ponovo");
			ZadatakBr5.main(args);
		}
	}

	// metoda za ispis i racunanje, koja prima jedan parametar
	public static void glavaPismo(int brojBacanja) {

		int pismo = 0; // brojac koliko je puta palo pismo
		for (int i = 0; i < brojBacanja; i++) {

			// vrjednost varijable "broj" je uvjek 1 ili 0
			int broj = (int) (Math.round(Math.random()));
			// ako je 0 , onda je pismo
			if (broj == 0) {
				pismo++;// brojimo koliko je puta bilo pismo
				System.out.println("pismo");
			} else
				System.out.println("glava");
		}
		// ispis rezultata
		System.out.println("\npismo je bilo " + pismo + " puta.");
		System.out.println("glava je bila " + (brojBacanja - pismo) + " puta.");

	}
}