package Zadaci_06_03_2017;

import java.util.ArrayList;

public class Split {
	/*
	 * (New string split method) The split method in the String class returns
	 * an array of strings consisting of the substrings split by the delimiters.
	 * However, the delimiters are not returned. Implement the following new
	 * method that returns an array of strings consisting of the substrings
	 * split by the matching delimiters, including the matching delimiters.
	 */

	public static void main(String[] args) {

		String string = "New1string2split3method4";
		String regex = "[0-9]";

		 
		String[] niz = split(string, regex);

		

		for (String s : niz)
			System.out.print(s + " ");

	}

	// Metoda ciji je return niz Stringova sa regex-ima
	
	public static String[] split(String s, String regex) {

		ArrayList<String> list = new ArrayList<>();

		int index = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.substring(i, i + 1).matches(regex)) {
				list.add(s.substring(index, i));
				list.add(s.substring(i, i + 1));
				index = i + 1;
			}
		}

		list.add(s.substring(index, s.length()));

		return list.toArray(new String[list.size()]);
	}
}
