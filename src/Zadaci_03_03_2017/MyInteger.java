package Zadaci_03_03_2017;

 //klasa sa jednim atributom
public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}
//dohvati vrjednost
	public int getValue() {
		return value;
	}
//da li je paran
	public boolean isOdd() {
		if (getValue() % 2 == 0)
			return true;
		return false;
	}
//da li je neparan
	public boolean isEven() {
		return (!isOdd());
	}
//da li je prost
	public boolean isPrime() {
		for (int number = 2; number < getValue(); number++) {
			if (getValue() % number == 0)
				return false;
		}
		return true;
	}
//da li je parametar paran
	public static boolean isOdd(int number) {
		if (number % 2 == 0)
			return true;
		return false;
	}
	//da li je parametar ne paran
	public static boolean isEven(int number) {
		return (!isOdd(number));
	}
	//da li je parametar prost
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
	//da li je vrjednost(atribut) prosledjenog objekta parna
	public static boolean isOdd(MyInteger integer) {
		if (integer.getValue() % 2 == 0)
			return true;
		return false;
	}

	public static boolean isEven(MyInteger integer) {
		return (!isOdd(integer.getValue()));
	}

	public static boolean isPrime(MyInteger integer) {
		for (int i = 2; i < integer.getValue(); i++) {
			if (integer.getValue() % i == 0)
				return false;
		}
		return true;
	}
//da li je vrjednost atributa objekta jednaka prosledjenom argumentu
	public boolean equals(int number) {
		if (getValue() == number)
			return true;
		return false;
	}
//..jednaka prosledjenom arg.
	public boolean equals(MyInteger integer) {
		if (integer.getValue() == getValue())
			return true;
		return false;
	}

	// konvertovanje niza karaktera u integer
	public static int parseInt(char[] ch) {
		String str = String.valueOf(ch);
		int number = Integer.valueOf(str);
		return number;
	}

	// konvertovanje stringa u integer
	public static int parseInt(String str) {
		return Integer.valueOf(str);
	}
}
