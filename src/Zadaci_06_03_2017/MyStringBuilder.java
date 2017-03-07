package Zadaci_06_03_2017;

/*(Implement the StringBuilder class) The StringBuilder class is provided
 in the Java library. Provide your own implementation for the following methods
 (name the new class MyStringBuilder1):
 public MyStringBuilder1(String s);
 public MyStringBuilder1 append(MyStringBuilder1 s);
 public MyStringBuilder1 append(int i);
 public int length();
 public char charAt(int index);
 public MyStringBuilder1 toLowerCase();
 public MyStringBuilder1 substring(int begin, int end);
 public String toString();*/

public class MyStringBuilder {

	String str;

	public MyStringBuilder(String s) {
		this.str = s;
	}

	// metoda vraca instancu klase MyStringBuilder, koja u sebi ovaj put sadrzi
	// oba
	// atributa
	// dodana jedna na drugi ( "s" prosledjene instance i this "s")

	public MyStringBuilder append(MyStringBuilder s) {
		return new MyStringBuilder(this.str += s.str);
	}

	// kao i predhodna samo sto se sada prosledjuje integer
	public MyStringBuilder append(int i) {
		return new MyStringBuilder(this.str += i);
	}

	// duzina atributa klase
	public int length() {
		return this.str.length();
	}

	// metoda vraca karakter na proledjenom indexu
	public char charAt(int index) {
		return this.str.charAt(index);
	}

	// konvertuje sve velike karaktere koje atribut klase ma u male

	public MyStringBuilder toLowerCase() {
		return new MyStringBuilder(this.str.toLowerCase());
	}

	// pronalazi i vraca substring u definisanim granicama

	public MyStringBuilder substring(int pocetak, int kraj) {
		String s = "";
		for (int i = pocetak; i <= kraj; i++) {
			s += this.str.charAt(i);
		}
		return new MyStringBuilder(s);
	}

	/** overriden toString() metod */
	@Override
	public String toString() {
		return this.str;
	}

	// test
	public static void main(String[] args) {

		MyStringBuilder str1 = new MyStringBuilder("Vojo");
		System.out.println("Prvi string: " + str1.toString());

		MyStringBuilder str2 = new MyStringBuilder("Kovanusic");
		System.out.println("Drugi string: " + str2.toString());

		System.out.println("Spoji prvi i drugi string: "
				+ str1.append(str2).toString());

		System.out.println("apend(90): " + str1.append(90).toString());

		System.out.println("toLowerCase: " + str1.toLowerCase().toString());

		System.out.println("substring(7,10): "
				+ str1.substring(6, 9).toString());

		System.out.println("length: " + str1.length());

		System.out.println("charAt(5): " + str1.charAt(5));

	}

}