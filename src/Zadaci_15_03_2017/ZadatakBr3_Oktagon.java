package Zadaci_15_03_2017;


public class ZadatakBr3_Oktagon {

	public static void main(String[] args) {
		Octagon o1 = new Octagon(5);

		System.out.println(o1.toString());

		Octagon o1Kloniran = o1.clone();

		if (o1.compareTo(o1Kloniran) == 0)
			System.out.println("Oktagoni imaju istu povrsinu od "
					+ o1Kloniran.getArea());
		else
			System.out.println("Oktagoni nemaju istu povrsinu!");

	}

}
