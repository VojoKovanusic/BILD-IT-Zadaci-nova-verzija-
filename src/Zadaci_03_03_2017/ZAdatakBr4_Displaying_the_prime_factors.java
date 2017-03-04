package Zadaci_03_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZAdatakBr4_Displaying_the_prime_factors {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		try {
			System.out.print("Unesite pozitivan integers: ");
			int broj = unos.nextInt();
			while (broj < 1) {
				System.out.println("Unesite ovaj put  integer veci od nule: ");
				broj = unos.nextInt();
			}

			System.out.print("Najmanji faktori broja " + broj + " :\n");
			StackOfIntegers stack = new StackOfIntegers(); // instanciran obj.
															// StackOfIntegers
			// metodi prosledjeni argumnti
			najmanjiFaktor(broj, stack);

			while (!stack.prazan()) {
				System.out.print(stack.pop() + " ");
			}
			System.out.println();
			unos.close();
		} catch (InputMismatchException e) {// hvatanje greske
			System.out.println("Unos nije validan prekid programa!");

		}
	}

	// pronalazi najmanji faktor i "gura"ga u StackOfIntegers
	public static void najmanjiFaktor(int broj, StackOfIntegers stack) {
		int i = 2; // potencijalni prosti faktor
		while (broj / i != 1) {
			if (broj % i == 0) {
				stack.push(i);
				broj /= i;
			} else
				i++;
		}
		stack.push(broj);
	}
}
