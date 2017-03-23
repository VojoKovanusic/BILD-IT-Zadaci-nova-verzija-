package Zadaci_15_03_2017;


public class Course implements Cloneable {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		// Left as an exercise in Programming Exercise 10.9
	}

	public void ispisiPodatkeKursa() {
		System.out.println("Ime kursa: " + courseName
				+ "\nBroj studenata koji ga pohadjaju:" + numberOfStudents
				+ "\nStudenti koji pohadjaju:");
		int redniBr = 0;
		for (String student : students) {
			if (student != null) {
				redniBr++;
				System.out.println(redniBr + ")" + student);

			}

		}
	}

	@Override
	public String[] clone() {
		String[] clone = new String[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i] != null) {
				clone[i] = students[i];
			}
		}
		return clone;
	}
	/*
	 * @Override public Object clone() throws CloneNotSupportedException {
	 * return super.clone();
	 * 
	 * }
	 */
}
