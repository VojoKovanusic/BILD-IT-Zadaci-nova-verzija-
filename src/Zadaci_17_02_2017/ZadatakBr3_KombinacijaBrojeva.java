package Zadaci_17_02_2017;

public class ZadatakBr3_KombinacijaBrojeva {
	// 3. Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva
	// broja u rasponu od 1 do 7. Tako�er, program ispisuje broj svih mogu�ih
	// kombinacija. Dakle, program treba da ispi�e sve mogu�e parove brojeva u
	// datom rasponu, krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih kombinacija
	// je 21.
	public static void main(String[] args) {
System.out.println("Sve moguce konbinacije za biranje dva broja u rasponu od 1 do 7:");
int brojac=0;
              //ugnjezdene for petlje 
		for (int i = 1; i < 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				System.out.println(i + "-" + j);
				brojac++;
			}
		}
System.out.println("Broj mogucih konbinacija je "+brojac+".");
	}

}
