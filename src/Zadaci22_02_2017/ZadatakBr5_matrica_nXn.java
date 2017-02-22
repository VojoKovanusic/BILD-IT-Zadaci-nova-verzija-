package Zadaci22_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5_matrica_nXn {

	public static void main(String[] args) {
		/*
		 * 5. Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim
		 * headerom: public static void printMatrix(int n). Svaki element u
		 * matrici je ili 0 ili 1, nasumièno generisana. Napisati test program
		 * koji pita korisnika da unese broj n te mu ispiše n x n matricu u
		 * konzoli.
		 */
		
		try{
		System.out.println("Unesite broj kolona i redova koji zelite da matrica ima: ");
		Scanner unos=new Scanner(System.in);
		int n=unos.nextInt();
		
		//u slucaju da korisnik unese negativan br 
		while(n<=0){
			System.out.println("Unesite broj veci od nule!");
			n=unos.nextInt();
		}
		unos.close();
		printMatrix(n);
		//hvatanje potencijalne greske
		} catch (InputMismatchException e) {
			System.out.println("Prekid programa, pogresan unos!");
	}}

	public static void printMatrix(int n) {

		for (int i = 0; i < n; i++) {// petlja za redove
			for (int j = 0; j < n; j++) {// petlja za kolone
				int index = (int) (Math.random() * 2);//nasumican br 0 ili 1
				System.out.print(index + " ");
			}
			System.out.println();

		}
	}

}
