package Zadaci_06_03_2017;

import java.util.Arrays;

/**
 * 
 * **10.23 (Implement the String class) The String class is provided in the Java
 * library. Provide your own implementation for the following methods 
 * (name the new class MyString2): 
 * public MyString2(String s); 
 * public int compare(String s); 
 * public MyString2 substring(int begin); 
 * public MyString2 toUpperCase();
 * public char[] toChars(); 
 * public static MyString2 valueOf(boolean b);

 *
 */
public class MyString2 {
	public char[] nizKaraktera; // niz koji ce primati karaktere
	public int duzinaNiza; // broj karaktera u nizu

	//konstruktor
	public MyString2(String s) {
		duzinaNiza = s.length();
		nizKaraktera = new char[duzinaNiza];
		for (int i = 0; i < s.length(); i++) {
			nizKaraktera[i] = s.charAt(i);
		}

	}
	
	//konstruktor sa parametrom char niz
	public MyString2(char[] chars){
		this.duzinaNiza = chars.length;
		this.nizKaraktera = Arrays.copyOf(chars, duzinaNiza);
	}

	//leksografsko poredjnje instance  sa stringom
	 
	
	public int compare(String s) {
		int returnValue = -2;

		if (this.duzinaNiza > s.length()) {
			returnValue = 1;
		} else if (this.duzinaNiza < s.length()) {
			returnValue = -1;
		} else {

			for (int i = 0; i < s.length(); i++) {
				if (this.nizKaraktera[i] > s.charAt(i)) {
					returnValue = 1;
					break;
				} else if (this.nizKaraktera[i] == s.charAt(i)) {
					returnValue = 0;
				} else {
					returnValue = -1;
					break;
				}
			}
			
		}

		return returnValue;

	}
	
	
	//metoda vraca novu instancu  sa  substringom
	 
	public MyString2 substring(int pocetak){
		char[] chars = new char[this.duzinaNiza - pocetak];
		for (int i = 0, j = pocetak; i < chars.length && j<this.duzinaNiza ; i++, j++) {
			chars[i] = this.nizKaraktera[j];
		}
		return new MyString2(chars);
	}
	
	//konvertovanje malih slova u velika
	
	public MyString2 toUpperCase() {
		char[] chars = new char[this.duzinaNiza];
		for (int i = 0; i < this.duzinaNiza; i++) {
			chars[i] = Character.toUpperCase(nizKaraktera[i]);
		}

		return new MyString2(chars);
	}
	
	
	 //dohvatanje niza karaktera od instance
	public char[] toChars(){
		char chars[] = Arrays.copyOf(nizKaraktera, duzinaNiza);
		return chars;
		
	}
	
	//Konvertovanje  boolean vrjednosti  u string
	
	public static MyString2 valueOf(Boolean b){
		if(b == true)
			return new MyString2("true");
		else{
			return new MyString2("false");
		}
	}
	
	//override toString method
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < this.duzinaNiza; i++) {
			str += this.nizKaraktera[i];
		}

		return str;
	}

	//testiranje
	public static void main(String[] args) {
		//testiranje compare
		MyString2 s1 = new MyString2("Kosarka");
		System.out.println("String 1: "+s1.toString());
		System.out.println("Poredjenje stringa 1 sa  stringom \"Kosarka\": "+s1.compare("Kosarka"));
		
		//testiranje substring
		MyString2 s2 = s1.substring(2);
		System.out.println("Substring  stringa 1, od indexa 2: "+s2.toString());
		
		//testiranje valueOf
		MyString2 s3 = valueOf(true);
		System.out.println("valueOf (true): "+s3);
		
		//testiranje toChars() na s1
		char[] chars = s1.toChars();
		System.out.println("Karakteri stringa 1: ");
		for(char c: chars){
			System.out.print(c+" ");
		}
		
		//testiranje toUpperCase()
		MyString2 s4 = new MyString2("testiranje");
		MyString2 s4Upper = s4.toUpperCase();
		System.out.println("\nNew string: "+s4.toString());
		System.out.println("New string toUpperSase: "+s4Upper);
		
	}

}