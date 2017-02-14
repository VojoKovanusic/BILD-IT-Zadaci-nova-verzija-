package zadaci_14_02_2017;

import java.util.Scanner;

public class ZadatakBr4_NeparnePozicijeString {
	/*
	 * 4. Napisati program koji pita korisnika da unese neki string te mu
	 * ispisuje sve karaktere koji se nalaze na neparnim pozicijama. Na primjer,
	 * ako korisnik unese string Beijing Chicago, program vraæa BiigCiao.
	 */public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out
				.println("Unesite neki string\nda ispisemo sve karaktere koji se nalaze na neparnim pozicijama:\n");
		String str = unos.nextLine();
		while(str.length()==0){
			System.out.println("Unesite neki string, ne moze se na praznom prvjeravati, NISTA!");
			 str = unos.nextLine();
			 unos.close();
		}
		System.out.println("Karakteri koji se nalaze na neparnim pozicijama su :");
		
		//uneseni string stavljam u list tipa char
		char ch[] = str.toCharArray(); 
		
		//petljom prolazimo kroz sve karaktere i ispisujemo one koji su na neparnom mjestu
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(ch[i]);
			}
		}
	}

}
