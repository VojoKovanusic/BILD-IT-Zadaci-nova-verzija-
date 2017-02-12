package zadaci_09_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr4 {
	/*
	 * 4. Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:
	 * public static void printMatrix(int n) Svaki element u matrici je ili 0
	 * ili 1, generisan nasumièno. Napisati test program koji pita korisnika da
	 * unese n te ispisuje n x n matricu.
	 */
	public static void main(String[] args) {
		System.out.println("Unesite broj, da ispisemo matricu te velicine: ");
		Scanner unos = new Scanner(System.in);
		try{
		//korisnik iz konzole unosi kolika matrica treba da bude
		int brojRedova_Kolona = unos.nextInt();
		
		//validacija, da petlja vrti dok unos ne bude validan
		while(brojRedova_Kolona<=0){
			System.out.println("Broja broj redova i kolona mora biti veci od nule, unesite ponovo  broja redova i kolona: ");
			brojRedova_Kolona = unos.nextInt();
		}
		
		//metodi prosledjujemo argumenat
		printMatrix(brojRedova_Kolona);
	}catch(InputMismatchException e){
		System.out.println("Greska pri unosu, pokusajte ponovo");
		ZadatakBr4.main(args);
	}
	}
	
    //metoda za ispisivanje matrice
	public static void printMatrix(int n) {
		
		//double array koji ce sadrzavati n redova i kolona(tj isti broj)
		int doubleArray[][] = new int[n][n];

		
		//klasicne petlje za ispisivanje 2d niza
		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {

				//pri svakom prolasku kroz petlju biramo novi nasumicni broj
				int nasumicanBr = (int) (Math.round(Math.random()));
				
				//ispis nasumicnog broja
				System.out.print(((doubleArray[i][j] = nasumicanBr) + " "));

			}
			System.out.println();// prelaz u novi red
		}
	}
}
