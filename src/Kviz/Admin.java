package Kviz;

import java.io.Serializable;
import java.util.ArrayList;

public class Admin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8218141080728055198L;
	private String ime;
	private String pass;

	private ArrayList<Pitanje> listaPitanja;
	private ArrayList<User> listaUser_a;

	public Admin(String i, String p) {
		ime = i;
		pass = p;
		listaPitanja = new ArrayList<>();
		listaUser_a = new ArrayList<>();

	}

	public String getIme() {
		return ime;
	}

	public String getPass() {
		return pass;
	}

	public boolean validacijaIgraca(String ime, String pass) {
		for (User igrac : listaUser_a) {
			if (igrac.getIme() == ime && igrac.getPass() == pass)
				return true;
		}
		return false;
	}

	public boolean daLiPostojiKorisnik(String ime) {
		for (User korisnik : listaUser_a) {
			if (korisnik.getIme().equals(ime))
				return true;
		}
		return false;
	}

	public boolean validacijaKorisnia(String ime, String pass) {
		for (User korisnik : listaUser_a) {
			if (korisnik.getIme().equals(ime)
					&& korisnik.getPass().equals(pass))
				return true;
		}
		return false;
	}

	public void obrisiIgraca(String ime) {

		for (int i = 0; i < listaUser_a.size(); i++) {
			if (listaUser_a.get(i).getIme().equals(ime)) {
				
				User user = listaUser_a.get(i);
				listaUser_a.remove(user);
			}

		}
	}
	public void obrisiPitanje(int brojPitanja) {
	
				Pitanje pitanje= listaPitanja.get(brojPitanja);
				listaPitanja.remove(pitanje);
		
	}

	public void doajBod(String ime) {
		for (User korisnik : listaUser_a) {
			if (korisnik.getIme().equals(ime)) {

				korisnik.setBrTacnihOdgvora(1);
			}
		}
	}

	public Pitanje postaviPitanje(int index) {
		return listaPitanja.get(index);

	}

	public void DodajPitanjeUListu(Pitanje pitanje) {
		listaPitanja.add(pitanje);
		System.out.println("Upravo ste dodali: \nPitanje-> "
				+ pitanje.getPitanje() + "?\nOdgovr->"
				+ pitanje.getTacan_odgovor()+".");

	}

	public void provjeriStanjeBodova(String ime) {
		for (User korisnik : listaUser_a) {
			if (korisnik.getIme().equals(ime)) {

				System.out
						.println(ime
								+ " do sada vasim ucestvovanjem u Java kviz ste osvojili "
								+ korisnik.getBrTacnihOdgvora() + " poen(a).");
			}
		}
	}

	public void ispisRezultaDatogKorisnika(String ime) {
		for (User korisnik : listaUser_a) {
			if (korisnik.getIme().equals(ime)) {
				korisnik.ispisiDosadasnjeRezultate();
			}
		}
	}

	public void registrovanjePartije(String ime, int poeni) {
		for (User korisnik : listaUser_a) {
			if (korisnik.getIme().equals(ime)) {
				korisnik.upisiPartiju(poeni);
			}
		}
	}

	public int brojPitanja() {
		return listaPitanja.size();
	}

	public void DodajUseraU_Listu(User user) {
		listaUser_a.add(user);

	}

	public String dohvatiImeUsera(User user) {
		return user.getIme();

	}

	public void ispisiPitanja() {
		int brojPitanja = 0;
		for (Pitanje pitanje : listaPitanja) {
			brojPitanja++;
			System.out.println("Pitanje br " + brojPitanja + ") "
					+ pitanje.getPitanje() + "?\nOdgovor: "
					+ pitanje.getTacan_odgovor() + ".\n");

		}
		if (brojPitanja == 0) {
			System.out
					.println("Nemate jos niti jednog pitanja u kvizu,\nunesite pitanja!");
		}
	}

	public void dohvatiPitanje(int redniBrojPitanja) {
		if (redniBrojPitanja > listaPitanja.size()) {
			System.out.println("Ne postoji izabrano pitanje na listi!");
		} else {
			Pitanje pitanje = listaPitanja.get(redniBrojPitanja);
			System.out.println("Pitanje" + pitanje.getPitanje());

		}
	}

	public void dohvatiOdgovor(int redniBroj) {
		if (redniBroj > listaPitanja.size()) {
			System.out.println("Ne postoji izabrano pitanje na listi!");
		} else {
			Pitanje pitanje = listaPitanja.get(redniBroj);
			System.out.println("Odgovor: " + pitanje.getTacan_odgovor());

		}
	}

	public void editujPitanjeAdmin(int redniBrojPitanja,
			String dioKojiEditujemo, String noviDioPitanja) {

		if (redniBrojPitanja < listaPitanja.size()) {
			Pitanje pitanje = listaPitanja.get(redniBrojPitanja);
			pitanje.editPitanje(dioKojiEditujemo, noviDioPitanja);

		} else {
			System.out
					.println("Kviz ne posjeduje pitanje pod unesenim rednim brojem");
		}
	}

	public void editOdgovorAdmin(int redniBrojOdgovora,
			String dioKojiEditujemo, String noviDioOdgovora) {

		if (redniBrojOdgovora < listaPitanja.size()) {
			Pitanje pitanje = listaPitanja.get(redniBrojOdgovora);
			pitanje.promjeniOdgovor(dioKojiEditujemo, noviDioOdgovora);

		} else {
			System.out.println("Kviz ne sadrzi " + redniBrojOdgovora
					+ " odgovora, vec " + listaPitanja.size());
		}
	}
}
