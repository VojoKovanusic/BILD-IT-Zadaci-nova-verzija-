package Zadaci16_02_2017;

public class ZadatakBr3DjeljiviSa6i6 {
/*	3. Napišite program koji ispisuje sve brojeve, od 100 do 1000,
 *  10 brojeva po liniji, koji su djeljivi i sa 5 i sa 6. 
 *  Razmak izmeðu brojeva treba biti taèno jedan space. 
*/
	public static void main(String[] args) {
		System.out.println("Brojeve, od 100 do 1000, koji su djeljivi i sa 5 i sa 6 su:\n");
		int brojac=0;
		for (int i = 100; i < 1000; i++) {
			
			 //ako je broj djeljiv sa 5 i 6 ispisi
			if(i%5==0 && i%6==0){
				System.out.print(i+" ");
				brojac++;
				//svaki deseti red prebaci u novi
			}
			if(brojac==10){
				System.out.println();
				brojac=0;
			}
			
		}

	}

	
}
