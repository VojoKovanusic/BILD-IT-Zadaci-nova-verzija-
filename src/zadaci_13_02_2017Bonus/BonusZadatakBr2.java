package zadaci_13_02_2017Bonus;

import java.util.Scanner;

public class BonusZadatakBr2 {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		try {// try catch blok da uhvatimo nepravila unos iz konzole
			System.out
					.println("Upisite broj godina koje zelite da se vrati u prošlost");
			long godina = unos.nextLong();
			if (godina <= 0) {
				System.out.println("Unesite pozitivnu godinu:");
				godina = unos.nextLong();
			}

			long sekunde = godina;
			long Sekunde = sekunde % 60;
			long min = sekunde / 60;
			long Minute = min % 60;
			long sati = min / 60;
			long trenutnoSati = sati % 24;
			System.out
					.println("Sa nasim avionom, koji prelazi jednu godinu za jednu sekundu,\n"
							+ "Vam treba "
							+ Sekunde
							+ " sec  "
							+ Minute
							+ " min i "
							+ trenutnoSati
							+ " h, da bi presli "
							+ godina + " godina u proslost\n");
			

			long ukupnoCentimetara = godina * 75;

			long kilometar = ukupnoCentimetara / 100000;
			long metar = ukupnoCentimetara % 100000 / 100;
			long centimetar = ukupnoCentimetara % 100000 % 100;

			long fudbalskiStadion = ukupnoCentimetara / 10500;
			long kusurStadiona = ukupnoCentimetara % 10500;
			System.out
					.println("Da nas jedan predjeni korak (~75 cm) vraca 1 godinu u proslost,\n"
							+ "trebalo bi da prepjesacimo "
							+ kilometar
							+ " KM, "
							+ metar
							+ " m i "
							+ centimetar
							+ "cm\n,sto odgovara cinjenici da bi jedan prosjecan fudbalski stadion"
							+ " trebali preklapati cak "
							+ fudbalskiStadion
							+ "," + kusurStadiona + " puta");
			long zemlju = (ukupnoCentimetara / 400750000)/10 ;
			System.out
					.println("Sto dalje amplicira, pod uslovom da je zemlja ravna i da joj je obim 40.075 km\n"
							+ "morali bi je prehodati " + zemlju + " puta.");

		} catch (Exception e) {
			System.out.println("Unesite numericku vrjednost!");
		}
	}

}


//PROBA
/*	long dan = sati / 24;
			long trenutnoDana = sati % 24;
			long mjeseci = dan % 12;
			long god = dan / 365;
		
			System.out
					.println("\nDa bi se vratio iz "
							+ godina
							+ " godine treba\n"
							+ trenutnoDana
							+ " dana "
							+ mjeseci
							+ " mjes. "
							+ god
							+ "god.");*/