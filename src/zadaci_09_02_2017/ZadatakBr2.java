package zadaci_09_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr2 {
	// 2. Napisati metodu koja prima jedan argument, broj pitanja, te generiše
	// toliko nasumiènih, jednostavnih pitanja oduzimanja tipa : „Koliko je 5 -
	// 2 ?“. Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše
	// korisniku.
	public static void main(String[] args) {
		//objekat skener kako bih korsniku omogucili unos iz konzole
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj pitanja:");
		try{
		int brojPitanja = unos.nextInt();
		 
		//validacija, da petlja vrti dok unos ne bude validan
		while(brojPitanja<=0){
			System.out.println("Broja pitanaj mora biti veci od nula, unesite ponovo  broja pitanja: ");
			brojPitanja = unos.nextInt();
		}

		miniKviz(brojPitanja); // pozivamo metodu i prosledjujemo joj argument(broj pitanj)
		unos.close();
	}catch(InputMismatchException e){
		System.out.println("Greska pri unosu, pokusajte ponovo");
		ZadatakBr2.main(args);
	}
	}
                   //metoda
	public static void miniKviz(int brPitanja) {
		Scanner unos = new Scanner(System.in);
		int brTacnihOdgovora = 0;  //brojac tacnih odgovora
		for (int i = 0; i < brPitanja; i++) { 
			int x = (int) (1 + Math.random() * 10); //nasumicni brojevi
			int y = (int) (1 + Math.random() * 10);
			if (x < y) { //ako je prvi nasum.br. manji od prvog mjenjamo im mjesta
				int temp = x;
				x = y;
				y = temp;
			}
			System.out.print("Koliko iznosi " + x + "-" + y + "?");
			int rezultat = x - y;
			int odgovor = unos.nextInt();
			if (rezultat == odgovor) {
				brTacnihOdgovora++;
			}
		}
		System.out.println("Broj taènih odgovora: " + brTacnihOdgovora);
		System.out.println("Broj netaènih odgovora: "
				+ (brPitanja - brTacnihOdgovora));
		unos.close();
	
	}
	}

