package Kviz;

import java.io.Serializable;

public class Pitanje implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4217726870715705255L;
	private String pitanje;
	private String tacan_odgovor;

	public Pitanje(String pitanje, String tacan_odgovor) {
		this.pitanje = pitanje;
		this.tacan_odgovor = tacan_odgovor;
	}
public void editPitanje(String dioKojiEditujemo,
		String noviDioPitanja){
	
	if (getPitanje().contains(dioKojiEditujemo)) {
		setPitanje(getPitanje().replace(dioKojiEditujemo,noviDioPitanja ));
		System.out.println("Pitanje u kvizu sada izgleda ovako:\n" + getPitanje());
	}
	else System.out.println("Pitanje "+getPitanje()+" ne sadrzi u sebi "+dioKojiEditujemo);
}
public void promjeniOdgovor(String dioKojiEditujemo,
		String noviDioOdgovora){
	
	if (getTacan_odgovor().contains(dioKojiEditujemo)) {
		setTacan_odgovor(getTacan_odgovor().replace(dioKojiEditujemo,noviDioOdgovora));
		System.out.println("Odgovor sada izgleda ovako:\n" +getTacan_odgovor());
	}
	else System.out.println("Pitanje "+getTacan_odgovor()+" ne sadrzi u sebi "+dioKojiEditujemo);
}
	public String getPitanje() {
		return pitanje;
	}

	public void setPitanje(String pitanje) {
		this.pitanje = pitanje;
	}

	public String getTacan_odgovor() {
		return tacan_odgovor;
	}

	public void setTacan_odgovor(String tacan_odgovor) {
		this.tacan_odgovor = tacan_odgovor;
	}

	@Override
	public String toString() {
		return pitanje;
	}
}
