package Zadaci_02_03_2017;



public class Zadatak_1_Fan {
	/*
	 * Write a test program that creates two Fan objects. Assign maximum speed,
	 * radius 10, color yellow, and turn it on to the first object. Assign
	 * medium speed, radius 5, color blue, and turn it off to the second object.
	 * Display the objects by invoking their toString method.
	 */
	public static void main(String[] args) {
		//instanciran objekat klase Fan
		Fan fan1 = new Fan();

		fan1.setSpead(fan1.getFAST());
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn();
		//ispis i pozivanje toString metode
		System.out.println(fan1.toString());
		
		//instanciran objekat klase Fan
		Fan fan2 = new Fan();
		fan1.setSpead(fan2.getMEDIUM());
		fan1.setRadius(5);
		fan1.setColor("blue");
		fan1.setOff();

		System.out.println(fan2.toString());

	}

}
