package Mini4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Battleship {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] arg) {

		odigrajJednuPartiju();

	}
//metoda koja ispisuje liniju izmedju dva granatiranja
	public static void ispisLinije() {
		System.out.println("_____________________________________");
		System.out.println("");
	}

	// metoda koja prima 2d niz i "puni" ga sa znakovima # koji predstavljaju
	// prazna polja
	public static void napraviTablu(String[][] tabla) {
		for (int row = 0; row < tabla.length; row++) {
			for (int column = 0; column < tabla[0].length; column++) {
				tabla[row][column] = "#";
			}
		}
	}

	// ispisivanje table
	public static void printTablu(String[][] tabla) {
		ispisLinije();
		for (int r = 0; r < tabla.length; r++) {

			for (int c = 0; c < tabla[0].length; c++) {
				if (tabla[r][c].equals("S")) {
					System.out.print(" " + "#");
				} else {
					System.out.print(" " + tabla[r][c]);
				}
			}
			System.out.println("");

		}
		ispisLinije();
	}

	// metoda koja omogucava da program nasumicno izabere polozaje podmornic3
	public static void napraviPodmornicu(String[][] tabla, int velicina) {
		if (Math.random() < 0.5) {
			int col = (int) (Math.random() * 5);
			int row = (int) (Math.random() * 7);
			for (int i = 0; i < velicina; i++) {
				tabla[row][col + i] = "S";
			}
		} else {
			int col = (int) (Math.random() * 7);
			int row = (int) (Math.random() * 5);
			for (int i = 0; i < velicina; i++) {
				tabla[row + i][col] = "S";
				System.out.println(row);
				System.out.println(col);
			}
		}
	}

	// prosledjujemo tablu u vidu 2d niza, dosadasnje stanje pogodaka, te
	// trenutno stanje granata
	// vraca nam stanje pogodaka, ako smo pogodili , povecava za jedan "hits"
	public static int ispaliPlotun(String[][] board, int hits, int granata) {
		try {
			int row, col;
			System.out.println("Granata na stanju: " + granata + "!");
			System.out
					.println("Izaberite red u koji zelite ispaliti granatu: ");
			row = input.nextInt();
			// u slucaju da unese red van granica upada u petlju
			while (row > 8 || row < 1) {
				System.out.println("Unesite validnu kolonu (1 -> 8)");
				row = input.nextInt();
			}
			System.out
					.println("Izaberite kolonu u koju zelite ispaliti granatu: ");
			col = input.nextInt();
			// u slucaju da unese kolonu van granica upada u petlju
			while (col > 8 || col < 1) {
				System.out
						.println("Unesite validnu kolonu , u granicama (1 -> 8)");
				col = input.nextInt();
			}
			// u slucaju da pogodimo
			if (board[row - 1][col - 1].equals("S")) {
				hits++;
				System.out.println("********* POGODAK *********");
				board[row - 1][col - 1] = "!";
			} else {
				System.out.println("********* PROMASAJ *********");
				board[row - 1][col - 1] = "M";
			}
			return hits;

		} catch (InputMismatchException e) {
			System.out.println("Niste unjeli validne podatke, prekid programa");
			System.exit(-1);// prekid programa
			return 0;
		}
	}

	// zavisno od broja pogodaka i stanja sa granatama dobijamo konacan rezultat
	public static void epilogSituacije(int pogoci, int granate) {
		if (pogoci < 4)
			System.out
					.println("Porazeni ste u ovoj bitci,niste pogodili podmornicu.");
		if (granate < 1)
			System.out.println("Potrosili se sve granate!");
		else if (pogoci >= 4) {
			System.out.println("Pobjeda je vasa, potopiliste podmornicu!");
		}

	}

	// metoda koja u sebi sadrzi sve predhodne metode te omogucava da se odigra
	// jedna partija
	public static void odigrajJednuPartiju() {
		String[][] tabla = new String[8][8];
		napraviTablu(tabla);
		napraviPodmornicu(tabla, 4);
		int granata = 15;
		int hits = 0;
		// petlja radi sve dok imamo granata na stanju i pogodaka manje od 4
		while (granata > 0 && hits < 4) {
			printTablu(tabla);
			hits = ispaliPlotun(tabla, hits, granata);
			// smanji broj granata na stanju
			granata--;
		}
		epilogSituacije(hits, granata);
	}
}