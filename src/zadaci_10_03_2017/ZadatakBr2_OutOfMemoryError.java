package zadaci_10_03_2017;


public class ZadatakBr2_OutOfMemoryError {

	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("unused")
			int [] niz;
			//izaivamo  prekoracenje memorije
			niz = new int[1000000000];
		}
		//hvatamo prekoracenje , i ispisujemo 
		catch(OutOfMemoryError ex) {
			System.out.println(ex.getMessage());
		}
}

}