package Zadaci20_02_2017;

import java.util.concurrent.ForkJoinPool;

/*1. Pretpostavimo da se registarska tablica za auto sastoji 
 * od tri uppercase karaktera i 4 broja u sljedeæem formatu AAA-1234. 
 * Napisati program koji nasumièno generiše tablicu.
 */public class ZadatakBr1_reg_tablice {

	public static void main(String[] args) {

		System.out.println("Nasumicno generisana registarska tablica:");

		// for petlja koja po ACII-ju izbacuje random slova od "A"do"Z"
	 
		for (int j = 0; j < 3; j++) {
			char slovo = (char) (65 + Math.random() * 26);
			System.out.print(slovo);

		}
		// nasumican broj od 1000 do 9999
		int x = (int) (1000 + Math.random() * 9000);

		System.out.print("-" + x);
		System.out.println();

	}
}
