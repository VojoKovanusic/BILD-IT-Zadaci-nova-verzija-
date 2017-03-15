package zadaci_14_03_2017;


public class ZadatakBr1_Kalendar {
	public static void main(String[] args) {
		
		if (args.length == 2) {
			// godina arg 1
			int godina = Integer.parseInt(args[1]);

			// mjesec je arg 0
			int mjesec = Integer.parseInt(args[0]);

			// Ispisi
			Calendar.printMonth(godina, mjesec);
		} else {
			System.out
					.println("Potrebna su dva argumenta, za godinu i mjesec.");
		}
	}

	static class Calendar {
		/** ispis kalendara za dati mjesec u godini */
		public static void printMonth(int godina, int mjesec) {
			// Print the headings of the calendar
			printNaslov(godina, mjesec);

			// Print the body of the calendar
			ispisiTjelo(godina, mjesec);
		}

		/** Print the month title, e.g., March 2012 */
		public static void printNaslov(int godina, int mjesec) {
			System.out.println("\t" + dohvatiImeMjeseca(mjesec) + " " + godina);
			System.out.println("-----------------------------");
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		}

		public static String dohvatiImeMjeseca(int m) {
			String mjesecIme[] = { " ", "January", "February", "March",
					"April", "May", "June", "July", "August", "September",
					"October", "November", "December" };

			return mjesecIme[m];
		}

		public static void ispisiTjelo(int godina, int m) {
			//
			int pocetniDan = getStartDay(godina, m);

			// dobijemo broj dana u trazenom mjesecu , za datu godinu
			int brojDana = brojDanaUMjesecu(godina, m);

			// za upis praznog prostora
			int i = 0;
			for (i = 0; i < pocetniDan; i++)
				System.out.print("    ");

			for (i = 1; i <= brojDana; i++) {
				System.out.printf("%4d", i);

				if ((i + pocetniDan) % 7 == 0)
					System.out.println();
			}

			System.out.println();
		}

		public static int getStartDay(int year, int month) {
			final int START_DAY_FOR_JAN_1_1800 = 3;

			int ukBrojDana = ukupanBrojDanaod1800(year, month);

			return (ukBrojDana + START_DAY_FOR_JAN_1_1800) % 7;
		}

		/** uk br dana od Jan. 1, 1800 */
		public static int ukupanBrojDanaod1800(int year, int month) {
			int total = 0;

			for (int i = 1800; i < year; i++)
				if (prestupna(i))
					total = total + 366;
				else
					total = total + 365;

			for (int i = 1; i < month; i++)
				total = total + brojDanaUMjesecu(year, i);

			return total;
		}

		/** broj dana u mjesecu */
		public static int brojDanaUMjesecu(int godina, int mjesec) {
			if (mjesec == 1 || mjesec == 3 || mjesec == 5 || mjesec == 7
					|| mjesec == 8 || mjesec == 10 || mjesec == 12)
				return 31;

			if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11)
				return 30;

			if (mjesec == 2)
				return prestupna(godina) ? 29 : 28;
			return 0;
		}

		/** da li je prestupna */
		public static boolean prestupna(int godina) {
			return godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0);
		}
	}
}