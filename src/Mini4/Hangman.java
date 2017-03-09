package Mini4;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
	// radi lakseg baratanja, kroz program koristio sam sve staticke varijable
	static Scanner unos = new Scanner(System.in);

	static String[] nizRjeci = { "heap", "array", "double", "short", "math",
			"main", "this", "public", "program", "Inheritance", "polymorphism",
			"void", "class" };
	// ovdje ce se smestati dupli unosi
	static ArrayList<Character> temp = new ArrayList<>();
	// program sam bira nasumice index u nizu
	static int index = (int) (Math.random() * nizRjeci.length);
	// izabranu rjec pretvorio u niz karaktera, da mogu lakse baratati
	static char slova[] = nizRjeci[index].toCharArray();
	// niz u koji ce mo smjestati pogodjena slova,
	static char[] deponujUnose = new char[slova.length];

	static boolean uslov = false;

	public static void main(String[] args) {
		System.out
				.println("                    ************Dobro dosli*********\n"
						+ "Da ne bi bili objeseni, imate 11 pokusaja da unesete slova koja se nalaze"
						+ " u nasumicno izabranoj rjeci\n"
						+ "tematika je programski jezik java!\n*******SRETNO*******\n");
		// prvo ga "napunimo sa uitnicima
		for (int i = 0; i < deponujUnose.length; i++) {
			deponujUnose[i] = '?';

		}

		// petlja radi dok se ne ispuni uslov za prekid
		int brojac = 0;

		while (!uslov) {
			ispisiTrenutnuSituaciju();
			char c = unesiSlovo();
			brojac += odgovor(c);
			provjera();
			vjesane(brojac);

		}
	}

	// metoda vraca uslov kao true, ako je korisnik pronasao rjec prije nego sto
	// je objesen
	public static boolean provjera() {
		for (int i = 0; i < deponujUnose.length; i++) {
			if (!Character.isLetter(deponujUnose[i]))
				return uslov;
		}
		System.out
				.println("***SVAKA CAST POBJEDILISTE****\n\ntrenutna situacija sa vjesalima izgleda ovako:");
		uslov = true;
		return uslov;
	}

	// ova metoda sluzi za brojanje promasenih slova(vraca 1), ali ujedno i
	// ispisuje epilog posle unosa slova
	public static int odgovor(char c) {
		// prolazimo kroz sva slova
		for (int i = 0; i < slova.length; i++) {
			// ako se poklapa prosledjeni argument sa karakterom u nizu pamtmo
			// ga
			if (ponovljenoSlovo(c)) {
				System.out.println("Vec ste jednom unjeli slovo " + c
						+ ", sada ste korak blize vjesnju");
				return 1;
			}

			if (c == slova[i]) {
				// pamtimo unesena slova
				temp.add(c);
				deponujUnose[i] = c;
				System.out.println("Slovo \"" + c + "\" se nalazi ispod ?");
				return 0;
			}

		}
		System.out.println("Slovo \"" + c
				+ "\" se ne nalazi ispod ? , jedan korak ste blize vjesanju!");
		return 1;

	}

	// metoda vraca true u koliko je karakter u listi

	private static boolean ponovljenoSlovo(char c) {
		for (int i = 0; i < temp.size(); i++) {
			if (temp.get(i) == c) {
				return true;
			}

		}
		return false;
	}

	// metoda koja printa trenutno stanje sa slovim-upitnicima
	public static void ispisiTrenutnuSituaciju() {
		System.out.println("Trenutna situacija:");
		for (int j = 0; j < deponujUnose.length; j++) {
			System.out.print(deponujUnose[j]);
		}
	}

	// od korisnika uzimamo podatak
	public static char unesiSlovo() {
		System.out
				.print("\nUnesite slovo za koje smatrate da se nalazi ispod upitnika:");
		String str = unos.nextLine().toLowerCase();
		// u slucau da unos nije validan, petlja ga stalno vraca-ispralja
		while (str.length() != 1 || !Character.isLetter(str.charAt(0))) {
			if (!Character.isLetter(str.charAt(0))) {
				System.out
						.println("Rjec se sastoji samo od slova, pokusajte sa nekim slovom ovaj put");
			} else {
				System.out
						.println("Morate unjeti samo jedno slovo, pokusajte ponovo!");
			}

			str = unos.nextLine().toLowerCase();
		}

		return str.charAt(0);
	}

	// ispis trenutnog stanja na vjesalici, ali i ispis krajnjeg rezultat , ako
	// korisnik ne pogodi do jedanaestog slucaja(case-a)
	public static void vjesane(int promasaj) {

		switch (promasaj) {

		case 11:
			System.out.println("\n __\n|  |\n|  o\n|  /\\\n/\\");
			System.out
					.println("Upravo ste objeseni, kraj igre!!!\nVise srece drugi put.");
			System.out.println("Trazena rjec je bila: \""+nizRjeci[index]+"\"!");
			uslov = true;
			break;
		case 10:
			System.out.println("\n __\n|  |\n|  o\n|  \\\n/\\");
			break;

		case 9:
			System.out.println("\n __\n|  |\n|  o\n|  \n/\\");
			break;
		case 8:
			System.out.println("\n __\n|  |\n|  \n|  \n/\\");
			break;

		case 7:
			System.out.println("\n __\n|  \n|  \n|  \n/\\");
			break;

		case 6:
			System.out.println("\n _\n|  \n|  \n|  \n/\\");
			break;

		case 5:
			System.out.println("\n|  \n|  \n|  \n/\\");
			break;

		case 4:
			System.out.println("\n|  \n|   \n/\\");
			break;

		case 3:
			System.out.println("|\n/\\");
			break;

		case 2:
			System.out.println("/\\");
			break;
		case 1:
			System.out.println("/");
			break;

		}

	}
}
