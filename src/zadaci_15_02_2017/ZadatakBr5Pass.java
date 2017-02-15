package zadaci_15_02_2017;

import java.util.Scanner;

public class ZadatakBr5Pass {

	public static void main(String[] args) {
		/*
		 * 5. Neke web stranice forsiraju odreðena pravila za passworde.
		 * Napisati metodu koja provjerava da li je unijeti string validan
		 * password. Pravila da bi password bio validan su sljedeæa: 1. Password
		 * mora biti saèinjen od najmanje 8 karaktera. 2. Password smije da se
		 * sastoji samo od slova i brojeva. 3. Password mora sadržati najmanje 2
		 * broja. Napisati program koji pita korisnika da unese password te mu
		 * ispisuje "password je validan" ukoliko su sva pravila ispoštovana ili
		 * "password nije validan" ukoliko pravila nisu ispoštovana.
		 */
		System.out.println("Pravila da bi password bio validan su sljedeca: \n"
				+ "1. Password mora biti sacinjen od najmanje 8 karaktera.\n"
				+ "2. Password smije da se sastoji samo od slova i brojeva.\n"
				+ "3. Password mora sadrzati najmanje 2 broja.\n\nunesite vas password :");
		
		
		Scanner unos = new Scanner(System.in);
		String pass = unos.next();
		unos.close();
		if (!validacijaDuzine(pass)) {
			System.out.println("password nije validan\n"
					+ "Unesena duzina pasa mora biti min 8 karaktera");
		}
		else if (!validacijaKaraktera(pass)){
			System.out.println("password nije validan\n"
					+ "pass se mora sastojati samo od slova i brojeva");}
		
		else if(!validacijaBrojeva(pass)){
		System.out.println("password nije validan\n"
				+ "pass mora imati minimalno dva broja" );}
		
		else System.out.println("Unesen password je validan!");
	}

	public static boolean validacijaDuzine(String str) {
//metoda koja ispituje duzinu
		if (str.length() < 8)
			return false;
		return true;
	}

	public static boolean validacijaKaraktera(String str) {
//metoda koja ispituje da li se uneseni string sastoji od slova i brojeva
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetterOrDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
//metoda koja vraca gresku ako u unesenom stringu nema bar dva broja
	public static boolean validacijaBrojeva(String str) {
		int brojac = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				brojac++;
			}
		}
		if (brojac < 2) {
			return false;
		}
		return true;
	}

}
