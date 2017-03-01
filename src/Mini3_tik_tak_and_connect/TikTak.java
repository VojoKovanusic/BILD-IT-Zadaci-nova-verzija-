package Mini3_tik_tak_and_connect;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TikTak {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {
		try {

			ispisiBrojevePozicija();
			odigrajIksOks();

			unos.close();
		} catch (InputMismatchException e) {
			System.out.println("Greska pri unosu, prekid programa!");
		}

	}

	private static void odigrajIksOks() {
		char tabla[][] = new char[3][3];
		char znak = 0;
		while (true) {
			znak = unesiZnak(znak);

			int postaviZnak[] = new int[2];
			while (true) {
				postaviPoziijuNaTabli(postaviZnak);
				if (postaviZnakNaTablu(znak, postaviZnak, tabla)) {
					break;
				}
			}
			if (provjeriStatus(znak, tabla)) {

				ispisiTablu(tabla);
			} else {
				ispisiTablu(tabla);
				System.out.println("Igrac sa znakom " + znak
						+ " je pobjedio, cestitamo!");
				break;
			}
		}
	}

	// ispisi tablu sa iks oks znakovima koji su do sada ubaceni
	private static void ispisiTablu(char tabla[][]) {
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				System.out.printf("[%s]", tabla[row][column]);
			}
			System.out.println();

		}
	}

	// ako jedan od igraca dodje do tri vezana ista znaka vraca false, tj
	// prekida dalju igru

	private static boolean provjeriStatus(char znak, char[][] tabla) {
		if (provjeriHorizontali(znak, tabla))
			return false;
		if (provjeriVertikalu(znak, tabla))
			return false;
		if (provjeriGlavnuDijagonalu(znak, tabla))
			return false;
		if (provjeriSporednuDijagonalu(znak, tabla))
			return false;
		provjeriNerjeseno(tabla);
		return true;
	}

	// ako ne dodje do spajanja tri znaka, znaci da je nerjeseno
	private static void provjeriNerjeseno(char[][] tabla) {
		vanjskaPetlja: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabla[i][j] == 0)
					break vanjskaPetlja;
				else if (j == 2 && i == 2 && tabla[i][j] != 0) {
					System.out.println("***Nerjeseno !!!***");
					System.exit(0);
				}
			}
		}

	}

	// provjera sporedne dijagonale, u smislu da li na njoj imaju tri ista
	// znaka, te u to slucaju vraca true
	private static boolean provjeriSporednuDijagonalu(char znak, char[][] tabla) {
		int brojac = 0;
		for (int i = 2; i <= 0; i--) {
			if (tabla[(5 - i) % 3][i] == znak) {
				brojac++;
				if (brojac == 3)
					return true;

			}

		}
		return false;
	}

	// vratca true, ako su tri ista znaka u glavnoj dagonali
	private static boolean provjeriGlavnuDijagonalu(char znak, char[][] tabla) {
		int brojac = 0;
		for (int i = 0; i < 3; i++) {
			if (tabla[i][i] == znak) {
				brojac++;
				if (brojac == 3)
					return true;
			}

		}
		return false;
	}

	// provjerava da li postoje kolone sa tri ista znaka, te u tom slucaju vraca
	// true
	private static boolean provjeriVertikalu(char znak, char[][] tabla) {
		for (int i = 0; i < 3; i++) {
			int brojac = 0;
			for (int j = 0; j < 3; j++) {
				if (tabla[j][i] == znak)
					brojac++;
				if (brojac == 3) {
					System.out.println("Vertikalno tri ista " + znak);
					return true;
				}
			}

		}
		return false;
	}

	// provjerava da li postoje redovi sa tri ista znaka, te u tom slucaju vraca
	// true
	private static boolean provjeriHorizontali(char znak, char[][] tabla) {
		for (int i = 0; i < 3; i++) {
			int brojac = 0;
			for (int j = 0; j < 3; j++) {
				if (tabla[i][j] == znak)
					brojac++;
				if (brojac == 3) {
					System.out.println("Horizontalno tri ista " + znak);
					return true;
				}
			}

		}
		return false;
	}

	// ako je pozicija vec zauzeta vraca gresku
	private static boolean postaviZnakNaTablu(char znak, int[] postaviZnak,
			char[][] tabla) {
		if (tabla[postaviZnak[0]][postaviZnak[1]] == 0) {
			tabla[postaviZnak[0]][postaviZnak[1]] = znak;
		} else {
			System.out.println("Pozicija je zauzeta, pokusajte ponovo");
			return false;
		}
		return true;

	}

	// mtoda koja trazi od igraca da unese kordinate zanka na tabli
	private static void postaviPoziijuNaTabli(int[] postaviZnak) {
		System.out
				.println("Unesite red(0,1 ili 2):");
		postaviZnak[0] = unos.nextInt();
		while (postaviZnak[0] > 2 || postaviZnak[0] < 0) {
			System.out
					.println("Redovi mogu biti 0,1 ili 2! Pokusajte ponovo!");
			postaviZnak[0] = unos.nextInt();
		}
		System.out.println("Unesite kolonu(0,1 ili 2) :");
		postaviZnak[1] = unos.nextInt();
		while (postaviZnak[1] > 2 || postaviZnak[1] < 0) {
			System.out
					.println("Kolone mogu biti 0,1 ili 2! Pokusajte ponovo!");
			postaviZnak[1] = unos.nextInt();
		}
	}

	// metoda koja vraca "X" ili "O"(iks ili oks), zavisno od toga ko je na
	// potezu i od unosa
	private static char unesiZnak(char znak) {
		if (znak == 'X') {
			System.out.println("Na redu je \"O\" igrac ");
			znak = 'O';
		} else if (znak == 'O') {
			System.out.println("Na redu je \"X\" igrac ");
			znak = 'X';
		} else
			while (znak != 'O' && znak != 'X') {
				System.out
						.println("\nIzaberite znak, kojeg zelite koristiti u nastavku igre: \"X\" ili \"O\":");
				String str = unos.next();
				while (str.length() != 1) {
					System.out.println("Unesite samo jedan znak X ili O");
					str = unos.next();
				}
				znak = str.charAt(0);
				znak = Character.toUpperCase(znak);
			}
		return znak;
	}

	// ispisuje koordinate na koje mozemo smjestati "x" i "o"
	private static void ispisiBrojevePozicija() {
		System.out.println("\t***Iks Oks tabla***\n\nPozicije -koordinate:\n");
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				System.out.printf("[%d %d] ", row, column);
			}
			System.out.println();

		}
	}

}
