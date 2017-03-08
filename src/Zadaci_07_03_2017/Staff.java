package Zadaci_07_03_2017;

public class Staff extends Employee {
	// Data Fields
	private String title;

	// konstructor za Staff objekat
	public Staff(String name, String address, String phone, String email,
			int office, double salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

 
	public String getTitle() {
		return title;
	}

 
	public void setTitle(String title) {
		this.title = title;
	}

	
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}