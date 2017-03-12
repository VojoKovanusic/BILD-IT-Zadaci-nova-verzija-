package Kviz;

import java.io.Serializable;

public class Top100 implements Serializable {

	private static final long serialVersionUID = 1L;
	private String takmicari[] = new String[100];
	private int bodovi[] = new int[100];

	public void sortiraj() {
		for (int i = 0; i < bodovi.length; i++) {
			for (int j = 0; j < bodovi.length; j++) {
				if (bodovi[i] > bodovi[j]) {
					int temp = bodovi[i];
					bodovi[i] = bodovi[j];
					bodovi[j] = temp;

					String zamjeni = takmicari[i];
					takmicari[i] = takmicari[j];
					takmicari[j] = zamjeni;
				}

			}

		}
		
	}

	public String[] getTakmicari() {
		return takmicari;
	}

	
	public int[] getBodovi() {
		return bodovi;
	}
//ako prodjemo validaciju dodajemo 
	public void dodajTakmicara(String ime, int bod) {
		sortiraj();
		int mjesto=0;
		if (validacija(bod)) {
			for (int i = 0; i < bodovi.length; i++) {
				// kada dodje do praznog mjesta
				if (bodovi[i] == 0) {
					bodovi[i] = bod;
					takmicari[i] = ime;
					mjesto=i;
					break;
				} 
				else {
					bodovi[99] = bod;
					takmicari[99] = ime;
					mjesto =100;
				}
			}
			System.out.println("Upavo ste usli u top 100, na mjesto br"+mjesto);
		}
	}

	public void ispisiTop100() {
		for (int i = 0; i < 100; i++) {
			if (bodovi[i] == 0) {
				break;
			}
			System.out.println((i+1)+") mjesto: " + takmicari[i] + " sa osvojenih  " + bodovi[i]
					+ " poen(a)");

		}
	}
//da provjerimo da li su osvojeni bodovi dovolji da udju u top100
	public boolean validacija(int bod) {
		sortiraj();
		for (int i = 0; i < bodovi.length; i++) {
			if (bodovi[i] == 0) {
				return true;
			}
			if (bodovi[99] < bod)
				return true;
		}
		return false;
	}
}