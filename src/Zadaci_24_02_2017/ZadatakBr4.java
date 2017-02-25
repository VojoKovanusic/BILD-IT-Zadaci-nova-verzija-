package Zadaci_24_02_2017;

import java.util.Scanner;

/*4. Napisati metodu sa sljedeæim headerom:
 *  public static String format(int number, int width) koja vraæa string broja 
 *  sa prefiksom od jedne ili više nula. Velièina stringa je width argument. 
 *  Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034, 
 *  ukoliko pozovemo format(34, 5) metoda vraæa 00034. 
 *  Ukoliko je uneseni broj veæi nego width argument,
 *   metoda vraæa samo string broja. Npr. ukoliko pozovemo format(34, 1) metoda vraæa 34.
 */public class ZadatakBr4 {
	 
	public static void main(String[] args) {
		System.out
				.println("*** Aplikacija koja vraæa string broja, sa prefiksom od jedne ili više nula.***"
						+ "\n\t\t\t*** Velièina Stringa je width argument. ***");
		
		System.out.println("\n#Napomena: program prima samo pozitivne brojeve\nUnesite broj: "
				+ "");
		Scanner unos=new Scanner(System.in);
		
		int number=unos.nextInt();
		while(number<1){
			System.out.println("Unesite broj veci od nule.");
			number=unos.nextInt();
		}
		System.out.println("\nUnesite width argument: "
				+ "");
		int width=unos.nextInt();
		while(width<1){
			System.out.println("Unesite broj veci od nule.");
			width=unos.nextInt();
		}
		unos.close();
		System.out.println("Trazeni string izgleda ovako :\""+format(number, width)+"\".");

	}

	public static String format(int number, int width) {
		// int number , kastujemo u string
		String strNumber = Integer.toString(number);
		// u koliko je width, manje id duzine cifara unesenog numbera
		if (width <= strNumber.length()) {
			// vracamo rezultat bez nula
			return Integer.toString(number);

			// u suprotnom
		} else {
			// inicializujemo mjesto gdje ce mo smjestati nule
			String zero = "";
			while (true) {
				zero += "0";
				// petlja dodaje nule sve dok se ne izjedaci zeljena duzina
				// stringa (width)
				// sa (brojem dodaih nula sabranim sa duzinom unesenog broja)
				if ((zero.length() + strNumber.length()) == width) {
					break;
				}

			}
			//
			return zero + strNumber;
		}
	}

}
