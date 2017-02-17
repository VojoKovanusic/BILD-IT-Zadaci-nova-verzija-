package Zadaci16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr1Dani {

	// 1. Napisati program koji pita korisnika da unese cijeli broj za današnji
	// dan u sedmici
	// (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon današnjeg
	// dana te mu ispiše
	// koji je to dan u buduænosti. (Primjer: ako korisnik unese 1 kao današnji
	// dan a 3 kao dan u
	// buduænosti program mu ispisuje da je danas utorak a dan u buduænosti je
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
		System.out.println("Unesite broj dana nakon današnjeg dana: ");
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
