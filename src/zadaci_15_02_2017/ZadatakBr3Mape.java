package zadaci_15_02_2017;

import java.time.YearMonth;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr3Mape {
	/* 3. Napisati program koji pita korisnika da unese godinu i prva tri slova
	 * imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom
	 * mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec
	 * Jan program mu ispisuje da Jan 2011 ima 31 dan.*/
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out.println("\t\t****PROVJERA BROJA DANA U MJESECU****\n");

		try { // ttry catch blok, da uhvatimo nepravilan unos iz konzole

			System.out.println("Unesite prva tri slova imena mjeseca "
					+ "(prvo slovo uppercase):");

			String mjesec = unos.next();
			
			//upadamo u petlju ako metoda vraca false
			while (!validacijaMjeseca(mjesec)) {
				
				System.out
						.println("Greska! Unesite ponovo prva tri slova imena mjeseca "
								+ "(prvo slovo uppercase):");
				mjesec = unos.next();
			}
			System.out.println("Unesite godinu:");
			int godina = unos.nextInt();

			//ako je god 0 i manja upadamo u petlju
			while (godina < 1) {
				System.out.println("Greska! Unesite ponovo godinu, vecu od 0");
				godina = unos.nextInt();
			}
			//metodi prosledjujemo podatke
			ispisiDan(mjesec, godina);
			unos.close();
			// Hvatanje greske
		} catch (InputMismatchException e) {
			System.out
					.println("Greska pri unosu iz konzole. Procitajte upute!!\n");
			ZadatakBr3Mape.main(args);
		}
	}
//mtoda prima dva argumenta, i ispisuje broj dana za datu god i mjes.
	public static void ispisiDan(String mjesec, int godina) {
        
		//malo sam vjezbao mape, mada vjerovatno moze jednostavnije
		// podatke za obradu stavljamo u mapu
		HashMap<String, Integer> map = new HashMap<>();

		map.put("Jan", 1);
		map.put("Feb", 2);
		map.put("Mar", 3);
		map.put("Apr", 4);
		map.put("Maj", 5);
		map.put("Jun", 6);
		map.put("Jul", 7);
		map.put("Avg", 8);
		map.put("Sep", 9);
		map.put("Okt", 10);
		map.put("Nov", 11);
		map.put("Dec", 12);

		YearMonth dani = YearMonth.of(godina, map.get(mjesec));
		
		//pozivamo metodu koja vraca broj dana 
		int brojDana = dani.lengthOfMonth();
		//uslovi za ispis
		if (brojDana == 31) {
			System.out.println(mjesec + " " + godina + " ima " + brojDana
					+ " dan.");
		} else
			System.out.println(mjesec + " " + godina + " ima " + brojDana
					+ " dana.");
	}
                        //za validaciju unosa mjeseca
	public static boolean validacijaMjeseca(String mjesec) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("Jan", 1);
		map.put("Feb", 2);
		map.put("Mar", 3);
		map.put("Apr", 4);
		map.put("Maj", 5);
		map.put("Jun", 6);
		map.put("Jul", 7);
		map.put("Avg", 8);
		map.put("Sep", 9);
		map.put("Okt", 10);
		map.put("Nov", 11);
		map.put("Dec", 12);

		//ako postoji u mapi kljuc sa unesenim mjesecom, vraca true, u suprotnom...
		return map.containsKey(mjesec);
	}
}