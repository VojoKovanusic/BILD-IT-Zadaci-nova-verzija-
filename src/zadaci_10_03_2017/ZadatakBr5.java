package zadaci_10_03_2017;

import java.io.File;
import java.util.Scanner;

public class ZadatakBr5 {
	static Scanner unos=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite fajl da ispisemo sumu brojeva i prosjek::");
		String filePath = unos.nextLine();
		
		try {
			
			File file = new File(filePath);
			if (file.exists()){
			Scanner in = new Scanner(file);
			
			double sum = 0; 
			int brojac = 0;  
			
	 
			while (in.hasNext()){
				sum +=in.nextDouble();
				brojac++;
			}
			in.close();
			input.close();
			
		
			double suma = sum / brojac;
			
	
			System.out.println("Suma: "+sum);
			System.out.println("Prosjek: "+suma);}
			else System.out.println("Nije nadjen fajl!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}