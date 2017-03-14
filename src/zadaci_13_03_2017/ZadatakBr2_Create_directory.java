package zadaci_13_03_2017;

import java.io.File;
import java.util.Scanner;

public class ZadatakBr2_Create_directory {
	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {
		napraviDirectory();

	}

	private static void napraviDirectory() {

		System.out.println("Enter a directory name:");
		String imeDir = unos.next();
		
		if (new File(imeDir).mkdirs()) {
			System.out.println("“Directory "+imeDir+" created successfully” ");
		} else
			System.out.println("“Directory "+imeDir+" alredy exists” ");
	}

}
