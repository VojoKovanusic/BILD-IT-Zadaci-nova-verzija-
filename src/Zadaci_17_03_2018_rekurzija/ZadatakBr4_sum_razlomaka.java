package Zadaci_17_03_2018_rekurzija;

import java.text.DecimalFormat;

//18.05. suma razlomaka po formuli i/2i+1
public class ZadatakBr4_sum_razlomaka {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		for (int i = 1; i <= 10; i++) {

			System.out.println(i + ") iznosi= " + df.format(sum(i)));
		}
	}

	private static double sum(double i) {

		if (i == 0)
			return 0;

		return i / (2.0 * i + 1.0) + sum(i - 1);
	}

}
