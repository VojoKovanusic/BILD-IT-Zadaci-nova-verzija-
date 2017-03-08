package Zadaci_07_03_2017;

public class Person {
	private String name;
	private String adress;
	private String phoneNumber;
	private String email;

	// konstr. sa svim atributima
	public Person(String name, String adress, String phoneNumber, String email) {
		super();
		this.name = name;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return name + "\n" + adress + "\n" + phoneNumber + "\n" + email + "\n";
	}

}