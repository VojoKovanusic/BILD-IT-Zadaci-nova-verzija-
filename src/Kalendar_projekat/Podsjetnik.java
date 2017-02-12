package Kalendar_projekat;
import java.io.Serializable;

class Podsjetnik implements Serializable {
	// za zapis objekata u fajlove korištena je serilizacija
	private static final long serialVersionUID = 1L;
	// atributi klase,
	private String napomena;
	private int godina;
	private int dan;
	private int mjesec;

	// konstruktor
	public Podsjetnik(String napomena, int godina, int mjesec, int dan) {

		this.napomena = napomena;
		this.godina = godina;
		this.dan = dan;
		this.mjesec = mjesec;
	}

	// vraca godinu
	public int getGodina() {
		return godina;
	}

	// vraca mjesec
	public int getMjesec() {
		return mjesec;
	}

	@Override
	public String toString() {
		return "Podsjetnik: *" + napomena + "*, datum napomene: " + dan + "."
				+ mjesec + "." + godina + ".";
	}

}
