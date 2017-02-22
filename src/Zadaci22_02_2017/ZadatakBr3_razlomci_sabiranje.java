package Zadaci22_02_2017;


public class ZadatakBr3_razlomci_sabiranje {

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9
		 * + 9/11 + 11/13 ..... + 95/97 + 97/99.
		 */
		double sum = 0;
		for (int i = 1; i < 98; i += 2) {
			double rez =(double) i / (i + 2);
			sum += rez;

		}
		System.out
				.print("Zbir serije  1/3 + 3/5 + 5/7 + 7/9+ 9/11 + 11/13 ..... + 95/97 + 97/99\n"
						+ "Iznosi:" + sum);

	}

}
