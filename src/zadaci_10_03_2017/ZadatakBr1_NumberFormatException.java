package zadaci_10_03_2017;

public class ZadatakBr1_NumberFormatException {

	public static void main(String[] args) {

		int n;

		try {
			n = bin2Dec("1234");
			System.out.println(n);
		} catch (NumberFormatException nfe) {
			System.out.println("Cifre u stringu moraju biti samo 0 ili 1");
		}

	}

	// metoda mjenja binarni broj u decimalno
	public static int bin2Dec(String binaryString) {

		int num = 0;
		for (int i = 0, j = binaryString.length() - 1; i < binaryString
				.length(); i++, j--) {

			int n = (int) (binaryString.charAt(j) - '0');

			if (n != 0 && n != 1) {
				throw new NumberFormatException();
			} else if (n == 1) {
				num += Math.pow(2, i);
			}
		}

		return num;
	}

}