package Zadaci_03_03_2017;

public class ZadatakBr2_Test_MyInteger {

	public static void main(String[] args) {
		
		MyInteger object = new MyInteger(4);

		//Test isEven method
		System.out.println(object.isEven());

		//Test isEven method
		System.out.println(MyInteger.isEven(5));

		//Test isOdd method
		System.out.println(object.isOdd());

		//Test isOdd method
		System.out.println(MyInteger.isOdd(5));

		//Test isPrime method
		System.out.println(object.isPrime());

		//Test isPrime method
		System.out.println(MyInteger.isPrime(7));

		char[] numbers = {'5', '3', '5'};
		//Test parseInt method
		System.out.println(MyInteger.parseInt(numbers));

		//Test parseInt method
		String str = "673";
		System.out.println(MyInteger.parseInt(str));

		//Test isEven(MyInteger number) method
		System.out.println(MyInteger.isEven(new MyInteger(2)));

		//Test isOdd(MyInteger number) method
		System.out.println(MyInteger.isOdd(new MyInteger(2)));

		//Test isPrime(MyInteger number) method
		System.out.println(MyInteger.isPrime(new MyInteger(2)));

	}

}
