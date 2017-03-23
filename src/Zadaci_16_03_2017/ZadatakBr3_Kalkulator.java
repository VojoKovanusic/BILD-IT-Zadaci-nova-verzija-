package Zadaci_16_03_2017;


public class ZadatakBr3_Kalkulator {
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Program accepts only one argument.");
			System.exit(0);
		} else {
			// splitting argument string by spaces to get opperands and
			// operation
			String[] operandsAndOperation = args[0].split(" ");
			String firstOperand = operandsAndOperation[0]; // string which
															// contains first
															// rational number
			String operation = operandsAndOperation[1]; // string which contains
														// operation between two
														// rational numbers
			String secondOperand = operandsAndOperation[2]; // string whivh
															// contains second
															// rational number

			// numerator of the first rational number is the number in front of
			// the "/" sign in firstOperand string
			int numeratorFirst = Integer.parseInt(firstOperand.split("/")[0]);
			// denominator of the first rational number is the number after the
			// "/" sign in firstOperand string
			int denominatorFirst = Integer.parseInt(firstOperand.split("/")[1]);
			// first rational number
			Rational rationalOne = new Rational(numeratorFirst,
					denominatorFirst);

			// numerator of the second rational number is the number in front of
			// the "/" sign in secondOperand string
			int numeratorSecond = Integer.parseInt(secondOperand.split("/")[0]);
			// denominator of the first rational number is the number after the
			// "/" sign in secondOperand string
			int denominatorSecond = Integer
					.parseInt(secondOperand.split("/")[1]);
			// second rational number
			Rational rationalTwo = new Rational(numeratorSecond,
					denominatorSecond);

			Rational result = null; // rational number which represents the
									// result of operation between two rational
									// numbers

			// depanding on the operation in the passed argument, executing the
			// defined operation between two rational numbers
			if (operation.equals("+")) {
				result = rationalOne.dodavanje(rationalTwo);
			} else if (operation.equals("-")) {
				result = rationalOne.oduzimanje(rationalTwo);
			} else if (operation.equals("*")) {
				result = rationalOne.mnozenje(rationalTwo);
			} else if (operation.equals("/")) {
				result = rationalOne.djeljenje(rationalTwo);
			} else {
				System.out.println("Undefined operation!");
				System.exit(0);
			}

			// printing result
			System.out.println(rationalOne.toString() + " " + operation + " "
					+ rationalTwo + " = " + result);
		}

	}

}