package Zadaci28_02_2017;

import java.util.Date;

public class ZadatakBr4_Acount {

	public static void main(String[] args) {
		Account racun = new Account(1122, 20000);
		racun.setAnnualInterestRate(4.5);
		racun.withdraw(2000);
		racun.deposit(3500);
		System.out.println(racun);
	}

}

class Account {
	// atributi klase
	private int id;
	private double annualInterestRate;
	private double balanc;
	private Date dateCreated;

	// konstruktor sa defalt vrjednostima
	public Account() {
		this.id = 0;
		this.annualInterestRate = 0;
		this.balanc = 0;
		dateCreated = new Date();
	}

	// parametarski konstruktor
	public Account(int id, double balanc) {

		this.id = id;
		this.balanc = balanc;
		dateCreated = new Date();
	}

	// geteri i seteri:

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getBalanc() {
		return balanc;
	}

	public void setBalanc(double balanc) {
		this.balanc = balanc;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (getAnnualInterestRate() / 12 / 100);
	}

	public double getMonthlyInterest() {
		return getBalanc() * getMonthlyInterestRate();
	}

	// deponovanje sredstava na racun
	public void deposit(double deposit) {
		this.balanc += deposit;
		System.out.println("Nakon što ste uplatili : " + deposit
				+ " dolara, stanje na vasem racunu je " + this.balanc);
	}

	// u slucaju da nemamo dovoljno nvca, metoda ogranicava korisnika
	public void withdraw(double w) {
		if (w <= getBalanc()) {
			this.balanc -= w;
			System.out.println("Nakon što ste podigli: " + w
					+ " dolara, stanje na vasem racunu je:" + getBalanc());
		} else
			System.out
					.println("Nemate dovoljno na racuni da bi izvrsili povlacenje vaseg novca");

	}

	// toString , sluzi za ispis
	public String toString() {
		return "\nVaš ID: " + getId() + "\nStanje na vašem racunu iznosi:"
				+ getBalanc() + " dolara." + " Vrjeme pravljenja racuna:"
				+ getDateCreated() + "\n" + "Monthly Interest: "
				+ getMonthlyInterest();
	}
}
