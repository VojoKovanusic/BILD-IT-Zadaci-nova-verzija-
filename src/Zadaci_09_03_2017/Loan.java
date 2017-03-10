package Zadaci_09_03_2017;

public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	public Loan() {
		this(2.5, 1, 1000);
	}

	/*
	 * u ovom slucaju radimo pomcu kljucne rjeci "throw" prvo dajemo uslov, slucaju
	 * da nije on ispunjen , sa kljucnom rjeci
	 * "throw new IllegalArgumentException",ga hvatamo, usmjeravamo...
	 */
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		if (loanAmount <= 0)
			throw new IllegalArgumentException("Iznos mora biti veci od 0.");
		if (annualInterestRate <= 0)
			throw new IllegalArgumentException(
					"godisnja kamatna stopa mora biti veci od 0.");
		if (numberOfYears <= 0)
			throw new IllegalArgumentException(
					"Broj godina mora biti veci od 0.");

		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		if (annualInterestRate <= 0)
			throw new IllegalArgumentException(
					"godisnja kamatna stopa mora biti veci od 0");
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		if (numberOfYears <= 0)
			throw new IllegalArgumentException("Br godina mora biti veci od 0.");
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		if (loanAmount <= 0)
			throw new IllegalArgumentException("Iznos mora biti veci od 0.");
		this.loanAmount = loanAmount;
	}

	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount
				* monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate,
						numberOfYears * 12)));
		return monthlyPayment;
	}

	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	public java.util.Date getLoanDate() {
		return loanDate;
	}

	@Override
	public String toString() {
		return "Loan [Godisnja kamatna stopa=" + annualInterestRate
				+ ", br goina=" + numberOfYears + ", Iznos=" + loanAmount
				+ ", Vrjeme=" + loanDate + "]";
	}

}