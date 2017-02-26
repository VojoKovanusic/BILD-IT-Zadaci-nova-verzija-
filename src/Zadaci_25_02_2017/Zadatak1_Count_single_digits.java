package Zadaci_25_02_2017;

import java.util.Scanner;

public class Zadatak1_Count_single_digits {
	/*
	 * (Count single digits) Write a program that generates 100 random integers
	 * between 0 and 9 and displays the count for each number. (Hint: Use an
	 * array of ten integers, say counts, to store the counts for the number of
	 * 0s, 1s, . . . , 9s.)
	 */
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out
				.println("Say \"counts\", to store the counts for the number of 0s, 1s, . . . , 9s");
		//da bi program proradio orisnik mora unjeti traznu rjec
		String word = unos.next();
		while (!word.equalsIgnoreCase("counts")) {
			System.out
					.println("Say \"counts\", to store the counts for the number of 0s, 1s, . . . , 9s");
			word = unos.next();

		}
		unos.close();
		//determinisemo niz,instanciramo ga... i odredjujemo da ce imati 10 elemenata
		int array[] = new int[10];
		
		for (int i = 0; i < 100; i++) {
			// program sam nasumicno bira brojeve
			int randomIndex = (int) (Math.random() * 10);
			//povecavamo vrjednost izabranog indexa za jedan
			array[randomIndex]++;

		}
		for (int index = 0; index < 10; index++) {
			//ako je vrjednost na odredjenom indexu ima vrjednost vecu od nula ispisujemo je
			if (array[index] > 0)
				System.out.println("count for number " + index + " is "
						+ array[index]);
		}

	}

}
