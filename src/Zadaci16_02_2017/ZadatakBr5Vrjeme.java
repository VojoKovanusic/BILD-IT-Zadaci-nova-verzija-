package Zadaci16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

/*5. Napisati metodu koja pretavara milisekunde u sate,
 minute i sekunde. Metoda treba da koristi sljedeæi header: 
 public static String convertMillis(long millis). 
 Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde. 
 Na primjer convertMillis(100000) treba da vrati 0:1:40.*/

public class ZadatakBr5Vrjeme {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("\t\t\tPRETVARAC MILISEKUNDI\nUnesite vrjeme u milisekundama:");
		try {
			long milisekunde=unos.nextLong();
			while(milisekunde<1){
				System.out.println("Vrjeme ne moze biti o, niti manje od nje, unesite vrjeme ponovo");
				 milisekunde=unos.nextLong();
			}
			
		unos.close();
		
		//ispis,  pozivanje metode, prosledjivanje argumenta
		System.out.println(convertMillis(milisekunde));
		
		
}catch(InputMismatchException e){
	System.out.println("Program prima cjelobrojne vrjednosti tipa long\npokusajte ponovo.");
	ZadatakBr5Vrjeme.main(args);
}
	}

	public static String convertMillis(long millis) {
	
		//izracunamo koliko argument ima ukupno sekundi
		long s=millis/1000; 
		
		// sat ima 3600 sekundi
		long h = s/3600;  
		
		long min = s / 60%60;  // min= 60 sec + odbijam sate sa %60
		
		long sec = s % 60;
		 
		return h + ":" + min + ":" + sec+".";
		
	}
}
