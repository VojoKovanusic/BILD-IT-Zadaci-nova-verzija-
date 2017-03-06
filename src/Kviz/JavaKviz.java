package Kviz;

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
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JavaKviz {
	static Scanner unos = new Scanner(System.in);
	private static ObjectInputStream is;

	public static void main(String[] args) {

		// pozivamo metode da napravimo neophodne fajlove za podatke, u slucaju
		// da ne postoje
		/*
		 * ubaciPitanjeUKviz("Da li je java?" + "\n1-Objektno orjentisana" +
		 * "\n2-Objektno projektovana" + "\n3-Projektovano orjetisana" +
		 * "\n2-Orjentisano projektovana", "1");
		 */

		napraviFileKviz();
		napraviFileZaRezultate();

		// ispisi opstih podatka
		ispisDobrodoslice();
		ispisiGlavniMeni();

		// unos za zeljenu opciju kretanje kroz meni
		try {
			int meni = unos.nextInt();

			switch (meni) {
			case 1: {
				System.out.println("Unesite zeljeno korisnicko ime: ");
				String ime = unos.next();

				System.out.println("Unesite vasu sifru:");
				String password = unos.next();

				// registracija igraca, sa prehodno unjetim podacima
				ubaciUsera_U_kviz(ime, password);

				// vracanje na pocetni meni, nakon registracije
				JavaKviz.main(args);
			}
			case 2:
				System.out.println("Unesite vase korisnicko ime: ");
				String ime = unos.next();

				System.out.println("Unesite vasu sifru:");
				String password = unos.next();
				int izborIgraca = 1;

				if (validacijaIgraca(ime, password)) {

					ispisMeniIgrac();

					izborIgraca = unos.nextInt();
					do {
						if (izborIgraca == 1) {
							odigrajteJednuPartiju(ime);

							izborIgraca = unos.nextInt();
						}
						if (izborIgraca == 2) {
							ispisiDosadasnjeRezultateKorisnika(ime);

							System.out.println("Unesite zeljeni izbor(broj):");
							izborIgraca = unos.nextInt();
						}
						if (izborIgraca == 3) {
							ispisiTop100();
							System.out.println("\n");

							izborIgraca = unos.nextInt();
						}
						if (izborIgraca == 4) {
							System.out.println("Uprvo ste izlogovani.");
							JavaKviz.main(args);
						}
						if (izborIgraca > 4) {
							System.out
									.println("Unos nije validan izlogovani ste.");
							JavaKviz.main(args);
						}
					} while (izborIgraca < 5);
				}
				if (!validacijaIgraca(ime, password)) {
					System.out
							.println("Niste unjeli validne podatke,vraceni ste na pocetni meni.");
					JavaKviz.main(args);
				}

			case 3:

				System.out.println("Unesite vase administratorsko ime: ");
				String korisnickoIme = unos.next();
				unos.nextLine();
				System.out.println("Unesite vasu sifru:");
				String pass = unos.next();
				int admin = 1;
				if (korisnickoIme.equals("a") && pass.equals("a")) {
					ispisMenijaAdminu();

					admin = unos.nextInt();
					do {
						if (admin == 1) {

							ubaciPitanjeUKviz();
							admin = unos.nextInt();
						}
						if (admin == 2) {
							ispisiSvaPitanjaUKvizu();
							System.out
									.println("Da editujete pitanje, unesite \"p\""
											+ "\nDa editujete odgovor, unesite \"o\" :");
							String str = unos.next();
							if (str.equalsIgnoreCase("o")) {

								editujOdgovor();
								ispisMenijaAdminu();
								admin = unos.nextInt();
							}
							if (str.equalsIgnoreCase("p")) {

								System.out
										.println("Unesite redni broj pitanja");
								int redniBrojPitanja = unos.nextInt();

								System.out
										.println("Unesite dio pitanja koji zelite dodati:");
								unos.nextLine();
								String noviDioPitanja = unos.nextLine();

								System.out
										.println("Unesite dio pitanja koji zelite editovati:");

								String dioKojiEditujemo = unos.nextLine();

								editujPitanje(redniBrojPitanja, noviDioPitanja,
										dioKojiEditujemo);
								ispisMenijaAdminu();
								admin = unos.nextInt();
							} else {
								System.out.println("izbor nije bio validan ");
								ispisMenijaAdminu();
								admin = unos.nextInt();
							}

						}
						if (admin == 3) {
							obrisiTakmicara();

							admin = unos.nextInt();
						}
						if (admin == 4) {
							ispisiSvaPitanjaUKvizu();
							admin = unos.nextInt();

						}
						if (admin == 5) {
							System.out
									.println("Uspjesno ste se izlogovali iz admin.menija");
							JavaKviz.main(args);
						}
						if (admin > 6) {
							System.out
									.println("Niste broj koji ima u admin. meniju, izlogovani ste iz admin. menija!");
							JavaKviz.main(args);
						}

					} while (admin < 6);
				}

				else {
					System.out
							.println("Niste unjeli podatke koje odgovaraju administratoru, izlogovani ste iz admin. menija!");
					JavaKviz.main(args);
				}

			}

		} catch (InputMismatchException e) {
			System.out.println("Ilegalan unos, izlogovani ste!");
			JavaKviz.main(args);
		}
		/*
		 * ubaciPitanjeUKviz("Da li je ja va OOP?", "da");
		 * ubaciPitanjeUKviz("Kako se zove ovaj znak u javi \" %\"", "modulo");
		 * ubaciPitanjeUKviz(
		 * "Sta nam omoguca va da izadjemo na kraj sa izuzetcim",
		 * "Exeption handling");
		 * 
		 * ispisiPrvihStoUcesnika(); ubaciUsera_U_kviz("drago", "123");
		 * ubaciUsera_U_kviz("simo", "123");
		 */

		/*
		 * * ispisiSvaPitanjaUKvizu(); ubaciUsera_U_kviz("Vojo", "123");
		 * ubaciUsera_U_kviz("Drago", "123"); odigrajteJednuPartiju("Vojo");
		 * ispisiPrvihStoUcesnika();
		 */
	}

	private static void ispisDobrodoslice() {
		System.out.println("\n\t\t**************" + "\n\t\t**KVIZ JAVA***"
				+ "\n\t\t**************\n");

	}

	public static void ispisiGlavniMeni() {

		System.out.println("Unesite zeljeni izbor(broj):\n"
				+ "1) Registrujte se" + "\n2) Korisnicki meni"
				+ "\n3) Admnistratorski meni");
	}

	public static void ispisMenijaAdminu() {
		System.out.println("Unesite zeljeni izbor(broj):\n"
				+ "1) Dodavanje odgovora / pitanja "
				+ "\n2) Editovanje pitanja / odgovora "
				+ "\n3) Brisanje korisnika"
				+ "\n4) Ispisi sva pitanja i odgovore u kvizu"
				+ "\n5) Da se izlogujete");
	}

	public static void ispisMeniIgrac() {
		System.out
				.println("****Unesite zeljeni izbor(broj)****\n"
						+ "1) Odigraj jednu partiju kviza"
						+ "\n2) Izlistj rezultate prethodnih partija"
						+ "\n3) Izlistaj top 100 rezultata svih registrovanih korisnika"
						+ "\n4) Da se izlogujete");
	}

	public static void napraviFileKviz() {
		String fileName = "kviz.txt";
		File fajl = new File(fileName);

		if (!fajl.exists()) {
			Path path = Paths.get(fileName);
			{
				try {
					Files.createFile(path);
					System.out.println("Upravo je napravljen fajl za kviz!");
				} catch (IOException e) {

					e.printStackTrace();
				}

				Admin admin = new Admin("Vojo", "kkwbs");

				try {
					ObjectOutputStream os = new ObjectOutputStream(
							new FileOutputStream(fileName));
					os.writeObject(admin);

					System.out
							.println("Upravo je zapisan administrator u fajl.");

					os.close();

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	public static void napraviFileZaRezultate() {
		String fileName = "rezultati.txt";
		File fajl = new File(fileName);

		if (!fajl.exists()) {
			Path path = Paths.get(fileName);
			{
				try {
					Files.createFile(path);
					System.out
							.println("Upravo je napravljen fajl za rezultate!");
				} catch (IOException e) {

					e.printStackTrace();
				}

				Top100 admin = new Top100();

				try {
					ObjectOutputStream os = new ObjectOutputStream(
							new FileOutputStream(fileName));
					os.writeObject(admin);

					System.out
							.println("Upravo je zapisan objekat za rez. u fajl.");

					os.close();

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	public static void ubaciUsera_U_kviz(String ime, String pass) {

		User korisnik = new User(ime, pass);
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"kviz.txt"));
			try {

				Admin admin = (Admin) is.readObject();
				if (admin.daLiPostojiKorisnik(ime)) {
					System.out.println("Korisnik " + ime
							+ " vec postoji, niste se registrovali.");
				}

				else {
					admin.DodajUseraU_Listu(korisnik);
					System.out.println("Uspjesno se registrovao korisnik "
							+ ime);
				}

				ObjectOutputStream upis = new ObjectOutputStream(
						new FileOutputStream("kviz.txt"));
				upis.writeObject(admin);
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

	public static void obrisiTakmicara() {

		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"kviz.txt"));
			try {
				System.out.println("Unesite ime igraca kojeg zelite obrisati:");
				String ime = unos.next();

				Admin admin = (Admin) is.readObject();
				if (!admin.daLiPostojiKorisnik(ime)) {
					System.out.println("Igrac " + ime
							+ " ne postoji, niste ga stoga ni obrisali .");
				}

				else {

					admin.obrisiIgraca(ime);
					System.out.println("Igrac " + ime + " je obrisan");
				}
				ispisMenijaAdminu();
				ObjectOutputStream upis = new ObjectOutputStream(
						new FileOutputStream("kviz.txt"));
				upis.writeObject(admin);
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

	// nesto sam dirao oko is....nema inicijalizacije klasicne
	public static boolean validacijaIgraca(String ime, String pass) {

		try {
			is = new ObjectInputStream(new FileInputStream("kviz.txt"));
			try {

				Admin admin = (Admin) is.readObject();
				return (admin.validacijaKorisnia(ime, pass));

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static void ubaciPitanjeUKviz() {
		System.out.println("Unesite pitanje:");
		unos.nextLine();
		String pitanje = unos.nextLine();
		System.out.println("Unesite odgovor koji zelite:");

		String odgovor = unos.nextLine();
		Pitanje pitanje1 = new Pitanje(pitanje, odgovor);
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"kviz.txt"));
			try {
				Admin admin = (Admin) is.readObject();
				admin.DodajPitanjeUListu(pitanje1);

				ObjectOutputStream upis = new ObjectOutputStream(
						new FileOutputStream("kviz.txt"));
				upis.writeObject(admin);
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

	public static void editujPitanje(int redniBrojPitanja,
			String noviDioPitanja, String dioKojiEditujemo) {

		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"kviz.txt"));
			try {
				Admin admin = (Admin) is.readObject();

				admin.editujPitanjeAdmin(redniBrojPitanja, dioKojiEditujemo,
						noviDioPitanja);

				ObjectOutputStream upis = new ObjectOutputStream(
						new FileOutputStream("kviz.txt"));
				upis.writeObject(admin);
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

	public static void dohvatiOdgovor(int redniBrojOdgovora) {

		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"kviz.txt"));
			try {
				Admin admin = (Admin) is.readObject();

				admin.dohvatiOdgovor(redniBrojOdgovora);

				ObjectOutputStream upis = new ObjectOutputStream(
						new FileOutputStream("kviz.txt"));
				upis.writeObject(admin);
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

	public static void editujOdgovor() {

		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"kviz.txt"));
			try {
				Admin admin = (Admin) is.readObject();

				System.out.println("Unesire redni broj odgovora:");
				int redniBrojOdgovora = unos.nextInt();

				dohvatiOdgovor(redniBrojOdgovora);

				System.out
						.println("Unesite dio odgovora koji zelite izbaciti:");
				String dioKojiEditujemo = unos.next();
				System.out.println("Unesite dio odgovora koji zelite ubaciti:");
				unos.nextLine();
				String noviDioOdgovora = unos.next();

				admin.editOdgovorAdmin(redniBrojOdgovora, dioKojiEditujemo,
						noviDioOdgovora);

				ObjectOutputStream upis = new ObjectOutputStream(
						new FileOutputStream("kviz.txt"));
				upis.writeObject(admin);
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

	public static void ispisiSvaPitanjaUKvizu() {
		try {

			ObjectInputStream input = new ObjectInputStream(
					new FileInputStream("kviz.txt"));
			try {
				Admin admin = (Admin) input.readObject();

				// ispis trazenih podataka
				admin.ispisiPitanja();
				input.close();

				// nakon iscitavanja podataka, nudimo administratoru smjernice
				// za dalje kretanje po meniju
				ispisMenijaAdminu();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void ispisiDosadasnjeRezultateKorisnika(String ime) {
		try {

			ObjectInputStream input = new ObjectInputStream(
					new FileInputStream("kviz.txt"));
			try {
				Admin admin = (Admin) input.readObject();
				admin.ispisRezultaDatogKorisnika(ime);
				ispisMeniIgrac();
				input.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void odigrajteJednuPartiju(String ime) {
		int bodovi = 0;
		try {

			ObjectInputStream input = new ObjectInputStream(
					new FileInputStream("kviz.txt"));
			try {

				Admin admin = (Admin) input.readObject();

				int size = admin.brojPitanja();
				int brojac = 0;
				ArrayList<Integer> list = new ArrayList<Integer>(size);
				for (int i = 1; i <= size; i++) {
					list.add(i);
				}

				Random rand = new Random();
				// brojac osvojenih bodova po partiji
				int brBodova = 0;

				while (list.size() > 0) {
					brojac++;
					// podesimo na zeljeni broj pitanja
					if (brojac == 5) {
						break;
					}
					// dobijamo random vrjednost indexa koji se ne ponavlja
					int index = rand.nextInt(list.size());
					int random = list.remove(index);

					// moramo smanjiti index za jedan da ne bi izasao iz liste
					// objekt "pitanje" instanciramo pozivanjem metode koja ima
					// tip returna Pitanje

					Pitanje pitanje = admin.postaviPitanje(random - 1);

					System.out.println("Pitanje br " + brojac + ": "
							+ pitanje.getPitanje());
					System.out.println("Unesite vas odgovor:");
					unos.nextLine();
					String odgovor = unos.nextLine();

					// ako je odgovr tacan , zanemarujuci velika slova
					if (odgovor.equalsIgnoreCase(pitanje.getTacan_odgovor())) {
						System.out
								.println("Vas odgovor je tacan, upravo ste dobili jedan poen!\n");
						admin.doajBod(ime);
						brBodova++;

					} else {

						System.out
								.println("Vas odgovor nije taca, tacan odgovor je: "
										+ pitanje.getTacan_odgovor() + ".\n");
					}

					ObjectOutputStream upis = new ObjectOutputStream(
							new FileOutputStream("kviz.txt"));
					upis.writeObject(admin);

					upis.close();
					input.close();
					// da mozemo izlistati sve dosadasnje igre za datog igraca
					registrujPartiju(ime, brBodova);
					// upisivanje rezultata za top 100 takmicara nakon svake partije
					ubaciPartijuUTop100(ime, brBodova);
				}
				System.out.println("Osvojili ste upravo " + brBodova
						+ " poen(a).");
				admin.provjeriStanjeBodova(ime);
				bodovi = brBodova;

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		ispisMeniIgrac();
	}

	private static void registrujPartiju(String ime, int poeni) {
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"kviz.txt"));
			try {

				Admin admin = (Admin) is.readObject();
				admin.registrovanjePartije(ime, poeni);

				ObjectOutputStream upis = new ObjectOutputStream(
						new FileOutputStream("kviz.txt"));
				upis.writeObject(admin);
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

	private static void ubaciPartijuUTop100(String ime, int poeni) {
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"rezultati.txt"));
			try {

				Top100 rez = (Top100) is.readObject();
				rez.dodajTakmicara(ime, poeni);

				ObjectOutputStream upis = new ObjectOutputStream(
						new FileOutputStream("rezultati.txt"));
				upis.writeObject(rez);
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

	private static void ispisiTop100() {
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"rezultati.txt"));
			try {

				Top100 object = (Top100) is.readObject();
				object.sortiraj();
				object.ispisiTop100();

				ObjectOutputStream upis = new ObjectOutputStream(
						new FileOutputStream("rezultati.txt"));
				upis.writeObject(object);
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
		ispisMeniIgrac();
	}

}
