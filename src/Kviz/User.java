package Kviz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3872443537482870163L;
	private int brTacnihOdgvora;

	private String ime;
	private String pass;
	private ArrayList<Integer> bodovi;
	private ArrayList<Integer> listaPartija;

	public User(String ime, String pass) {

		this.ime = ime;
		this.pass = pass;
		listaPartija = new ArrayList<>();
	}

	public void upisiPartiju(int bodovi) {
		listaPartija.add(bodovi);
	}

	public void ispisiDosadasnjeRezultate() {
		int i = 1;
		int sumaBodova = 0;
		for (Integer partija : listaPartija) {
			sumaBodova += partija;
			System.out.println("Partija br." + i + ") osvojeno " + partija
					+ " poen(a)");
			i++;
		}
		System.out.println("***Ukupno ste osvojili " + sumaBodova
				+ " poen(a) u dosadasnjeum ucestvovanjem u Java kvizu***\n");
		
	}

	public int getBrTacnihOdgvora() {
		return brTacnihOdgvora;
	}

	public void setBrTacnihOdgvora(int brBodova) {
		this.brTacnihOdgvora += brBodova;
	}

	public String getPass() {
		return pass;
		
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getIme() {
		return ime;
	}

	@Override
	public String toString() {
		return ime + " ima " + brTacnihOdgvora + " tacnih odgovora.";

	}

}
