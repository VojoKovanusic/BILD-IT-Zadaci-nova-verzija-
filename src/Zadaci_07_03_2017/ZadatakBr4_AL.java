package Zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Date;

public class ZadatakBr4_AL<Obj> {

public static void main(String[] args) {
		
		Circle circle = new Circle();
		Loan loan = new Loan();
		Date date = new Date();
		String s = "Nekakv tekst u stingu";
		
		ArrayList<Object> list = new ArrayList<>();
		list.add(circle);
		list.add(loan);
		list.add(date);
		list.add(s);
		
		for(Object o : list)
			System.out.println(o);
	}

}