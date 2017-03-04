package Zadaci_03_03_2017;

import java.util.concurrent.TimeUnit;

public class ZadatakBr1_Time {

	public static void main(String[] args) {
		Time obj1 = new Time();

		System.out.println("Current time: " + obj1.getHour() + ":"
				+ obj1.getMinute() + ":" + obj1.getSecond());
		int elapsedTime = 555550000;
		Time obj2 = new Time(elapsedTime);

		System.out.println("If the elapsed time is " + elapsedTime
				+ "  milliseconds, the hour is " + obj2.getHour()
				+ ", the minute is " + obj2.getMinute()
				+ ", and the second is " + obj2.getSecond() + ".");
	}

}

// Klasa sa tri atributa
class Time {
	private long second;
	private long minute;
	private long hour;

	// no arg konstruktor koji racuna trenutno vrjeme
	public Time() {
		long milisekunde = System.currentTimeMillis();
		long ukupnoSekundi = TimeUnit.MILLISECONDS.toSeconds(milisekunde);
		second = ukupnoSekundi % 60;
		minute = (ukupnoSekundi / 60) % 60;
		hour = (ukupnoSekundi / (60 * 60)) % 24 + 1;
	}

	public Time(long elapsedTime) {
		setTime(elapsedTime);
	}

	// Konstruktor sa specificnim satima, min i sec

	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// met koja postavlja vrjeme za objekat prosledjeno vrjeme u milisekundama.

	public void setTime(long elapsedTime) {
		long totalSeconds = elapsedTime / 1000;
		this.second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		this.minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		this.hour = totalHours % 24;
	}

	// get metod za sat.

	public long getHour() {
		return hour;
	}

	// Get metod za minute.

	public long getMinute() {
		return minute;
	}

	// Get metod za sekunde

	public long getSecond() {
		return second;
	}

}
