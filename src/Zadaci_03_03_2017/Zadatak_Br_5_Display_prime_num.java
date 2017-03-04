package Zadaci_03_03_2017;

public class Zadatak_Br_5_Display_prime_num {

	// matoda kja ispituje da li je prosledjeni br prost
	private static boolean isPrime(int broj) {

		if (broj <= 1) {
			return false;
		}

		int sqrt = (int) Math.sqrt(broj) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (broj % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		StackOfIntegers stack = new StackOfIntegers();

		for (int i = 1; i <= 120; i++) {

			if (isPrime(i)) {
				stack.push(i);
			}

		}
		// sve dok nije prazan stek, ispisuje
		while (!stack.prazan())
			System.out.print(stack.pop() + " ");

	}

}