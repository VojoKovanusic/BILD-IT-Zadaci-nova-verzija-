package Zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadatakBr5_IllegalArgumentException {

	public static void main(String[] args) {

		/**
		 * 12.4 (IllegalArgumentException) Modify the Loan class in Listing 10.2
		 * to throw IllegalArgumentException if theloan amount, interest rate, or
		 *  number of years is less than or equal to zero.
		 */
		
		Scanner input = new Scanner(System.in);
		double amount, interestRate;
		int numberOfYears;
		
		try {
			System.out.println("Unesite iznos, godisnju kamatnu stopu, broj godina: ");
			amount = input.nextDouble();
			interestRate = input.nextDouble();
			numberOfYears = input.nextInt();
			
			Loan obj= new Loan(interestRate, numberOfYears, amount);
			System.out.println(obj.toString());
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());

		}
		catch (InputMismatchException e) {
			System.out.println("Unos nije validan");
		}
		
		input.close();
	}
}
