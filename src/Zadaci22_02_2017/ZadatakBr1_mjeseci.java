package Zadaci22_02_2017;

public class ZadatakBr1_mjeseci {
	// 1. Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te
	// ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)

	public static void main(String[] args) {
		
		//nasumican broj od 1 do 12
		int index=(int)(1+Math.random()*12);
		
		//niz stringova, prvo mjesto je prazno i ne dolazimo do njega
		String niz[] = { "", "Januar", "Februar", "Mart", "April", "Maj",
				"Jun", "Jul", "Avgust", "Septembar", "Oktobar", "Novembar",
				"Decembar" };
		//ispis nasumicnog broja
		System.out.println(niz[index]);
		
	}
}
