package Zadaci_04_03_2017;

import java.math.BigInteger;

public class ZadatakBr2_Square_numbers {
	public static void main(String[] args) {
		
		long first = (long)Math.sqrt(Long.MAX_VALUE);
		String s = Long.toString(first);
		BigInteger n = new BigInteger(s);
	
		squareNumbers(n);
		
	}
	
	//Metoda izracunava i ispisuje kvadratne brojeve vece od Long.MAX_VALUE
	 
	public static void squareNumbers(BigInteger n) {
		
		for (int i=0; i < 10; i++) {
			
			n = n.add(BigInteger.ONE);
			System.out.println(n.pow(2));
		}	
	}
}