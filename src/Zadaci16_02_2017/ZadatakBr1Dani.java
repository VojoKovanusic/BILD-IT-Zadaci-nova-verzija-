package Zadaci16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr1Dani {

	// 1. Napisati program koji pita korisnika da unese cijeli broj za dana�nji
	// dan u sedmici
	// (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon dana�njeg
	// dana te mu ispi�e
	// koji je to dan u budu�nosti. (Primjer: ako korisnik unese 1 kao dana�nji
	// dan a 3 kao dan u
	// budu�nosti program mu ispisuje da je danas utorak a dan u budu�nosti je
	// petak.)

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		try{
		System.out
				.println("Unese cijeli broj za danasnji dan u sedmici (0 za ponedjeljak, 1 za utorak...):");
		int danas = unos.nextInt();
		//ako unese van ranga upada u petju
		while (danas < 0 || danas > 6) {
			System.out
					.println("Dani su u rangu od 0 do 6!!!\npokusajte ponovo");
			danas = unos.nextInt();
		}
		System.out.println("Unesite broj dana nakon dana�njeg dana: ");
		int zaDana = unos.nextInt();
		unos.close();

		// saberemo danasnji i za koliko nas zanima, njihov modulo(ostatak) od
		// sedam je trazeni dan
		int index = (danas + zaDana) % 7;
		// dani su stavljeni u niz
		String dani[] = { "ponedeljak", "utorak", "srijeda", "cetvrtak",
				"petak", "subota", "nedelja" };

		
		System.out.println("Danas je: " + dani[danas] + ", a za " + zaDana
				+ " dana bice " + dani[index] + ".");
		}catch(InputMismatchException e){
		System.out.println("Nelegalan unosPokusajte ponovo.\n");
		ZadatakBr1Dani.main(args);
		}
	}

}
