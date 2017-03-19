package Zadaci_17_03_2018_rekurzija;

import java.text.DecimalFormat;

public class ZadatakBr3_sum_razlomaka {
	// 18.04. suma razlomaka do deset: 1/1+1/2+1/3+....1/10   tj 1/i

	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("#.##");
		for (int i = 1; i <=10; i++) {
			
		
		System.out.println(i+")"+df.format(sum(i)));
}
	}

	private static double sum(int i) {
		if (i <= 1)
			return 1;
		return (1.0 / i + sum(--i));
	}

}
