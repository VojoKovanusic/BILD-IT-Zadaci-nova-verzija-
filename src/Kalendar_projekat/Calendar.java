package Kalendar_projekat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

		// kreirao objekat skener , kako bi omoguæio korisniku unos iz konzole
		Scanner unos = new Scanner(System.in);

		// pozvao metodu da paravi fajl i zapise listu korisnika(ovo samo radi
		// pri prvom pokretanju)
		napraviFileZaPodsjetnik();

		// metoda koja vrsi ispis opcija
		pocetniMeni();

		// try/catch blok nam omoguæava da uhvatim gresku prilikom unosa
		// podataka
		// i da vrati postupak(korisnika)na ocetak programa
		try {
			// korisnik bira opciju koju zeli
			int izbor = unos.nextInt();

			switch (izbor) {
			// prvi slucaj
			case 1:
				System.out
						.println(" Unesite godinu za koju zelite da se ispise kalendar:");
				// korisnik unosi godinu
				int godina = unos.nextInt();

				// validacija unosa godine, mora biti pozitivna
				while (godina < 0) {
					System.out
							.println("Godine ne moze biti negativna,pokusajte ponovo: ");
					// ponovo unosi godinu ako nije validno unjeo u predhodnom
					// navratu
					godina = unos.nextInt();
				}

				System.out.println("Unesite mjesec(u numerickom obliku):");
				// iz konzole korisnik unosi mjesec
				int mjesec = unos.nextInt();

				// validacija unosa mjeseca, mora biti od 1 do 12
				while (mjesec <= 0 || mjesec > 12) {

					System.out.println("Mjesec, mora biti od 1 do 12: ");

					// ponovan unos ako nije u predhodnom slucaj bio tacan
					mjesec = unos.nextInt();
				}
				// pozivamo metodu za printanje kalendara,
				// prosledjujem joj predhodno unesene argumente od strane
				// korisnika
				isprintajKalendar(mjesec, godina);

				System.out
						.println("Upisite :"
								+ "\nUpišite 1, ako zelite staviti neki podsjetnik za ovaj mjesec i godinu!\n"
								+ "2-Upišite 2,ako zelite pogledati neki drugi mjesec u "
								+ godina
								+ " godini.\nUpišite 3,da izadjete iz programa");

				// korisnik bira dalji smjer kretanja kroz program
				int odgovor = unos.nextInt();

				while (odgovor == 1 || odgovor == 2) {

					// u koliko je izabrao "da" , ulazi u selekciju
					if (odgovor == 1) {

						System.out.println("Unesite dan:");
						// koisnk unosi dan
						int dan = unos.nextInt();

						// validacija da li postoji taj dan u mjesecu,
						// u slucaju greske ulazi u petlju i vrti dok korisnik
						// ne
						// unese validan dan
						while (dan > brojDanaumjesecu(mjesec, godina)
								|| dan <= 0) {
							System.out
									.println(mjesec
											+ " mjesec "
											+ godina
											+ " godine ima izmedju 1 i "
											+ brojDanaumjesecu(mjesec, godina)
											+ "dan(a)\nUpišite ponovo dan za koji zelite podsjetnik");
							// ponovan unos iz konzole
							dan = unos.nextInt();
						}

						System.out.println("Unesite podsjetnik");

						// jedan prazan nextLine, zbog problema sa preskakanjem
						// pravog nextLine-a
						unos.nextLine();

						// unosi zapis-podsjetnik za dati dan, mjesec godinu.
						String podsjetnik = unos.nextLine();

						// metoda koja zapisuje podsjetnik, prima 4 argumenta od
						// strane korisnika
						staviPodsjetnik(podsjetnik, godina, mjesec, dan);
						System.out
								.println("Upisite :"
										+ "\nUpišite 1, ako zelite staviti neki podsjetnik za ovaj mjesec i godinu!\n"
										+ "2-Upišite 2,ako zelite pogledati neki drugi mjesec u "
										+ godina
										+ " godini.\nUpišite 3,da izadjete iz programa");
					}

					// ako je korisnik izabrao da isprinta jos neki
					// mjesec"upada" u ovu selekciju
					if (odgovor == 2) {

						System.out.println("Unesite mjesec, numericki:");

						// korisnik unosi mjesec koji zeli
						mjesec = unos.nextInt();

						// preko while petlje omogucujemo ponovan unos za
						// "mjesec",
						// u slucaju da korisnik nije izabrao u granici od 1 do
						// 12.
						while (mjesec < 0 || mjesec > 12) {
							System.out
									.println("Mjeseca, mora biti od 1 do 12: ");

							mjesec = unos.nextInt();
						}

						// poziva metodu za ispis kalendara, prosledjujemo
						// argumente
						// i ispisujemo
						isprintajKalendar(mjesec, godina);

						System.out
								.println("Upisite :"
										+ "\nUpišite 1, ako zelite staviti neki podsjetnik za ovaj mjesec i godinu!\n"
										+ "2-Upišite 2,ako zelite pogledati neki drugi mjesec u "
										+ godina
										+ " godini.\nUpišite 3,da izadjete iz programa");
						odgovor = unos.nextInt();

					}
				}
				if (odgovor == 3) {
					System.out.println("Dovidjenja");
					Calendar.main(args);
				} else {
					System.out
							.println("Pogresan unos, vraceni ste na pocetak programa");
					Calendar.main(args);
				}
				// na kraju ovog "case-a", pozivam main metodu i vracam stvar na
				// pocetak
				Calendar.main(args);

			case 2:
				System.out
						.println(" Unesite godinu za koju zelite da se ispisu podsjetnici:");
				// iz konzole, korisnik upisuje zeljenu god.
				godina = unos.nextInt();

				// validacija unosa godine, mora biti pozitivna
				while (godina < 0) {
					System.out
							.println("Godine ne moze biti negativna,pokusajte ponovo: ");
					// ponovo unosi godinu ako nije validno unjeo u predhodnom
					// navratu
					godina = unos.nextInt();
				}

				System.out.println("Unesite mjesec(u numerickom obliku):");
				// iz konzole korisnik unosi mjesec
				mjesec = unos.nextInt();

				// preko while petlje omogucujemo ponovan unos za "mjesec",
				// u slucaju da korisnik nije izabrao u granici od 1 do 12.
				while (mjesec < 0 || mjesec > 12) {
					System.out.println("Mjeseca, mora biti od 1 do 12: ");

					mjesec = unos.nextInt();
				}

				// pozivamo metodu za printanje kalendara,
				// prosledjujem joj unesene argumente (godina i mjesec) od
				// strane korisnika

				ispisiPOdsjetnikeZaDatiMjesecIGodinu(godina, mjesec);

				// na kraju"case-a", pozivam main metodu i vracam stvar na
				// pocetak
				Calendar.main(args);

			case 3:
				System.out
						.println(" Unesite godinu za koju zelite da se ispisu podsjetnici:");
				godina = unos.nextInt();
				ispisiPOdsjetnikeZaDatuGodinu(godina);
				Calendar.main(args);

			case 4:
				ispisiSvePOdsjetnike();

				// na kraju"case-a", pozivam main metodu i vracam stvar na
				// pocetak
				Calendar.main(args);

			case 5:

				System.out.println("Unesite godinu");
				godina = unos.nextInt();
				System.out.println("Unesite mjesec(u numerickom obliku):");

				mjesec = unos.nextInt();

				// preko while petlje omogucujemo ponovan unos za "mjesec",
				// u slucaju da korisnik nije izabrao u granici od 1 do 12.
				while (mjesec < 0 || mjesec > 12) {
					System.out.println("Mjeseca, mora biti od 1 do 12: ");

					mjesec = unos.nextInt();
				}

				System.out.println("Unesite dan(u numerickom obliku):");
				int dan = unos.nextInt();

				while (dan > brojDanaumjesecu(mjesec, godina) || dan <= 0) {
					System.out
							.println(mjesec
									+ " mjesec "
									+ godina
									+ " godine ima izmedju 1 i "
									+ brojDanaumjesecu(mjesec, godina)
									+ "dan(a)\nUpišite ponovo dan za koji zelite podsjetnik");
					// ponovan unos iz konzole
					dan = unos.nextInt();
				}
				System.out.println("Unesite podsjetnik");
				unos.nextLine();
				String podsjetnik = unos.nextLine();
				staviPodsjetnik(podsjetnik, godina, mjesec, dan);

				// na kraju"case-a", pozivam main metodu i vracam stvar na
				// pocetak
				Calendar.main(args);

			default:
				System.out
						.println("Pogresa unos, pokusajte sa opcijamam od 1 do 5!!");
				// na kraju"case-a", pozivam main metodu i vracam stvar na
				// pocetak
				Calendar.main(args);
			}
		}

		catch (Exception e) {
			System.out
					.println("Pogresan unos podataka, vraceni ste na pocetni meni.");
			Calendar.main(args);
		}

	}

	// metoda koja ispisuje pocetni meni , koji nudimo korisniku
	public static void pocetniMeni() {
		System.out
				.println("***********************************************\n"
						+ "Unesite 1 ako zelite vidjeti kalendar(za dati mjesec i godinu)\n"
						+ "Unesite 2 za pregled podsjetnika za dati mjesec i godinu\n"
						+ "Unesite 3 da pregledate podsjetnik za datu godinu\n"
						+ "Unesite 4 ako zelite da pogledate sve podsjetnike!\n"
						+ "Unesite 5 ako zelite da upisete neki podsjetnik!\n"
						+ ":::::::::::::::::::::::::::::::::::::::::::::::");
	}

	public static void napraviFileZaPodsjetnik() {
		String fileName = "podsjetnik.txt";
		File fajl = new File(fileName);
		if (!fajl.exists()) {
			Path path = Paths.get(fileName);
			{
				try {
					Files.createFile(path);
					System.out
							.println("Upravo je napravljen fajl za podsjetnik!");
				} catch (IOException e) {

					e.printStackTrace();
				}

				ListaPodsjetnika lista = new ListaPodsjetnika();

				try {
					ObjectOutputStream os = new ObjectOutputStream(
							new FileOutputStream(fileName));
					os.writeObject(lista);
					System.out
							.println("Upravo je ubacena lista podsjetnika u fajl");

					os.close();

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	public static void ispisiSvePOdsjetnike() {
		try {

			ObjectInputStream input = new ObjectInputStream(
					new FileInputStream("podsjetnik.txt"));
			try {
				ListaPodsjetnika lista = (ListaPodsjetnika) input.readObject();
				lista.ispisiSveNapomene();
				input.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void ispisiPOdsjetnikeZaDatiMjesecIGodinu(int godina,
			int mjesec) {
		try {

			ObjectInputStream input = new ObjectInputStream(
					new FileInputStream("podsjetnik.txt"));
			try {
				ListaPodsjetnika lista = (ListaPodsjetnika) input.readObject();
				lista.ispisiNapomeneZaDatiMjesecIgodinu(godina, mjesec);
				input.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void ispisiPOdsjetnikeZaDatuGodinu(int godina) {
		try {

			ObjectInputStream input = new ObjectInputStream(
					new FileInputStream("podsjetnik.txt"));
			try {
				ListaPodsjetnika lista = (ListaPodsjetnika) input.readObject();
				lista.ispisiNapomeneZaGodinu(godina);
				input.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void staviPodsjetnik(String podsjetnik, int godina,
			int mjesec, int dan) {

		Podsjetnik podsjeta = new Podsjetnik(podsjetnik, godina, mjesec, dan);
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"podsjetnik.txt"));
			try {
				ListaPodsjetnika lista = (ListaPodsjetnika) is.readObject();
				lista.dodajPodsjetnik(podsjeta);

				ObjectOutputStream upis = new ObjectOutputStream(
						new FileOutputStream("podsjetnik.txt"));
				upis.writeObject(lista);
				is.close();
				upis.close();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// metoda koja vraca true , ako je god prestupna
	public static boolean daLiJePrestupnaGodina(int godina) {
		if ((godina % 4 == 0) && (godina % 100 != 0))
			return true;
		if (godina % 400 == 0)
			return true;
		return false;
	}

	// metoda koja vraca pocetni dan(google)
	// red je da se prijavi
	public static int dan(int mjesec, int day, int godina) {

		int y = godina - (14 - mjesec) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = mjesec + 12 * ((14 - mjesec) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		return d;
	}

	public static void isprintajKalendar(int mjesec, int godina) {
		// mjeseci su stavljeni u niz
		String[] months = {
				"", // prvo mjesto u nizu je prazno, kako bi mjeseci bili
					// klasicno predstavljeni od 1 do 12
				"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December" };

		// broj dana po mjesecima su takodje u nizu
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// provjera da li je god. prestupna, ako jeste,onda feb. ima 29 dana
		if (mjesec == 2 && daLiJePrestupnaGodina(godina))
			days[mjesec] = 29;

		// ispis zaglavlja kalendara
		System.out.println("   " + months[mjesec] + " " + godina);
		System.out.println(" S  M Tu  W Th  F  S");

		// praznina
		int d = dan(mjesec, 1, godina);

		// ispis prazne dane
		for (int i = 0; i < d; i++)
			System.out.print("   "); // sve do pocetnog dana ide prazan string
		for (int i = 1; i <= days[mjesec]; i++) { // petlja ide koliko ma dana u
													// mjesecu
			System.out.printf("%2d ", i);
			if (((i + d) % 7 == 0) || (i == days[mjesec])) // uslov za prelazak
															// u
															// novi red
				System.out.println();
		}

	}

	// metoda koja ima dva parametra i vraca broj dana u mjesecu
	public static int brojDanaumjesecu(int mjesec, int godina) {

		// broj dana po mjesecima su takodje u nizu
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// provjera da li je god. prestupna, ako jeste,onda feb. ima 29 dana
		if (mjesec == 2 && daLiJePrestupnaGodina(godina)) {
			return 29;
		}
		return days[mjesec];
	}
}
