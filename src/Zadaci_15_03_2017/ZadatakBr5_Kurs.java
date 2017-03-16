package Zadaci_15_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5_Kurs {
	public static void main(String[] args) throws CloneNotSupportedException {

		Course kurs = new Course("BILD-Java");

		kurs.addStudent("Marko Markovic");
		kurs.addStudent("Petar Petrovic");
		kurs.addStudent("Marko Guduric");

		String kloniraniKurs[] = kurs.clone();
		kurs.ispisiPodatkeKursa();

		System.out.println("\nKlonirana imena studenata:");
		for (String string : kloniraniKurs) {
			System.out.println(string);

		}

	}

}
