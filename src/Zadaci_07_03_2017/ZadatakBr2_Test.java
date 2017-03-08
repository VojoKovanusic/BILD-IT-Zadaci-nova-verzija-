package Zadaci_07_03_2017;

public class ZadatakBr2_Test {
	public static void main(String[] args) {
		// Create a Person, Student, Employee, Faculty, and Staff objects
		Person person = new Person("Marko", "Teslic bb", "065 123-769",
				"marko12@yahoo.com");

		Student student = new Student("Goran", "Doboj bb", "065 726-769",
				"goran@yahoo.com", Student.FRESHMAN);

		Employee employee = new Employee("Sasa", "34 Juzna Pruga",
				"065 726-123", "sas0@teol.com", 14, 1000);

		Faculty faculty = new Faculty("Suza", "28 Stanovi", "065 734-123",
				"sue28@yahoo.com", 24, 1200, "4pm to 6pm", "Profesor");

		Staff staff = new Staff("Tom", "90 Zeljeznicka", "066 987-123",
				"tomica@yahoo.com", 12, 500, "Asistent");

		// pozivi toString metode za Person, Student, Employee, Faculty i Staff
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}