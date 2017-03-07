package Zadaci_06_03_2017;

import java.util.Arrays;

public class MyString {
	public char[] value; // niz koji ce primati karaktere
	public int size; // broj karaktera u nizu

	//Konstructor koji kopira prosledjeni argument niza , u atribut value 
	public MyString(char[] chars) {
		this.size = chars.length;
		this.value = Arrays.copyOf(chars, size);
	}

	// metoda koja vraca broj akraktera
	public int length() {
		return this.size;

	}

	// metoda koja pronalazi karakter na prosledjenom indeksu
	char charAt(int index) {
		if ((index < 0) || (index >= size)) {
			System.out.println("Nedostupan index.");
			return ' ';
		} else {
			return this.value[index];
		}
	}

	// vraca substring zavisno od parametra koji mu prosledimo

	public MyString substring(int begin, int end) {
		char[] chars = new char[end - begin];
		for (int i = 0, j = begin; i < chars.length && j < end; i++, j++) {
			chars[i] = this.value[j];
		}
		return new MyString(chars);
	}

	// metoda koja konvertuje karaktere u mala slova

	public MyString toLowerCase() {
		char[] chars = new char[this.length()];
		for (int i = 0; i < this.length(); i++) {
			chars[i] = Character.toLowerCase(this.charAt(i));
		}

		return new MyString(chars);
	}

	// provjerava da li su dva stringa ista, ko jesu vraca true u suprotnom
	// false

	public boolean equals(MyString s) {
		if (this.length() != s.length()) {
			return false;
		}
		for (int i = 0; i < this.length(); i++) {
			if (this.charAt(i) != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	/*konvertuje  integer u string
	return je new MyString1 instanca sa konvertovanim brojem u karaktere*/
	
	public static MyString valueOf(int i) {
		int numberOfDigits = 0;
		int number = i;

		// racuan br cifara u unesenom integeru
		while (i > 0) {
			i /= 10;
			numberOfDigits++;
		}

		// char niz koji prima onoliko elelmenata koliko i uneseni br ima  cifara
		char[] chars = new char[numberOfDigits];

		// dodaje sve cifre 
		
		for (int j = chars.length - 1; j >= 0; j--) {
			if (number < 10) {
				chars[j] = (char) ('0' + number);
			} else {
				chars[j] = (char) ('0' + number % 10);
				number /= 10;
			}
		}

		
		return new MyString(chars);
	}


	public String toString() {
		String str = "";
		for (int i = 0; i < this.length(); i++) {
			str += this.charAt(i);
		}

		return str;
	}

	//testiranje
	public static void main(String[] args) {

		char[] c1 = { 'k', 'o', 's', 'a', 'r', 'k' , 'a'};
		MyString s1 = new MyString(c1);
		System.out.println("Testiranje konstruktora: " + s1.toString());

		MyString s2 = valueOf(1982);
		System.out.println("Testiranje metode valueOf 1982: " + s2.toString());

		char character = s1.charAt(2);
		System.out.println("Testiranje charAt,"+ s1+", index 2: "
				+ character);

		MyString substr = s1.substring(0, 4);
		System.out.println("Testiranje substringa(0,4): "
				+ substr);

		MyString s3 = new MyString(new char[] { 'K', 'o', 'S', 'A', 'r', 'k',
				'A' });
		System.out.println("str 3: " + s3.toString());
		MyString lowercase = s3.toLowerCase();
		System.out.println("Testiranje toLowerCase sa Stringom str 3: " + lowercase);
		System.out.println("Testiranje duzine  stringa str 3: " + s3.length());

		char[] c2 = { 'k', 'o', 's', 'a', 'r', 'c' , 'i'};
		MyString s4 = new MyString(c2);
		System.out.println("String 1: " + s1.toString());
		System.out.println("String 4: " + s4.toString());
		System.out.println("Testing equals na str 1 i str 4: "
				+ s1.equals(s4));
	}

}