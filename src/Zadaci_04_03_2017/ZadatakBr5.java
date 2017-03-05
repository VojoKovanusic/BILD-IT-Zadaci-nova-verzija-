package Zadaci_04_03_2017;

import java.math.BigInteger;

public class ZadatakBr5 {

	public static void main(String[] args) {
		
		BigInteger n = new BigInteger(Long.toString(Long.MAX_VALUE));
		displyDivisible(n);
	}
	
	
	 //metoda ispisuje prvih deset brojeva, vecih od Long.MAX_VALUE koji su

	public static void displyDivisible(BigInteger n) {
		
		int brojac = 0;
		BigInteger pet = new BigInteger("5");
		BigInteger sest = new BigInteger("6");
		
		while (brojac < 10) {
			
			n = n.add(BigInteger.ONE);
			
			if (n.remainder(pet).equals(BigInteger.ZERO) ||
				n.remainder(sest).equals(BigInteger.ZERO)) {
				
				System.out.println(n);
				brojac++;
			}
		}
	}
}
