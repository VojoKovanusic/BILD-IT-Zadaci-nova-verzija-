package Zadaci_03_03_2017;

//klasa sa dva atributa
public class MyPoint {
	private double x;
	private double y;

	// konstruktor sa defalt vrjednostima
	public MyPoint() {
		super();
		this.x = 0;
		this.y = 0;
	}

	// kon sa dva parametra
	public MyPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	// vraca nam distacnu od "this tacke" do druge tacke sa specificnim
	// koordinatama, prsledjujemo
	// MyPoint tip podatka

	public double distance(MyPoint anotherPoint) {

		return Math.sqrt(Math.pow((anotherPoint.getX() - this.x), 2)
				+ Math.pow((anotherPoint.getY() - this.y), 2));

	}

	// vraca nam distacnu od "this tacke" do druge tacke sa specificnim
	// koordinatama.
	// prosledjujemo metodi dva int podatka(koordinate)

	public double distance(int x2, int y2) {

		return Math.sqrt(Math.pow((x2 - this.x), 2)
				+ Math.pow((y2 - this.y), 2));

	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public static void main(String[] args) {

		MyPoint tacka1 = new MyPoint(0, 0);

		MyPoint tacka2 = new MyPoint(10, 30.5);

		System.out.println(tacka1.distance(tacka2));

	}

}