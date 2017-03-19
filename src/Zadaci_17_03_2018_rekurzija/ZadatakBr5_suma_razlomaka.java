package Zadaci_17_03_2018_rekurzija;

import java.text.DecimalFormat;

public class ZadatakBr5_suma_razlomaka {
	// 18.04. suma razlomaka po formuli i/i+1
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		for (int i = 1; i <= 10; i++) {

			System.out.println(i + ") iznosi= " + df.format(sum(i)));
		}
	}

	private static double sum(int i) {
		if (i == 0)
			return 0;
		return (i / (i + 1.0)) + sum(--i);
	}

}
