package Zadaci_07_03_2017;

public class Loan {
	//atributi
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	//Default konstruktor
	public Loan() {
		this(2.5, 1, 1000);
	}

	//konstruktor sa cetiri parametra, za sva cetiri atributa
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	//vraca nam annualInterestRate 
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// postavlja annualInterestRate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

 
	public int getNumberOfYears() {
		return numberOfYears;
	}

	 
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	//vraca nam loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	// vraca nam monthlyPayment
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount
				* monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate,
						numberOfYears * 12)));
		return monthlyPayment;
	}

	// izracunava totalPayment
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	public java.util.Date getLoanDate() {
		return loanDate;
	}

	public String toString() {
		return "Loan with amount of: " + getLoanAmount();
	}
}
