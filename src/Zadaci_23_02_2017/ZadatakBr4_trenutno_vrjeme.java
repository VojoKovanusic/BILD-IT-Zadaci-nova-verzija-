package Zadaci_23_02_2017;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ZadatakBr4_trenutno_vrjeme {

	public static void main(String[] args) {
		System.out.println("Trenutno vrjeme: "+ispisiTrenutnoVrjeme());
	}

	public static String ispisiTrenutnoVrjeme() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}
}
