package Zadaci_02_03_2017;

//klasa fan sa trazenim atributima
public class Fan {
	private int spead;
	private boolean on;
	private double radius;
	private String color;

	// atributi koji su konstatni, tj konacni ne mogu se mjenjati
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;

	// geteri i seteri
	public Fan() {
		spead = SLOW;
		on = false;
		radius = 5;
		color = "blue";

	}

	public int getSpead() {
		return spead;
	}

	public void setSpead(int spead) {
		this.spead = spead;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn() {
		this.on = true;
	}

	public void setOff() {
		this.on = false;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSLOW() {
		return SLOW;
	}

	public int getMEDIUM() {
		return MEDIUM;
	}

	public int getFAST() {
		return FAST;
	}

	@Override
	public String toString() {
		// u slucaju da je upaljen ispisace se:
		if (isOn()) {
			return "Fan spead=" + spead + ", on=" + on + ", radius=" + radius
					+ ", color=" + color;
		}
		// u slucaju da je ugasen ispisace se:
		else
			return "Fan is off; radius=" + radius + ", color=" + color;
	}
}
