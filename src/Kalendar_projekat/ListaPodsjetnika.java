package Kalendar_projekat;
import java.io.Serializable;
import java.util.ArrayList;

class ListaPodsjetnika implements Serializable {
	// za upis i izpis objekata iz fajlova koristena je serijalizacija
	private static final long serialVersionUID = 1L;

	// deklaracija atributa klase u koji ce biti smjesteni svi podsjetnici
	private ArrayList<Podsjetnik> lista;

	// konstruktor, gdje inicjalizujemo
	public ListaPodsjetnika() {
		lista = new ArrayList<>();
	}

	// da se doda podsjetnik u listu
	public void dodajPodsjetnik(Podsjetnik podsjetnik) {
		lista.add(podsjetnik);

	}

	// metoda sa dva parametra
	public void ispisiNapomeneZaDatiMjesecIgodinu(int godina, int mjesec) {
		int i = 0;// redni broj napomene

		// prolazimo kroc cjeli podsjetnik
		for (Podsjetnik podsjetnik : lista) {
			// ako unesena god- i mjese isti kao neki u listi, ispisujem
			if (godina == podsjetnik.getGodina()
					&& mjesec == podsjetnik.getMjesec()) {
				i++;
				System.out.println(i + ")" + podsjetnik);
			}

		}
		// ako nema ni jedne napomene za dati mjesec i godinu
		if (i == 0) {
			System.out.println("Nema napomena za dati mjesec i godinu");
		}

	}

	public void ispisiNapomeneZaGodinu(int godina) {
		int i = 0;// redni broj napomene
		// prolazimo kroz listu, ako se desi ista kao sto je prosledjena metodi
		// , ispis

		for (Podsjetnik podsjetnik : lista) {
			if (godina == podsjetnik.getGodina()) {
				i++;
				System.out.println(i + ")" + podsjetnik);

			}
		}
		// ako nema ni jedne napomene
		if (i == 0) {
			System.out.println("Nema unesenih napomena");
		}
	}

	// kao sto ime metode kaze
	public void ispisiSveNapomene() {
		int i = 0;// redni broj napomene
		int brojac = 0;
		for (Podsjetnik podsjetnik : lista) {

			i++;
			System.out.println(i + ")" + podsjetnik);
			brojac = i;
		}
		if (brojac == 0) {
			System.out.println("Nema unesenih napomena!!");
		}

	}

	@Override
	public String toString() {
		return "ListaPodsjetnika [lista=" + lista + "]";
	}

}
