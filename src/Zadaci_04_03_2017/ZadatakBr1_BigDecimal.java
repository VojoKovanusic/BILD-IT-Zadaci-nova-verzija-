package Zadaci_04_03_2017;

import java.math.BigDecimal;

public class ZadatakBr1_BigDecimal {
	// (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits
	// that are
	// divisible by 2 or 3
	public static void main(String[] args) {
		//zadat je uradjen uz pomoc BigDecimal klase i njenih mtoda
		BigDecimal broj = new BigDecimal(
				"100000000000000000000000000000000000000000000000000");
		// brojac ispisa
		int brojac = 1;
		// petlja vrti dok ne ispisemo 10 brojeva
		
		while (brojac <= 10) {
			
			BigDecimal remainder2 = broj.remainder(new BigDecimal(2));
			BigDecimal remainder3 = broj.remainder(new BigDecimal(3));
			
			// ako je broj djeljiv sa 2 ili tri
			if (remainder2.equals(BigDecimal.ZERO) || remainder3.equals(BigDecimal.ZERO)) {
				System.out.println(broj);
				brojac++;
			}
			// inkrementacija
			broj = broj.add(BigDecimal.ONE);
		}
	}

}
