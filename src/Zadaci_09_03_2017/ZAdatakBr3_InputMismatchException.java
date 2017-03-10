package Zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZAdatakBr3_InputMismatchException {

	public static void main(String[] args) {
		int broj = 0;
		try {// pocetak bloka za hvatanje greske
			Scanner unos = new Scanner(System.in);
			System.out
					.println("Unesite jedan Integer-cjelobroj u granicama od -2147483648 do 2147483647");
			broj = unos.nextInt();
			unos.close();

			// kraj bloka , te u slucaju da smo iz konzole unjeli nepravilan
			// unos, sa ovom naredbom "catch (InputMismatchException e)" hvatamo gresku i usmjeravamo dalji tok
			// programa u smjeru kojem mi zelimo
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos iz konzole!");
			System.out.println(e.getMessage());
		}
		// ispis u slucau da n dodje do greske
		System.out.println("Uneseni broj je " + broj);
	}

}
