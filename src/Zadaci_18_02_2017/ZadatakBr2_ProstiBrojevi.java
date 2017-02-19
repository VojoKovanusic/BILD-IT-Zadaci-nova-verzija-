package Zadaci_18_02_2017;

public class ZadatakBr2_ProstiBrojevi {
	/*
	 * 2. Napisati program koji ispisuje sve proste brojeve od 2 do 1000,
	 * ukljuæujuæi i 2 i 1000. Program treba da ispiše 8 brojeva po liniji te
	 * razmak izmeðu brojeva treba da bude jedan space.
	 */public static void main(String[] args) {
		 int brojac=0;
		 System.out.println("Svi prosti brojevi od 2 do 1000 su:\n");
	 for (int i = 2; i <= 1000; i++) {
		 if(prostBroj(i)){
			 brojac++;
		 System.out.print(i+" ");}
		 
		 //da predje u novi red kada ispise osam brojeva
		 if(brojac==8){
			 System.out.println();
			 brojac=0;
		 }
		 
		
	}

	}
//metoda koja odma prekida sa radom , ako je broj djljiv sa manjim od sebe
	public static boolean prostBroj(int broj) {
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0)
				return false;

		}
		return true;
	}
}
